package generalLib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Commonmeths {
	static WebDriver driver;
	public static WebDriver calldriver() {
		if (driver==null) {
	driver=InitiateBrowser.browserselect(FileUtility.getdesiredproperty(Constantvalues.browser));
			
		}
		return driver;
	}
	
	public static WebElement findelement(String keyvalue) {
		InitiateBrowser.pageloadtimeout();
		return calldriver().findElement(CallByObject.getbyproperty(keyvalue));
		}
	public static List<WebElement>  findelements(String keyvalue) {
		InitiateBrowser.pageloadtimeout();
		return calldriver().findElements(CallByObject.getbyproperty(keyvalue));
		}
	public static void SendKeys(String byvalue,String text) {
	 findelement(byvalue).clear();
	 findelement(byvalue).sendKeys(text);;
	}
	public static void selectbytext(String ByKeyValue,String text) throws IOException {
		Select sel=new Select(findelement(ByKeyValue));
		sel.selectByVisibleText(text);
	}
	public static void Click(String ByKeyValue) throws IOException {
		findelement(ByKeyValue).click();
	}
	public static  String Takeevidence(String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) calldriver();
		SimpleDateFormat sf = new SimpleDateFormat("dd##mm##yy hh##mm##ss");
		Date d = new Date();
		String filedestination = System.getProperty("user.dir")+"/ErrorScreenShot/"+picname+sf.format(d)+".png";
		File filedes = new File(filedestination);
		File filetemp = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(filetemp, filedes);
		return filedestination;
	}
	public static void assertTrueMethod(String Keyvalue) {
		Assert.assertTrue(findelement(Keyvalue).isEnabled());
	}
	
 

}
