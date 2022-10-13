public class CanvasAdaptor extends Canvas implements SyllabusGenerationModule {

	/**
	 *  
	 */
	public String getCourseDetails() {
		System.out.println("This will call the getPolicy Function");
		System.out.println(getPolicies());
		return "Fetched Policies and Course Details and uploaded to Canvas";
	}

	public String getPolicies() {
		System.out.println("Fetching policies from Canvas Class and sending out to upload");
		return "Policies Uploaded";
	}

}
