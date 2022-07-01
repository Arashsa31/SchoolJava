/**
 * @author Arash 
 *
 */
public class School {
	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0] = new Faculty("Cotty, Manny", "Computer Science", 998564, "Instructor");
		people[1] = new Staff("Kick, Anita", "Call Center", 785426, 3);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);

		for (Person p : people) {
			System.out.print(p.toString());
			System.out.println();
			System.out.println();
		}
	}
}
