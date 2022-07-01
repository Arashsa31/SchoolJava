/**
 * @author Arash
 * 
 */

public class Undergraduate extends Student{
	
	//attribute
	protected int level;
	
	//constructor
	public Undergraduate() {
		super();
		level = 0;
	}
	
	//overloaded constructor
	public Undergraduate(String name, int studentNumber, int level) {
		super(name, studentNumber);
		this.level = level;
	}
	
	/**
	 * @param newName
	 * @param newStudentNumber
	 * @param newLevel
	 */
	public void reset(String name, int studentNumber, int level) {
		super.reset(name, studentNumber);
		this.level = level;
	}
	
	/**
	 * @return level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * @param newLevel
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @param anotherUndergraduate
	 * @return
	 */
	public boolean isSame(Undergraduate anotherUndergraduate) {
		return  super.isSame(anotherUndergraduate) && 
			    anotherUndergraduate.level == this.level;
	}
	
	/**
	 * @return overrides toString
	 */
	public String toString() {
		String standing = "";
		switch (level) {
		case 1:	standing = "Freshman";       break;
		case 2:	standing = "Sophomore";	     break;
		case 3:	standing = "Junior";	     break;
		case 4:	standing = "Senior";	     break;
		default:standing = "No Grade Level"; break;
		}
		return super.toString() + "\n" + 
			   "Level: " + standing;
	}
}
