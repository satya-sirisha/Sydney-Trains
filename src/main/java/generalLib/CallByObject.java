package generalLib;

import org.openqa.selenium.By;

public class CallByObject {
	static By by;
	public static By getbyproperty(String keyValue) {
		String s=FileUtility.getdesiredproperty(keyValue);
		System.out.println(s);
		String byattribute=s.split(";")[0];
		String byvalue=s.split(";")[1];
		
		if(byattribute.equalsIgnoreCase("id")) {
			by=By.id(byvalue);
		}
		if(byattribute.equalsIgnoreCase("name")) {
			by=By.name(byvalue);
		}
		if(byattribute.equalsIgnoreCase("xpath")) {
			by=By.xpath(byvalue);
		}
        return by;
	}
//	public static void main(String[] args) {
//	System.out.println(getbyproperty("Destinationpoint"));
//	}
}
