package Pack.TestLeaf.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLeaf_TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestLeaf_TestBase() {

		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Testleaf\\eclipse-workspace\\POM_TestLeaf_Project\\src\\main\\"
							+ "java\\Pack\\TestLeaf\\Config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void Setup_Browse() {

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HOME\\git\\" + "PageObjectModel\\POM New Project\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browsername.equals("FF")) {
			driver = new FirefoxDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
