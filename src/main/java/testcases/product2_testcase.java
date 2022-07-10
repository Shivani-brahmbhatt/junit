package testcases;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class product2_testcase extends base_file

{

	@Test
	public void product_test2() throws Throwable

	{
		//entire code is in try and catch block because StaleElementReferenceException was keep coming

		driver.get("https://www.ferguson.com/category/bathroom-plumbing/bathroom-faucets/bathroom-sink-faucets/_/N-zbq4i3");
		try {
			List<WebElement> allElement = driver
					.findElements(By.xpath("//*[@id=\"wrapper\"]/main/div/div/div[2]/div/div[9]/ul/li"));
			System.out.println(allElement.size());
			// driver.get(driver.getCurrentUrl());
			realshot(driver, "test page problem");
			String expectedHeading = "Pfister Pfirst Series™ Single Handle Monoblock Bathroom Sink Faucet in Polished Chrome";
			// Pfister Pfirst Series™ Single Handle Monoblock Bathroom Sink Faucet in
			// Polished Chrome
			String[] linkTexts = new String[allElement.size()];
			int i = 1;
			for (WebElement e : allElement)

			{
				linkTexts[i] = e.getText();
				System.out.print(i + " " + linkTexts[i] + "\n");
				WebElement strValue = driver
						.findElement(By.xpath("//*[@id=\"wrapper\"]/main/div/div/div[2]/div/div[9]/ul/li[2]"));
				strValue.click();
				driver.findElement(By.xpath("//*[@id=\"singleSkuForm\"]/div[2]/div[2]/input[9]")).click();
				driver.findElement(By.xpath("//div//a[@class=\"js-cartitem-count cartitem-count cart-none-item\"]"))
						.click();
				// realshot(driver,"test page problem");

				WebElement heading = driver.findElement(By.xpath("//*[@id=\"item-datas\"]/li[1]/div[3]/div[2]/div/a"));

				System.out.print(i + " " + heading.getText());
				String ww = heading.getText();

				if (expectedHeading.equals(ww)) {
					assertEquals(expectedHeading, ww);
					System.out.println("Strings are equal");
				} else {
					System.out.println("Strings are NOT equal");
				}
			}
			i++;
		}
		
		catch (StaleElementReferenceException e1) {
			List<WebElement> allElement = driver
					.findElements(By.xpath("//*[@id=\"wrapper\"]/main/div/div/div[2]/div/div[9]/ul/li"));
			System.out.println(allElement.size());
			// driver.get(driver.getCurrentUrl());
			realshot(driver, "test page problem");
			String expectedHeading = "Pfister Pfirst Series™ Single Handle Monoblock Bathroom Sink Faucet in Polished Chrome";
			// Pfister Pfirst Series™ Single Handle Monoblock Bathroom Sink Faucet in
			// Polished Chrome
			String[] linkTexts = new String[allElement.size()];
			int i = 1;
			for (WebElement e : allElement)

			{
				linkTexts[i] = e.getText();
				System.out.print(i + " " + linkTexts[i] + "\n");
				WebElement strValue = driver
						.findElement(By.xpath("//*[@id=\"wrapper\"]/main/div/div/div[2]/div/div[9]/ul/li[2]"));
				strValue.click();
				driver.findElement(By.xpath("//*[@id=\"singleSkuForm\"]/div[2]/div[2]/input[9]")).click();
				driver.findElement(By.xpath("//div//a[@class=\"js-cartitem-count cartitem-count cart-none-item\"]"))
						.click();
				// realshot(driver,"test page problem");

				WebElement heading = driver.findElement(By.xpath("//*[@id=\"item-datas\"]/li[1]/div[3]/div[2]/div/a"));

				System.out.print(i + " " + heading.getText());
				String ww = heading.getText();

				if (expectedHeading.equals(ww)) {
					assertEquals(expectedHeading, ww);
					System.out.println("Strings are equal");
				} else {
					System.out.println("Strings are NOT equal");
				}
			}i++;
		}

	}
}