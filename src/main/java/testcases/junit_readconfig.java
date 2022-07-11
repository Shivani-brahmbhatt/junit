package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class junit_readconfig {
	Properties pro;

	public junit_readconfig() {
		try {
			pro = new Properties();
			File src = new File("./propertityfile/config.properties");// first get file in file object

			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("throw exeception" + e.getMessage());
		}
	}

	public String urlcall() {
		String url = pro.getProperty("baseurl1");

		if (url != null)
			return url;
		else
			throw new RuntimeException();

	}

	public String returnchromepath()

	{
		String cpath = pro.getProperty("chromepath");

		return cpath;

	}public String returnfirepath()

	{
		String cpath = pro.getProperty("firefox");

		return cpath;

	}

	public String item1() {
		String iname = pro.getProperty("itemname");
		return iname;
	}

}
