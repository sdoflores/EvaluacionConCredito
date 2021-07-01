package com.project.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaConGoogle extends Base {

	By buscador = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By btn_buscar_con_google = By.xpath("//input[@name='btnK'and @aria-label='Buscar con Google']");
	
	public BusquedaConGoogle(WebDriver driver) {
		super(driver);
	}
	
	public void buscarConGoogle(String texto) {
		navegar("https://www.google.com");
		
		ingresarTexto(texto,buscador);
		clic(btn_buscar_con_google);
	}
	
	public String tituloPagina() {
		return obtenerTitulo();
	}
}
