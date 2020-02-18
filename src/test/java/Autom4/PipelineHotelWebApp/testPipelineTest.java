package Autom4.PipelineHotelWebApp;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testPipelineTest {


	WebDriver driver = new ChromeDriver();
	String url= "http://192.168.102.133:9999/HotelWebapp/";



	@Before
	public void setup() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test_pipeline( ) {
		driver.get(url);
		WebElement recherche_ville = driver.findElement(By.xpath("//select[@name=\"ville\"]"));
		recherche_ville.click();
		WebElement ville_lumiere = driver.findElement(By.xpath("//option[.='Paris']"));
		ville_lumiere.click();

		WebElement button_submit = driver.findElement(By.xpath("//button"));
		button_submit.click();

		WebElement tableau = driver.findElement(By.xpath("//tbody"));
		System.out.println(tableau.getText());
	}





}
