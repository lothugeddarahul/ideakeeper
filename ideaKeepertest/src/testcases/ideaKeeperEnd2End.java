//package testcases;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ideaKeeperEnd2End {

	@Test
	public void Should_Accepet_Null_As_String() {
		String sendVal = " ";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.findElement(By.name("idea")).sendKeys(sendVal);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> list = driver.findElements(By.id("list"));
		assertNull(sendVal);
		System.out.println("size is :"+list.size());
		System.out.println("empty string added because submit but always enabled in application");
		
	}
	private static void assertNull(String checkVal) {
		// TODO Auto-generated method stub
		
	}

	
	@Test
	public void Should_Accepet_MoreThan_Fourty_Charcters() {
		String sendVal = "12345678901234567890123456789012345678901234";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				driver.findElement(By.name("idea")).sendKeys(sendVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("size is :"+list.size());
			    Assert.assertEquals(list.get(list.size()-1).getText(),sendVal);
			    System.out.println("test passed due to submit button was enabled in ideakeepr application");
			    }
	
	@Test
	public void Should_Accepet_Text_As_Below_In_List() {
		String sendValue = "Text added below";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				driver.findElement(By.name("idea")).sendKeys(sendValue);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("text is :"+list.get(list.size()-1).getText());
			    Assert.assertEquals(list.get(list.size()-1).getText(),sendValue);
			    System.out.println("Text added below");
			    }
	
	@Test
	public void Should_Accepet_Text_As_Ideakeeper_List() {
		String sendValue = "Text";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				driver.findElement(By.name("idea")).sendKeys(sendValue);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("size is :"+list.size());
			    //System.out.println("text is :"+list.get(list.size()-1).getText());
			    Assert.assertEquals(list.get(list.size()-1).getText(),sendValue);
			    System.out.println("Item Added");
			    }
	
	@Test
	public void Should_Accepet_Text_List_limit_In_Ideakeeper_List() {
		String sendValue = "Make a cool app 7!";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				List<WebElement> list = driver.findElements(By.id("list"));
				System.out.println("size is :"+list.size());   
				driver.findElement(By.name("idea")).sendKeys(sendValue);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list1 = driver.findElements(By.id("list"));
				System.out.println("size is :"+list1.size());
				boolean listsize = list.size() != list1.size();
				Assert.assertTrue(listsize);
				System.out.println("test passed");
				System.out.println("checking the sizes of list and view in list");
		 }
	 }
	
		
		

