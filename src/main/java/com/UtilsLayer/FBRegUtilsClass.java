package com.UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class FBRegUtilsClass extends BaseClass {
	public void textDateEntered(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public void dpHandle(WebElement wb2, String dpvalue) {
		Select sel = new Select(wb2);
		sel.selectByVisibleText(dpvalue);
		

	}

	public void rdButtonHandle(WebElement wb3) {
		if (wb3.isDisplayed() && wb3.isDisplayed()) {
			wb3.click();
		}
	}

	public static void takesScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\FB_Reg_Framework\\Reg.png");
		FileUtils.copyFile(src, dest);
	}
}
