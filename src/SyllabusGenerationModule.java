
public interface SyllabusGenerationModule {

	InstructorBuilder instructorBuilder = new InstructorBuilder();

	/**
	 *  
	 */
	public abstract String getCourseDetails();

	public abstract String getPolicies();

}
