package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class validaSegundaPagina {

	WebDriver driver;
	BusquedaSegundaPagina busquedaOtraPagina;
	boolean expectedResult=true;
	boolean actualResult;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		busquedaOtraPagina = new BusquedaSegundaPagina(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		assertEquals(expectedResult,busquedaOtraPagina.validarSegundaPagina("Hola mundo"));
	}

}
