package ideaKeeper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkNullString {

	public static void main(String[] args) {
		String checkVal = " ";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("size is :"+list.size());
			    System.out.println("empty string added because submit but always enabled in application");

	}
}
