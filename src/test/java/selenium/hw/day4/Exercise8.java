package selenium.hw.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise8 extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement iframe = driver.findElement(By.cssSelector("#singleframe"));
		driver.switchTo().frame(iframe);
		
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
		textField.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement iframeWithin = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframeWithin.click();
		
		
		WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(nestedIframe);
		
		
		
		WebElement iFrameDemo = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(iFrameDemo);
		Thread.sleep(1000);
	
		WebElement textField1 = driver.findElement(By.xpath("//input[@type='text']"));
		textField1.click();

		textField1.sendKeys("Iframe is easy");
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		WebElement homeBtn = driver.findElement(By.xpath("//a[@href='Index.html']"));
		homeBtn.click();
		
		driver.getTitle();
		if (driver.getTitle().equals("Index")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		tearDown();

	}

}
