import java.util.ArrayList;

public class Lecture extends HelperFunctions{
	String dept;
	String name;
	String instructor;
	
	int currentOcc;
	int maxOcc;
	
	public ArrayList<String> classDays = new ArrayList<String>(); 
	public Times lectureTimes = new Times();
	public ArrayList<Section> sections = new ArrayList<Section>();
	
	Lecture(String dept, String name, int currentOcc, int maxOcc, String lectureDays, String lectTime){
		this.dept = dept;
		this.name = name;
		
		this.currentOcc = currentOcc;
		this.maxOcc = maxOcc;
		
		addDates(lectureDays, classDays);
		addTimes(lectTime, lectureTimes);
		
	}
	
	void addSection(String day, String time, int max, int curr, String TA ){
		Section newSection = new Section(day, time, max, curr, TA);
		
		sections.add(newSection);
	}
	String getDept(){
		return this.dept;
	}
	String getName(){
		return this.name;
	}
	String getInstructor(){
		return this.instructor;
	}
	int getCurrentOccupancy(){
		return this.currentOcc;
	}
	int getMaxOccupancy(){
		return this.maxOcc;
	}
	Boolean isFull(){
		return checkIfFull(this.maxOcc, this.currentOcc);
	}
}
