import java.util.ArrayList;

public class HelperFunctions {
	
	static void addDates(String days, ArrayList<String> dates){
		//Parses out each day and adds each individual date to the ArrayList
		for(int i = 0; i <days.length(); i++){
			//if(days.substring(i, i+1) != " "){
				dates.add(days.substring(i, i+1));
			//}
		}
		
	}
	static void addTimes(String times, Times classTimes){
		int breakpoint = times.indexOf('-');

		classTimes.startTime = times.substring(0, breakpoint);
		classTimes.endTime = times.substring(breakpoint+1);
	}
	
	static void addSections(String day, String time, ArrayList<Section> sections){
			;
	}
	
	static Boolean checkIfFull(int max, int curr){
		return curr >= max;
	}
	
}
