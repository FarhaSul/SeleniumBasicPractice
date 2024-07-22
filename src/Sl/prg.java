package Sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}

}
