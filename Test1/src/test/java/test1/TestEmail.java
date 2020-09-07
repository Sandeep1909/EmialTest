package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEmail {
	
	public static void main(String[] args)  {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Chrome85\\chromedriver_win32\\chromedriver.exe");	
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       String baseUrl = "https://www.facebook.com/";
	       String expectedTitle = "Facebook";
	       String actualTitle = "";
	       driver.get(baseUrl);
	       actualTitle = driver.getTitle();
	       System.out.println(actualTitle);
	       if (actualTitle.equalsIgnoreCase("Facebook – log in or sign up")){
	           System.out.println("TEST PASSED!");
	       } else {
	           System.out.println("TEST FAILED");
	       }
	    
	       
	       driver.close();
	   }
	
	

}
