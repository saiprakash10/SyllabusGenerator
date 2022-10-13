public class Facade extends Instructor {

	private String instructorType;

	private String instructorName;

	private String instructorMail;

	public void login() {
		
		System.out.println("Instructor Login Successful");
		System.out.println("This class will fetch all the details of instructor and store in a object.");
		
		System.out.println("After instructor details, it will call functions to generate syllabus");
		
		showSyllabusMenu();
	}
		
		
	public String getPreviousSyllabus() {
		return null;
	}

	public void editSyllabus() {

	}

	public void generateSyllabus() {

	}

	public void publishSyllabus() {

	}

	public void deleteSyllabus() {

	}

	public boolean getDecision() {
		return false;
	}

	public String getLocationDetails() {
		return null;
	}

	public String getClassTimings() {
		return null;
	}

	public String getPolicyDetails() {
		return null;
	}

	public void reviewSyllabus() {

	}

}
