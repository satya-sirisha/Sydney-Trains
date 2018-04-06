package modules;

import java.io.IOException;

import generalLib.Commonmeths;

public class Traintimetable {
	
	
	public static void Timetable(String line,String direction,String day,String hour,String min) throws IOException {
		Commonmeths.selectbytext("SelectALine", line);
		Commonmeths.selectbytext("SelectADirection", direction);
		Commonmeths.Click("ArriveBefore");
		Commonmeths.selectbytext("ArrivalDay", day);
		Commonmeths.selectbytext("ArrivalHour", hour);
		Commonmeths.selectbytext("ArrivalMinute", min);
		Commonmeths.Click("RememberMe");
		Commonmeths.Click("ViewTimetable");
	}

}
