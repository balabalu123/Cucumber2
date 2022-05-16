package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver launchBrowser() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notification");

		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		return driver;

	}

	public WebDriver EdgeBrowser() {

		WebDriverManager.edgedriver().setup();

		EdgeOptions opt = new EdgeOptions();

		opt.addArguments("--disable-notification");

		driver = new EdgeDriver(opt);

		driver.manage().window().maximize();

		return driver;

	}

	public WebDriver FireFoxBrowser() {

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions opt = new FirefoxOptions();

		opt.addArguments("--disable-notification");

		driver = new FirefoxDriver(opt);

		driver.manage().window().maximize();

		return driver;

	}

	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void type(WebElement element, String data) {

		element.sendKeys(data);

	}

	public void buttonclick(WebElement element) {

		element.click();

	}

	public void closeBrowser() {
		driver.close();

	}

	public void quitbrowser() {
		driver.quit();

	}

	public String getpageurl() {
		String Url = driver.getCurrentUrl();
		return Url;

	}

	public String getpageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public String gettext(WebElement element) {

		String text = element.getText();
		System.out.println(text);
		return text;

	}

	public void sleep(int data) throws InterruptedException {
		Thread.sleep(data);

	}

	public void getAttribute(WebElement element, String data) {

		String attribute = element.getAttribute(data);

		System.out.println(attribute);

	}

	public void selectbyindex(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);

	}

	public void selectbyvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);

	}

	public void selectbyvisibletext(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);

	}



}
