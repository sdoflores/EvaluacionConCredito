package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class validaBusquedaDoble {

	WebDriver driver;
	DosBusquedas dosBusquedas;
	String expectedResult="Java | Oracle";
	String actualResult;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		dosBusquedas = new DosBusquedas(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		dosBusquedas.realizarDosBusquedas("Hola mundo","java");
		assertEquals(expectedResult,dosBusquedas.textoQueCompara());
	}

}
