package selenuim.hw.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise3 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(5000);
		
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		Thread.sleep(30000);
	


        // Define a WebDriverWait with a timeout (e.g., 10 seconds)
       // WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait for a specific element to be visible
       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#uHkM6 > div > label > input[type=checkbox]")));

        // Perform actions on the element (e.g., click, send keys)
       // element.click();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("nopCommerce demo store. Register")) {
			System.out.println("Page Title is verfied as nopCommerce demo store. Registe");
		} else {
			System.out.println("Page Title is not verfied");
		}
		Thread.sleep(10000);
		//WebElement verifyHuman = driver.findElement(By.cssSelector("#uHkM6 > div > label > input[type=checkbox]"));
		//verifyHuman.click();
		//Thread.sleep(5000);
		
		
		WebElement fGenderRadio = driver.findElement(By.id("gender-female"));
		fGenderRadio.click();
		Thread.sleep(500);
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Sally");
		Thread.sleep(300);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("sally@gamil.com");
		Thread.sleep(500);
		
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("Sally LLC");
		Thread.sleep(500);
		
		
		WebElement newsletterCheck = driver.findElement(By.id("Newsletter"));
		newsletterCheck.click();
		Thread.sleep(500);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123123");
		Thread.sleep(500);
		
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("123123");
		Thread.sleep(500);
		
		WebElement registerBtn = driver.findElement(By.id("register-button"));
		registerBtn.click();
		Thread.sleep(500);
		
		WebElement confirmationMsg = driver.findElement(By.cssSelector("#main > div > div > div > div.page-body"));
		confirmationMsg.getText();
		
		if (confirmationMsg.getText().equals("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		
		tearDown();
	}

}
