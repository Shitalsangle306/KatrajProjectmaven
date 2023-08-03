package salesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra1 {
  @Test
  public void myntratest() throws InterruptedException
  {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("myntra opening",true);
<<<<<<< HEAD
	  driver.get("https://www.myntra.com/");
	  //driver.get("https://www.snapdeal.com/");
=======
//	  driver.get("https://www.myntra.com/");
	  driver.get("https://www.snapdeal.com/");
>>>>>>> branch 'master' of https://github.com/Shitalsangle306/KatrajProjectmaven.git
	  Thread.sleep(7000);
	  driver.close();
  }
}