package Selenium006.Selenium666;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HDC2.jan292020.Mydrivers99;

public class NoofLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = Mydrivers99.getDriver("GC");
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(2000);
		
		List<WebElement> T_links= driver.findElements(By.tagName("a"));
		int N_links = T_links.size();
		
		
				
		System.out.println("Total no. of links : "+N_links);
		
		for(int i=0; i<=N_links; i++) {
			String L_text = T_links.get(i).getText();
			System.out.println(i +"th link is : "+L_text);
		}
		
		
		
		
		

	}

}
