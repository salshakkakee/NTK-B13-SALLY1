package selenium.hw.day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DatePickerHW extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {

		selectDate("Jan", "1", "2022");
		selectDate("Feb", "2", "2023");
		selectDate("Mar", "3", "2024");
		selectDate("Apr", "4", "2025");
		selectDate("May", "5", "2026");
		selectDate("Jun", "11", "2027");
		selectDate("Jul", "12", "2028");
		selectDate("Aug", "6", "2030");
		selectDate("Mar", "3", "2029");
		selectDate("Dec", "3", "2022");
		selectDate("Nov", "3", "2021");

	}

	public static void selectDate(String month, String day, String year) throws InterruptedException {

		setUp("edge");
		driver.get("https://jqueryui.com/datepicker/#dropdown-month-year ");

		Thread.sleep(2000);

		driver.switchTo().frame(0);

		WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		Thread.sleep(2000);

		WebElement monthDrop = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		Select monthObj = new Select(monthDrop);

		List<WebElement> monthList = monthObj.getOptions();

		for (WebElement m : monthList) {

			if (m.getText().equals(month)) {

				monthObj.selectByVisibleText(month);
				break;
			}
		}
		Thread.sleep(2000);
		WebElement yearDrop = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		Select yearObj = new Select(yearDrop);

		List<WebElement> yearList = yearObj.getOptions();

		for (WebElement y : yearList) {

			if (y.getText().equals(year)) {

				yearObj.selectByVisibleText(year);
				break;
			}

		}

		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}



