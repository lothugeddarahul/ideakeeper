package ideaKeeper;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listLimit {

	static int i=0;
	public static void main(String[] args) {
		String checkVal = "Text";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
				System.out.println("size is :"+list.size());
				Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
				while(i<=5){
					  System.out.println("the text is Is "+i);    
					 }
			    System.out.println("List size more than 199 also that text should be added in list ");
	}
}
