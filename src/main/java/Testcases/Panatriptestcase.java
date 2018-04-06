package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generalLib.Commonmeths;
import generalLib.InitiateBrowser;
import modules.SampleTest;
import modules.Traintimetable;
/*Testcase1
 * open browser
 * navigate to url
 * wait for page to load
 * plan your trip table
 * select starting point
 * select destination point
 * select day and time
 * click on view trip
 */
public class Panatriptestcase {
	
	
	@BeforeMethod
	public void beforemethod() {
		InitiateBrowser.navigateURL();
		InitiateBrowser.pageloadtimeout();
		
	}

	@Test(priority=1)
public void plantrip() throws IOException {
	SampleTest.PlanAtrip("parramatta station,parramatta", "kograh station,kograh","18-Apr-2018 (Wed)", "10", "10");
	InitiateBrowser.pageloadtimeout();
	
	Commonmeths.Takeevidence("PlanTrip");
	
}
//   @Test(priority=2)
//	public static void test() throws IOException {
//		Traintimetable.Timetable("T3 Bankstown Line", "City to Liverpool or Lidcombe via Bankstown", "30-Mar-2018 (Fri)", "10","10");
//		InitiateBrowser.pageloadtimeout();
//		Commonmeths.Takeevidence("TrainTimetable");
//	}
	

@AfterMethod
public void afterTest() {
	//InitiateBrowser.close();
}
}
