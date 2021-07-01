package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class Base {

	public WebDriver driver;

	
	public Base(WebDriver driver) {
		this.driver =driver;
	}
	

	//Metodo para buscar un elemento por locator
	public WebElement buscarElemento(By locator) {
		return driver.findElement(locator);
	}
	
	//Metodo para obtener el titulo de la pagina
	public String obtenerTitulo() {
		return driver.getTitle();
	}

	//Metodo para obtener el texto de un WebElement
	public String obtenerTexto(WebElement element) {
		return element.getText();
	}
	
	//Metodo para obtener el texto de un locator
	public String obtenerTexto(By locator) {
		return driver.findElement(locator).getText();
	}
	
	//Metodo para ingresar un texto, referenciado por medio de un locator
	public void ingresarTexto(String inputText, By locator) {
		 driver.findElement(locator).sendKeys(inputText);
	}
	
	public void ingresarTexto(String inputText, WebElement webElement) {
		 webElement.sendKeys(inputText);
	}
	
	//Metodo para dar un clic a un elemento, por medio de un locator
	public void clic(By locator) {
		driver.findElement(locator).click();
	}
	
	//Metodo para verificar que un elemento se encuentra visible
	public Boolean seVisualiza(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException ne ) {
			return false;
		}
	}
	
	//Metodo para obtener la Url y abrir la pagina a la que queremos navegar
	public void navegar(String url) {
		driver.get(url);
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}	
}
