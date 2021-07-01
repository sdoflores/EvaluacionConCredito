package com.project.pom;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaSegundaPagina extends Base {

	public BusquedaSegundaPagina(WebDriver driver) {
		super(driver);
	}
	
	By buscador = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By btn_buscar_con_google = By.xpath("//input[@name='btnK'  and @aria-label='Buscar con Google']");
	By pagina2 = By.xpath("//a[@aria-label='Page 2' and @class='fl']");	
	By titulo_compara = By.xpath("//h3");
	String titulo1;
	String titulo2;
	
	
	public boolean validarSegundaPagina(String texto) {
		   navegar("https://google.com");
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   ingresarTexto(texto,buscador);
		   clic(btn_buscar_con_google);
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		   titulo1 = obtenerTexto(titulo_compara);
		   clic(pagina2);
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		   titulo2= obtenerTexto(titulo_compara);
		   
		   if(titulo1.equals(titulo2)!=true) {
			   return true;
		   }else {
			   return false;
		   }		   
	}

}
