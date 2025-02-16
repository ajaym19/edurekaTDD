package com.ohrm.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.ohrm.base.OrangeHRMBase;

public class ScreenshotUtility extends OrangeHRMBase {

	public static void captureScreenshot(String tcname) throws IOException {
		String path = "./Screenshot/" + tcname + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(temp, new File(path));
	}
}
