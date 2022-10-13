public class CurrentModel extends Decorator {

	public void createSyllabus() {
		
		System.out.println("The decorator pattern is called.");
		
		System.out.println("This class and function will bind the whole syllabus");
		
		System.out.println("After the binding, syllabus will be sent to Canvas");
		
		CanvasAdaptor ca = new CanvasAdaptor();
		
		System.out.println(ca.getCourseDetails());

	}

}
