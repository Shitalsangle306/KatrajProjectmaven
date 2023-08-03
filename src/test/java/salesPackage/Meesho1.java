package salesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho1 {
  @Test
  public void meeshotest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("meesho opening",true);
	  driver.get("https://www.meesho.com/");
	 driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
  }
}
