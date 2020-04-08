package com.cts.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	private static WebDriver driver;
	protected static Properties prop;
	 FileInputStream fis;

	public WebDriver launchApp(String browser) {
		
		try {
			fis = new FileInputStream("C:\\Users\\Raja\\git\\nagendra-alahari\\OrangeHRM\\OrangeHRMDemo\\src\\test\\resources\\properties\\configure_property.properties");
			 prop = new Properties();
				prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
//user launch the chrome browser
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} // user launch the firefox browser
		if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// window maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");

		return driver;
	}

	public void quit() {

		driver.quit();
	}

	// To take Screenshots using listeners
	public void getScreenshot(String result) throws IOException {
		System.out.println(driver);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));
	}

}
