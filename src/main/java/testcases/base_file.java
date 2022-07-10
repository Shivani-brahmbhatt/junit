package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_file {

	static junit_readconfig read = new junit_readconfig();
	public static String baseurl = read.urlcall();
	public static String browser = read.returnchromepath();

	public String item_base = read.item1();

	public static WebDriver driver;

	@Before
	public void setup() {

		DesiredCapabilities capabilities;
		// Which driver to use?
		capabilities = DesiredCapabilities.chrome();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.ferguson.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

	public void realshot(WebDriver driver, String screenshotname) throws IOException {

		TakesScreenshot screenshot = ((TakesScreenshot) driver);// we are using this driver from base class which must
																// be satatic so we can use
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		String screenshotpath1 = ("C:\\Users\\Shivani\\eclipse-workspace\\junit\\screenshot\\" + screenshotname+ ".png");
		// File dest=new
		// File(System.getProperty("User.dir")+"\\screenshots\\"+screenshotname+".png");
		File dest = new File(screenshotpath1);
		FileUtils.copyFile(src, dest);

		System.out.println(" sucsees in taking screenshot");

	}

}
