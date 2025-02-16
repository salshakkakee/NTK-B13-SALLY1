package selenuim.hw.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(500);

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("admin");
		Thread.sleep(500);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(500);

		WebElement loginBtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginBtn.click();
		Thread.sleep(500);

		WebElement headerText = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		headerText.getText();
		System.out.println(headerText.getText());
		Thread.sleep(500);

		if (headerText.getText().equals("Dashboard")) {
			System.out.println(headerText.getText() + " is the Header Text");

		} else {
			System.out.println("Dashboard is not the header text");

		}

		tearDown();

	}

}
