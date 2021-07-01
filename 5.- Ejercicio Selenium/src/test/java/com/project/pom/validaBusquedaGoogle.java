package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class validaBusquedaGoogle {

	WebDriver driver;
	BusquedaImagenes busquedaImagenes;
	Boolean expectedResult=true;
	Boolean actualResult1;
	Boolean actualResult2;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		busquedaImagenes = new BusquedaImagenes(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		
		actualResult1=busquedaImagenes.comprobarVentanaVisual("Hola mundo");
		actualResult2=busquedaImagenes.comprobarCerroVisual();
		
		assertEquals(expectedResult,actualResult1);
		assertEquals(expectedResult,actualResult2);
		
	}

}
