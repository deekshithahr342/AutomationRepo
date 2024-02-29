package learnJava;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class practiceBasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String productName = "ZARA COAT 3";
		System.setProperty("WebDriver.driver.chrome", "D:\\chrome_drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("deekshhr@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("qwerty");
		driver.findElement(By.id("login")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.CopyFiles(src.new File("C:\\Users\\deekshitha.hr\\Desktop\\Screenshot.png"));
		
		
		List<WebElement> products = driver.findElements(By.xpath("//section[@id='products']/div/div[2]/div"));
		if(products.get(1).getText()!=products.get(2).getText()) {
			System.out.println("Test pass");
		} else {
			System.out.println("test fail");
		}
		
		
	 	
		driver.close();
	};

}
