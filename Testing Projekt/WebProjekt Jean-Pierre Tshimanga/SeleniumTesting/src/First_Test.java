import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

public class First_Test {
	WebDriver browser;
	private String[] names_array;

	@Test	//Erster Test überprüft den Titel
	public void title_test() {   

		System.out.println("Test 1");																//Firefox geckodriver Pfad     
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		browser = new FirefoxDriver();    
		browser.get("http://192.168.178.39/testing/test_index.html");   							//Webseite zum Testen

		String title = browser.getTitle();
		assertTrue(title.contains("Testing Website"));   									

		browser.close();

	}

	@Test	//zweiter Test überprüft das Ergebnis der Namenseingabe
	public void formfield_test() {   
		System.out.println("Test 2");
		//Firefox geckodriver pfad     
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");		
		browser = new FirefoxDriver();    

		browser.get("http://192.168.178.39/testing/test_index.html");

		WebElement article_vorname = browser.findElement(By.name("vorname"));					//Finden der Textfelder Vorname und Nachname
		WebElement article_nachname = browser.findElement(By.name("nachname")); 

		article_vorname.sendKeys("Jean-Pierre");	
		article_nachname.sendKeys("Tshimanga");													//Eingabe in den Textfeldern
		article_vorname.submit();																//Überprüft den DOM tree auf submit Button deswegen vorname.submit() OK  	
		browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);						//1 Sek warten
		boolean text = browser.getPageSource().contains("alphabetisch");						//Suchen nach dem Wort alphabetisch.
		assertTrue(text);																		//	
		browser.close();
	}

}
