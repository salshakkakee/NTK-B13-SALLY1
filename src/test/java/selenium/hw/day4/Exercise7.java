package selenium.hw.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise7 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement sLink = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']"));
		sLink.click();
		Thread.sleep(1000);
		
		WebElement alertLink = driver.findElement(By.xpath(" //a[@href='Alert.html']"));
		alertLink.click();
		Thread.sleep(1000);
		
		WebElement interfaceAlert = driver.findElement(By.xpath("//h1[@title='Interface Alert']"));
		interfaceAlert.getText();
		
		if (interfaceAlert.getText().equals("Interface Alert")) {
			System.out.println("Text case Passed");
		} else {
			System.out.println("Text case Failed");
		}
		
		WebElement overview = driver.findElement(By.xpath("//a[@href='../../../index.html']"));
		overview.click();
		Thread.sleep(1000);
		
		WebElement chromeLink = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-summary.html']"));
		chromeLink.click();
		Thread.sleep(1000);
		
		WebElement driverLink = driver.findElement(By.linkText("ChromeDriver"));
		driverLink.click();

		WebElement drivertext = driver.findElement(By.xpath("//h1[@title='Class ChromeDriver']"));
		drivertext.getText();
		Thread.sleep(1000);
		
		if (drivertext.getText().equals("Class ChromeDriver")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		tearDown();
	}

}
