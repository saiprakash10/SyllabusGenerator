public abstract class Instructor implements Syllabus{

	private int syllabusGenerator;

	private Syllabus syllabus;

	public void showSyllabusMenu() {
		
		System.out.println("Show Syllabus Menu is called");
		System.out.println("This will show the menu like ");
		System.out.println("1. Edit Syllabus \n 2. Review Syllabus \n 3. Show Syllabus \n 4. Generate Syllabus");
		
		System.out.println("Calling Generate Syllabus");
		
		GenerateSyllabus();
		
	}

	public void editSyllabus() {

	}

	public void reviewSyllabus() {

	}

	public void showSyllabusLabels() {

	}

	public void GenerateSyllabus() {
		System.out.println("Generating Syllabus");
		
		System.out.println("First it will call few functions(Instructor Builder class) to get instructor details and later the instructor details will be sent to syllabus Generator class");
		
		CurrentModel cm = new CurrentModel();
		
		cm.createSyllabus();
		
		
	}

	public void createSyllabus() {

	}

}
