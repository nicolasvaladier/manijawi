package com.humanbooster.tedi.projetpremier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testweb {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private final StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://docs.seleniumhq.org/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testWeb() throws Exception {
		driver.get(baseUrl + "/docs/");
		driver.findElement(By.linkText("Test Automation for Web Applications"))
		.click();
		assertEquals(
				"The Documentation Team–Authors Past and Present",
				driver.findElement(
						By.linkText("The Documentation Team–Authors Past and Present"))
						.getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		final String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(final By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (final NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (final NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			final Alert alert = driver.switchTo().alert();
			final String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
