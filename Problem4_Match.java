import java.util.HashSet;
import java.util.Set;

public class Problem4_Match {
	/*
	* Checks whether the given Person objects are equal or not. It also checks whether the given objects are unique or not.
	* The uniqueness is checked by adding the given Person objects to HashSet and checking whether the size of HashSet is one or not. 
	* If the size of HashSet is one it means they both are duplicates and HashSet has only unique Person Objects.
	* 
	* The Person class needs to override implementation of equals and hashcode methods to perform this method correctly. See Person class for implementation.
	*/
	public boolean doTheyMatch(Person p1, Person p2) {
		//Are they equal?
		Boolean isEqual = p1.equals(p2);
		
		//If I add both to a Set does it enforce uniqueness?
		Set<Person> setPerson = new HashSet<Person>();
		setPerson.add(p1);
		setPerson.add(p2);
		Boolean isUnique = Boolean.FALSE;
		
		if(setPerson.size() == 1){
			isUnique = Boolean.TRUE;
		}
		
		//If both conditions above are true, then return true, else false;
		return (isEqual && isUnique) ? Boolean.TRUE : Boolean.FALSE;
	}
}
