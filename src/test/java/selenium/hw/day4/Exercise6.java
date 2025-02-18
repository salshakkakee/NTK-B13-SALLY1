package selenium.hw.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.getTitle();
		if (driver.getTitle().equals("Alerts")) {
			System.out.println("the page title is Alerts");
		} else {
			System.out.println("the page title is not Alerts");
		}

		WebElement alertWithTextBox = driver.findElement(By.cssSelector("a[href='#Textbox']"));
		alertWithTextBox.click();

		WebElement promptbox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promptbox.click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Sally");
		alert.accept();
		Thread.sleep(1000);

		WebElement msg = driver.findElement(By.xpath("//p[contains(@id,'demo1')]"));
		msg.getText();
		
		if (msg.getText().contains("How are you today")) {
			System.out.println("message displayed is: " + msg.getText());
		}
		
		driver.navigate().refresh();
		
		
		WebElement alertWithOkAndCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertWithOkAndCancel.click();
		Thread.sleep(1000);
		
		WebElement displayConfirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		displayConfirm.click();
		
		alert.getText();
		if (alert.getText().contains("Press a Button !")) {
			alert.dismiss();		
		} else {
			alert.accept();
		}
		
		WebElement msg2 = driver.findElement(By.xpath("//p[text() = 'You Pressed Cancel']"));
		msg2.getText();
		
		if (msg2.getText().contains("You Pressed")) {
			System.out.println("message displayed is: " + msg2.getText());
		}
		
		
		
		

		tearDown();

	}

}
