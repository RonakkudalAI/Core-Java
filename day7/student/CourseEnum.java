package student;

public enum CourseEnum {
	DAC("Post Graduate in Advance Computing"),
	VLSI("Post Graduate in VLSI"),
	DAI("Post Graduate in Artificial Intelligence");

	private String string;
	
	CourseEnum(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return "\nCourse Name: " + this.string;
	}
}
