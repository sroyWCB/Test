package testproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://charbroil.com");
	}

}
