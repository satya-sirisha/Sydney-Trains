package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generalLib.Commonmeths;
import generalLib.InitiateBrowser;
import modules.Traintimetable;

/*Testcase2
 * open browser
 * navigate to url
 * wait for page to load
 * train time table
 * select line
 * select destination 
 * select day and time
 * click on view trip
 */
public class TrainTimetabletestcase {
	
	
	@BeforeMethod
	public static void beforemethod() {
		InitiateBrowser.navigateURL();
		InitiateBrowser.pageloadtimeout();
		
	}
	
	@Test
	
	public static void test() throws IOException {
		Traintimetable.Timetable("T3 Bankstown Line", "City to Liverpool or Lidcombe via Bankstown", "18-Apr-2018 (Wed)", "10","10");
		InitiateBrowser.pageloadtimeout();
		Commonmeths.Takeevidence("TrainTimetable");
	}
	
	@AfterMethod
	public static void afterMethod() {

		//InitiateBrowser.close();

	}

}
