package selenuim.hw.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		Thread.sleep(500);

		driver.getTitle();
		if (driver.getTitle().equals("Mercury Tours")) {
			System.out.println("Page Title is verfied as Mercury Tours");
		} else {
			System.out.println("Page Title is not verfied");
		}
		
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Sally");
		Thread.sleep(500);

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Ayad");
		Thread.sleep(500);

		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("111-222-3344");
		Thread.sleep(500);

		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("sally@gmail.com");
		Thread.sleep(500);

		WebElement adress = driver.findElement(By.name("address1"));
		adress.sendKeys("123 citrus garden Dr.");
		Thread.sleep(500);

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Tampa");
		Thread.sleep(500);

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("FL");
		Thread.sleep(500);

		WebElement zipcode = driver.findElement(By.name("postalCode"));
		zipcode.sendKeys("33232");
		Thread.sleep(500);

		WebElement country = driver.findElement(By.name("country"));

		Select selectObj = new Select(country);
		selectObj.selectByValue("UNITED STATES");
		Thread.sleep(500);

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("sallyAAA");
		Thread.sleep(500);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123123");
		Thread.sleep(500);

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("123123");
		Thread.sleep(500);

		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		Thread.sleep(500);

		WebElement confirmation = driver.findElement(By.cssSelector(
				"body > div:nth-child(6) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td"));
		confirmation.getText();
		System.out.println(confirmation.getText());
		Thread.sleep(300);

		if (confirmation.getText().contains("Thank you for registering")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		tearDown();
	}

}
