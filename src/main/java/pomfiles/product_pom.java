package pomfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product_pom {

	public WebDriver driver;// this is local driver

	public product_pom(WebDriver rdriver)// remote driver
	{
		// we are going to assing local driver to remote driver
		this.driver = rdriver;// if they have same name in argument use this operator
		PageFactory.initElements(rdriver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"react-type-ahead-normal\"]/fieldset/input")
	WebElement item_pom;

	@FindBy(xpath = "//div[@id=\"react-type-ahead-normal\"]//fieldset//a[contains(@href,'javascript:;') or(@class=\"fg-icon-search\")]  ")

	WebElement fetchitem_pom;

	public void selitem(String pro_name) {
		item_pom.sendKeys(pro_name);
	}

	public void ftc_item() {
		fetchitem_pom.click();

	}

}
