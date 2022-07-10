package testcases;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import pomfiles.product_pom;

public class product_testcase extends base_file {

	@Test
	public void product_test1() throws IOException

	{

		product_pom pp1 = new product_pom(driver);

		pp1.selitem(item_base);

		pp1.ftc_item();
		System.out.println(driver.getTitle());

		String expectedHeading = "Genta™ Single Handle Centerset Bathroom Sink Faucet with Pop-Up Drain Assembly in Brushed Nickel";
		String heading = driver.findElement(By.xpath("//*[@class=\"product__name\"]")).getText();
		System.out.println(heading);
		String expectedpartid = "Part #M6702BN";
		String item_id = driver
				.findElement(By.xpath("//*[@id=\"wrapper\"]/main/div/div/div[2]/div[2]/div[1]/div/p/span[1]"))
				.getText();
		System.out.println(item_id);

		if (expectedHeading.equalsIgnoreCase(heading) || expectedpartid.equalsIgnoreCase(item_id))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);

	}

}