package learnJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.driver.chrome", "D:\\chrome_drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		//driver.close();

	}

}
