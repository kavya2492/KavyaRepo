//import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterjava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\kavya\\chromedriver.exe");
             //ChromeDriver c =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.gmail.com");
		
//		WebElement searchtext= driver.findElement(By.name("q"));
//		searchtext.sendKeys("java");
//		searchtext.clear();
//		searchtext.sendKeys("python");
//		
//		
		
		//without clear()
		
//		searchtext.sendKeys(Keys.CONTROL,"a");
//		
//		searchtext.sendKeys(Keys.BACK_SPACE);
//		searchtext.sendKeys("python");
//		
		
		//goto facebook enter email, password and click login button
		
		//driver.get("https:www.facebook.com");
		
		 //driver.findElement(By.id("email")).sendKeys("kavyasulegaon@gmail.com");
		
	
		
		//driver.findElement(By.id("pass")).sendKeys("kavya123");
		
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.id("pass")).sendKeys("kavya123",Keys.ENTER);
		
		 
		// Copy text from one textbox to another
		 
//		 driver.get("https:www.facebook.com");
//			
//		 WebElement email= driver.findElement(By.id("email"));
//		 
//		 email.sendKeys("kavya@gmail.com");
//				 email.sendKeys(Keys.CONTROL,"a");
//				 email.sendKeys(Keys.CONTROL,"c");
//				// email.sendKeys(Keys.TAB);
//				 //email.sendKeys(Keys.CONTROL,"v");   //this will perform action on email textbox bcoz element is email.
//				 
//				 driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL,"v");
		 
		 
		// to get dimention
		 
//		 driver.get("https:www.facebook.com");
//		
//	 WebElement email= driver.findElement(By.id("email"));
	 
//	 Dimension size= email.getSize();
//	 System.out.println(size);
//	 
//	 int ht= size.getHeight();
//	 int width= size.getWidth();
//			 System.out.println("ht"+ht );
//	 System.out.println("width"+ width );
//	 driver.close();
//	 
	 
	 
	//veryfy textbox are arranged horizontally 
	 
		 driver.get("https:www.facebook.com");
			
	 WebElement email= driver.findElement(By.id("email"));
	 WebElement pass= driver.findElement(By.id("pass")); 
	 WebElement login= driver.findElement(By.cssSelector("input[value='Log In']"));
	 
	 
	 
	 Point email_p= email.getLocation();
	 Point pass_p = pass.getLocation();
			 Point login_p=login.getLocation();
			 
			 
	 int email_y= email_p.getY();
	 
	 
	 int pass_y= pass_p.getY();
	 
	
	 
	 int log_y= login_p.getY();
	 
	 
	 
	 
	 if(email_y==pass_y && pass_y==log_y)
		 
	 {System.out.println("pass");
	 
	 
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	 
	
	 
	 
	 
	 
	 
		 
		 
		 
				 
				 
		 		
	}
	
		
	
	
	
	
	
}
