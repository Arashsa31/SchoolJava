package Question6;

/**
 * @author Arash
 *
 */
public class Faculty extends Employee{
	
	//attribute
	protected String title;
	
	//constructor
	public Faculty() {
		super();
		title = "No title";
	}
	
	//overloaded constructor
	public Faculty(String name, String employeeDepartment, int employeeID, String title) {
		super(name, employeeDepartment, employeeID);
		this.title = title;
	}
	
	/**
	 * @param name
	 * @param employeeDepartment
	 * @param employeeID
	 * @param title
	 */
	public void reset(String name, String employeeDepartment, int employeeID, String title) {
		this.name = name;
		this.employeeDepartment = employeeDepartment;
		this.employeeID = employeeID;
		this.title = title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param anotherFaculty
	 * @return true if same faculty
	 */
	public boolean isSame(Faculty anotherFaculty) {
		return  super.isSame(anotherFaculty) &&
			    anotherFaculty.title.equalsIgnoreCase(this.title);
	}
	
	/**
	 * @return overrides toString
	 */
	public String toString() {
		return super.toString() + "\n" +
				"Title: " + title;
	}

}
