
public class Section extends HelperFunctions {
	
	String day;
	String TA;
	
	Times sectionTime = new Times();
	
	int currentOcc;
	int maxOcc;
	
	Section(String day,String time, int currentOcc, int maxOcc, String TA){
		this.day = day;
		this.currentOcc = currentOcc;
		this.maxOcc = maxOcc;
		this.TA = TA;
		
		Section.addTimes(time, sectionTime);
	}

	int getCurrentOccupancy(){
		return this.currentOcc;
	}
	int getMaxOccupancy(){
		return this.maxOcc;
	}
	String getTA(){
		return this.TA;
	}
}
