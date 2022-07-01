/**
 * @author Arash
 *
 */
public class Employee extends Person{

	// attribute
	protected String employeeDepartment;
	protected int employeeID;

	// constructor
	public Employee() {
		super();
		employeeDepartment = "No department assigned";
		employeeID = 0;
	}

	// overloaded constructor
	public Employee(String name, String employeeDepartment, int employeeID) {
		super(name);
		this.employeeDepartment = employeeDepartment;
		this.employeeID = employeeID;
	}

	/**
	 * @param name
	 * @param employeeDepartment
	 * @param employeeID
	 */
	public void reset(String name, String employeeDepartment, int employeeID) {
		this.name = name;
		this.employeeDepartment = employeeDepartment;
		this.employeeID = employeeID;
	}

	/**
	 * @return employeeDepartment
	 */
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	
	/**
	 * @return employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeDepartment
	 */
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	/**
	 * @param employeeID
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return overrides toString
	 */
	public String toString() {
		return super.toString() + "\n" + 
				"Department Name: " + employeeDepartment + "\n" + 
				"Employee ID: " + employeeID;
	}

	/**
	 * @param anotherEmployee
	 * @return true if same employee
	 */
	public boolean isSame(Employee anotherEmployee) {
		return   super.isSame(anotherEmployee) && 
				 anotherEmployee.employeeID == this.employeeID   &&
				 anotherEmployee.employeeDepartment.equalsIgnoreCase(this.employeeDepartment);
	}
}
