package com.regis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteAutomatizado {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://regisyamamoto.com.br/selenium/"); // Abre a URL
		Thread.sleep(2000);
		
		// text
		WebElement nome = driver.findElement(By.id("nome")); // Procura o elemento HTML pelo id
		nome.sendKeys("R�gis Yamamoto"); // Preenche o campo
		Thread.sleep(2000);
		
		// radio
		WebElement sexo = driver.findElement(By.xpath("//input[@value='feminino']")); // Seleciona o radio pelo value
		sexo.click();
		Thread.sleep(2000);
		
		// select/option
		Select transporte = new Select(driver.findElement(By.name("transporte")));
		transporte.selectByVisibleText("carro");
		transporte.selectByIndex(2); // Seleciona a segunda op��o do option
		Thread.sleep(2000);
		
		// textarea
		WebElement mensagem = driver.findElement(By.id("mensagem"));
		mensagem.sendKeys("Eles realizavam uma fiscaliza��o em �rea de garimpo perto da Terra Ind�gena Ituna/Itat�, quando foram surpreendidos por tiros vindos da mata. A Pol�cia Federal revidou. Ningu�m ficou ferido.");
		Thread.sleep(2000);
		
		// checkbox
		driver.findElement(By.id("tv")).click();
		driver.findElement(By.id("celular")).click();
		Thread.sleep(2000);
		
		// file
		WebElement arquivo = driver.findElement(By.id("arquivo"));
		arquivo.sendKeys("C:\\Workspace\\selenium\\paisagem.jpg");
		Thread.sleep(2000);
		
		// button
		nome.submit(); // Clica no bot�o
		Thread.sleep(3000);
		
		//driver.close(); // Fecha a aba do navegador
		driver.quit(); // Fecha o navegador

		
	}

}
