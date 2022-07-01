package Question6;

/**
 * @author Arash
 * 
 */

public class Student extends Person {

	// attribute
	protected int studentNumber;

	// constructor
	public Student() {
		super();
		studentNumber = 0;
	}

	// overloaded constructor
	public Student(String name, int studentNumber) {
		super(name);
		this.studentNumber = studentNumber;
	}

	/**
	 * @param name
	 * @param newStudentNumber
	 */
	public void reset(String name, int studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}

	/**
	 * @return studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param newStudentNumber
	 */
	public void setStudentNumber(int newStudentNumber) {
		this.studentNumber = newStudentNumber;
	}

	/**
	 * @return overrides toString
	 */
	public String toString() {
		return super.toString() + "\n" + 
				"ID: " + studentNumber;
	}

	/**
	 * @param anotherStudent
	 * @return true if the same student
	 */
	public boolean isSame(Student anotherStudent) {
		return  super.isSame(anotherStudent) && 
				anotherStudent.studentNumber == this.studentNumber;
	}
}
