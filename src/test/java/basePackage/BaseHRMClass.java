package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class BaseHRMClass {
// browser info WebDriver driver = new ChromeDriver();
	//url info
	//username and password
	
	
public static Properties prop=new Properties();
public static	WebDriver driver;
	
	
	//Step1 - constructor
	public BaseHRMClass() {
	 try {
		FileInputStream file=new FileInputStream("C:\\Users\\DEll\\eclipse-workspace\\Hrmanagement\\src\\test\\java\\environmentvariables\\Config.properties");
prop.load(file);
	 }
	 catch(FileNotFoundException e) {
		 e.printStackTrace();
	 }
	 catch (IOException a) {
		 a.printStackTrace();
	 }
	}
	 //Step2
	 public static void initiation() {
		 //driver path webdriver.chrome.driver 
		 //maximize pageload implicit, getting url
		 // if browser 
		String browsername= prop.getProperty("browser");
		 
		 if (browsername.equals("Firefox")) {
			 System.setProperty("webdriver.geko.driver", "gekodriver.exe");
			 
			 driver=new FirefoxDriver();
		 }
			 else if (browsername.equals("chrome")) {
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				 driver=new ChromeDriver();
			 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
