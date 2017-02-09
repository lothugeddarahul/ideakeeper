//package testcases;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ideaKeeperEnd2End {
	WebDriver driver =  null;
	private void init() throws InterruptedException{
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
			 driver = new ChromeDriver(); 
			 driver.get("http://localhost:3000");
			 Thread.sleep(2000);
		}
		
	}
    @Test
	public void shouldAcceptNullStringAsAnIdea() throws InterruptedException {
		String checkVal = "";
				init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
     				Thread.sleep(1000);
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("Text added null value below");
			    
			    
	}
	
	@Test
	public void shouldAcceptMoreThanFourtyCharcterStringAsAnIdea() throws InterruptedException {
		String checkVal = "1234567890123456789012345678901234567890123456";
		        init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
				Thread.sleep(1000);
             	            //System.out.println("size is :"+list.size());
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("test passed due to submit button was enabled in ideakeepr application");
			    }
	
	@Test
	public void shouldAcceptTextAddedBelowListAsAnIdea() throws InterruptedException {
		String checkVal = "Text is added on below";
		        init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("Text added below");
			    }
	
	@Test
	public void shouldAcceptTextInTheListAsAnIdea() throws InterruptedException {
		String checkVal = "added Text in the List";
		        init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
		        //setIdeaText(ideaText);
				List<WebElement> list = driver.findElements(By.id("list"));
				Thread.sleep(1000);
			    System.out.println("size is :"+list.size());
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("Item Added");
			    }
		
	@Test
	public void shouldCheckSizesBeforeAndAftersendingList() throws InterruptedException{
		String checkVal = "checking the sizes in list";
		init();
		List<WebElement> list = driver.findElements(By.id("list"));
		System.out.println("size is :"+list.size());   
		driver.findElement(By.name("idea")).sendKeys(checkVal);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> list1 = driver.findElements(By.id("list"));
		Thread.sleep(1000);
		System.out.println("size is :"+list1.size());
		boolean listsize = list.size() != list1.size();
		Assert.assertTrue(listsize);
		System.out.println("test passed for checking sizes");
		System.out.println("checking the sizes of list and view in list");
	}		
}

