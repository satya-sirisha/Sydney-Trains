package generalLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateBrowser {
	static WebDriver driver;
	static WebDriver browserselect(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\choud\\Desktop\\SELENIUM\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\choud\\Desktop\\SELENIUM\\geckodriver\\geckodriver.exe");
			driver=new ChromeDriver();
		}else if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\choud\\Desktop\\SELENIUM\\IEDriverServer.exe");
			driver=new ChromeDriver();
		
		}else {
			System.out.println("wrong browser");
		}
		
      return driver;
		
	}
	
	public void maximizewindow() {
		driver.manage().window().maximize();
		
	}
	public void elementtimeout() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void pageloadtimeout() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	public static void navigateURL() {
		Commonmeths.calldriver().get(FileUtility.getdesiredproperty(Constantvalues.url));
	}
	public static void close() {
		driver.quit();
	}
}
