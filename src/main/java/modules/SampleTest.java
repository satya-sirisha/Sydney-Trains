package modules;

import java.io.IOException;

import generalLib.Commonmeths;
import generalLib.FileUtility;

public class SampleTest {
	
	public static void PlanAtrip(String from,String to,String day,String hours, String min) throws IOException {
	Commonmeths.SendKeys("Startingpoint",from);
	Commonmeths.SendKeys("Destinationpoint",to);
	Commonmeths.Click("arrivebefore");
	Commonmeths.selectbytext("arrivalday", day);
	Commonmeths.selectbytext("arrivalhour", hours);
	Commonmeths.selectbytext("arrivalminute", min);
	Commonmeths.Click("rememberme");
	//Adding assertion
	Commonmeths.assertTrueMethod("viewtrip");
	Commonmeths.Click("viewtrip");
	}
	

}
