package Question6;

/**
 * @author Arash
 *
 */
public class Staff extends Employee {
	
	//attribute
	protected int payGrade;
	
	//constructor
	public Staff() {
		super();
		payGrade = 0;
	}
	
	//overloaded Constructor
	public Staff(String name, String employeeDepartment, int employeeID, int payGrade) {
		super(name, employeeDepartment, employeeID);
		this.setPayGrade(payGrade);;
	}
	
	/**
	 * @param name
	 * @param employeeDepartment
	 * @param employeeID
	 * @param payGrade
	 */
	public void reset(String name, String employeeDepartment, int employeeID, int payGrade) {
		this.name = name;
		this.employeeDepartment = employeeDepartment;
		this.employeeID = employeeID;
		this.payGrade = payGrade;
	}
	
	/**
	 * @param payGrade
	 */
	public void setPayGrade(int payGrade) {
		if ((1 >= payGrade) && (payGrade <= 20))
			this.payGrade = payGrade;
	}
	
	/**
	 * @return payGrade
	 */
	public int getPayGrade() {
		return payGrade;
	}
	
	/**
	 * @param anotherStaff
	 * @return true if same staff
	 */
	public boolean isSame(Staff anotherStaff) {
		return super.isSame(anotherStaff) && 
			   anotherStaff.payGrade == this.payGrade;
	}
	
	/**
	 * @return overrides toString
	 */
	public String toString() {
		return super.toString() + "\n" +
				"Pay Grade: " + payGrade;
	}
}
