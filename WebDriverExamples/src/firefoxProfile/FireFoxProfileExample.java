package firefoxProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FireFoxProfileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni profile= new ProfilesIni();
		
		FirefoxProfile myprofile=profile.getProfile("default");
		WebDriver driver = new FirefoxDriver(myprofile);
		driver.get("https://www.facebook.com/");

	}

}
