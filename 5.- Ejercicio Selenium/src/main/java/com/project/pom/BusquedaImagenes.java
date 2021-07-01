package com.project.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaImagenes extends Base {

	By buscador = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By btn_buscar_con_google = By.xpath("//input[@name='btnK'  and @aria-label='Buscar con Google']");
	By link_imagenes = By.xpath("//a[@class='hide-focus-ring' and @data-hveid='CAEQAw']");
	By imagen1 = By.xpath("//img[@jsname='Q4LuWd' and @alt='Hola mundo - Wikipedia, la enciclopedia libre']");
	
	By texto_img_vis = By.xpath("//div[ @class='eYbsle' and text()='Hola mundo - Wikipedia, la enciclopedia libre']");
	By cerrar = By.xpath("//div[@jsname='lZmugf' and @class='YSqQ6e']");
	
	public BusquedaImagenes(WebDriver driver) {
		super(driver);
	}
	
	public boolean comprobarVentanaVisual(String texto) {
		navegar("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   ingresarTexto(texto,buscador);
		   clic(btn_buscar_con_google);
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   clic(link_imagenes);
		   clic(imagen1);
		   if (obtenerTexto(texto_img_vis).equals("Hola mundo - Wikipedia, la enciclopedia libre")) {
			   return true;
		   }else {
			   return false;
		   }
	} 	
	
	public boolean comprobarCerroVisual() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clic(cerrar);
		if(seVisualiza(texto_img_vis)!=true){
			return true;
		}else {
			return false;	
		}
		
	}	
}
