package com.project.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BusquedaConSuerte extends Base {


	By buscador = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By btn_me_siento_con_suerte= By.xpath("//input[@value='Me siento con suerte ' and @name='btnI']");
	By h1_hola_mundo = By.xpath("//h1[@id='firstHeading' and text()='Hola mundo']");

	
	public BusquedaConSuerte(WebDriver driver) {
		super(driver);
	}

	public void buscarConSuerte(String texto) {
		navegar("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ingresarTexto(texto,buscador);
		clic(btn_me_siento_con_suerte);
	}
	
	public String textoQueCompara() {
		return obtenerTexto(h1_hola_mundo);
	}
		
	
	
}
