package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Demo 
{
  public WebDriver driver;
  
  @Test
  public void brower_opening()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\WebFramework\\ProjectTest\\exefiles\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://148.76.75.203/united_missions/");
	  System.out.println("hello aks");
	  
  }
	
	
}
