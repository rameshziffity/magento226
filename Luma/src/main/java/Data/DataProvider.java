package Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class DataProvider {

  public static WebDriver driver;
  public static Properties Prop;
  public static FileInputStream file;
  public static WebDriverWait wait;
  
	    
	public static String Prop(String value) throws Exception {
		
		try{
			Prop = new Properties();
			java.io.File Location=new java.io.File("src/main/java/Data/Data.properties");
			file = new FileInputStream(Location.getAbsolutePath());
			Prop.load(file);
			return Prop.getProperty(value);
		}
		catch(IOException e){
			
		}
		return value;

	}
	@BeforeSuite(alwaysRun=true)
	public static  void Browserselection() throws Exception {
		
		if (Prop("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\swathish\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 30);
			
		} else if (Prop("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 30);
			
		} else {
			System.out.println(Prop("browser"));
			System.out.println("Issue in initializing Web Browser");
		}
		}
}
