package CloudTesting;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class SampleSauceTest {
 
  public static final String USERNAME = "smuvw";
  public static final String ACCESS_KEY = "d759be71-68af-4596-8930-13e5a532d8c1";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  public static void main(String[] args) throws Exception {
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows XP");
    caps.setCapability("version", "43.0");
   
 
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
 
 
   // driver.get("https://saucelabs.com/test/guinea-pig");
    driver.get("https://www.facebook.com/");
    System.out.println("title of page is: " + driver.getTitle());
 
    driver.quit();
  }
}