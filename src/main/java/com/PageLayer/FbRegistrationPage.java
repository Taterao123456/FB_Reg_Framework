package com.PageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.FBRegUtilsClass;

public class FbRegistrationPage extends BaseClass {

	FBRegUtilsClass fbUtil = new FBRegUtilsClass();

	public void fbRegPageData(String firstName, String lastName, String MobileNum, String Password, String doyOfBirth,
			String monthOfBirth, String yearOfBirth) throws InterruptedException, IOException {
		WebElement fname = driver.findElement(By.name("firstname"));
		fbUtil.textDateEntered(fname, firstName);
		WebElement lname = driver.findElement(By.name("lastname"));
		fbUtil.textDateEntered(lname, lastName);
		WebElement MobNum = driver.findElement(By.name("reg_email__"));
		fbUtil.textDateEntered(MobNum, MobileNum);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		fbUtil.textDateEntered(pwd, Password);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		fbUtil.textDateEntered(day, doyOfBirth);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		fbUtil.textDateEntered(month, monthOfBirth);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		fbUtil.textDateEntered(year, yearOfBirth);
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='2']"));
		fbUtil.rdButtonHandle(radioButton);
		WebElement Rbtton = driver.findElement(By.xpath("//input[@type='radio']"));
		// fbUtil.listOfRadioButton();
		fbUtil.takesScreenshot();

	}

	{

	}

}
