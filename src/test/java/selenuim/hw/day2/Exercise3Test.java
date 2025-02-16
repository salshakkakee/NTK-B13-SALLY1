package selenuim.hw.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import utils.Hooks;

public class Exercise3Test extends Hooks {
	 public static void main(String[] args) throws InterruptedException {
	        // Set the path to the msedgedriver executable
	        System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");

	        // Create EdgeOptions and set the detach option
	        EdgeOptions options = new EdgeOptions();
	        options.setCapability("detach", true);

	        // Create a new instance of the Edge driver with the options
	        WebDriver driver = new EdgeDriver(options);

	        driver.get("https://demo.nopcommerce.com/");
	        Thread.sleep(5000);

	        WebElement register = driver.findElement(By.linkText("Register"));
	        register.click();
	        Thread.sleep(3000);

	        driver.getTitle();
	        System.out.println(driver.getTitle());

	        if (driver.getTitle().equals("nopCommerce demo store. Register")) {
	            System.out.println("Page Title is verified as nopCommerce demo store. Register");
	        } else {
	            System.out.println("Page Title is not verified");
	        }
	        Thread.sleep(10000);

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
	        String confirmationText = confirmationMsg.getText();

	        if (confirmationText.equals("Your registration completed")) {
	            System.out.println("TESTCASE PASSED");
	        } else {
	            System.out.println("TESTCASE FAILED");
	        }

	        // Do not call tearDown() if you want to keep the browser open for manual testing
	        // tearDown();
	    }

	    // Dummy tearDown method
	    public static void tearDown() {
	        // Implement tear down logic if needed
	    }
	}