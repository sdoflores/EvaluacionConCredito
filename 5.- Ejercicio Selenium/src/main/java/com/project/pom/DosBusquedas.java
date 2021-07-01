package com.project.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DosBusquedas extends Base{

	By buscador = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By btn_buscar_con_google = By.xpath("//input[@name='btnK'  and @aria-label='Buscar con Google']");
	By btn_lupa = By.xpath("//button[@jsname='Tg7LZd' and @aria-label='Buscar con Google']");
	By texto_busqueda2 = By.xpath("//h3[@class='LC20lb DKV0Md' and text()='Java | Oracle']");
	
	public DosBusquedas(WebDriver driver) {
		super(driver);
	}
	
	public void realizarDosBusquedas(String texto, String texto2) {
		navegar("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ingresarTexto(texto,buscador);
		clic(btn_buscar_con_google);
		   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement buscador1 = driver.findElement(buscador);
		buscador1.clear();
		ingresarTexto(texto2,buscador1);
		clic(btn_lupa);
	}
	
	
	public String textoQueCompara() {
		return obtenerTexto(texto_busqueda2);
	}
	
}
