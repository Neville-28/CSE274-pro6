import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Name name1 = new Name("Jean", "Smith");
		Name name2 = new Name("Jean", "Smith");
		Name name3 = new Name("Amy", "Jones");
		Name name4 = new Name("Rhonda", "Jones");

		///////////////////////////////////////////////////////////////
		// TODO #1: Implement equals for the Name class.
		// The parameter type should be Object		
		// 15 Points
		System.out.println("These two calls to equals should be true: ");
		System.out.println(name1.equals(name2)); // Should be true
		System.out.println(name1.equals(name1)); // should be true
		
		System.out.println("These two calls to equals should be false: ");
		System.out.println(name1.equals("cat"));
		System.out.println(name1.equals(null)); 
		

		///////////////////////////////////////////////////////////////
		// TODO #2: Implement compareTo for the Name class and make sure 
		// the test cases below work correctly.
		// This should return a negative value because "Jones" comes before
		// "Smith":
		// 15 Points
		System.out.println("should be negative: " + name3.compareTo(name1));
		// This should return a negative value because both have the last name "Jones"
		// but "Amy" comes before "Rhonda"
		System.out.println("should be negative: " + name3.compareTo(name4));
		// This should return a positive value because "Smith" comes after
		// "Jones":
		System.out.println("should be positive: " + name1.compareTo(name3));
		// These should return zero because the two names are equal:
		System.out.println("should be zero: " + name1.compareTo(name2));
		System.out.println("should be zero: " + name2.compareTo(name1));
		
		///////////////////////////////////////////////////////////////
		// TODO #3: Here is a SortedDictionary
		// Like all dictionaries, you add two pieces: a KEY and a VALUE
		// The KEY is what you use to find the VALUE.
		// For example, if you want someone's phone number, you look them up
		// by name (that's the key) so that you can get their number (that's the value).
		DictionaryInterface<Name, String> phoneList = new SortedArrayDictionary<>();
		String first="Amy";
		String last="Young";
		Scanner scn = null;
		String number="513-523-5123";
		Name name=new Name(first,last);
		phoneList.add(name,number);
		System.out.println("This method return nothig since there is no old value in the dictionary");
		
		String first2="Steve";
		String last2="Buscemi";
		String number2="814-454-3695";
		Name nametwo=new Name(first2,last2);
		phoneList.add(nametwo, number2);
		
		
		System.out.println(phoneList.getValue(name));
		
		System.out.println(phoneList.add(name, "513-593-6240"));
		System.out.println("It will return the old value");
		
		phoneList.remove(nametwo);
		phoneList.clear();
		
		
		try {
			scn = new Scanner(new File("phonedata.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(scn.hasNextLine()){
			first=scn.next();
			last=scn.next();
			number=scn.next();
			Name people=new Name(first,last);
			System.out.println(phoneList.add(people, number));
			}
		}

		
		// Amy Young's phone number is 513-523-5123.  Add her to the phoneList.  What does
		// the method return, and why?
		// 10 Points
		
		// Steve Buscemi's phone number is 814-454-3695  Add him to the phoneList.
		// 5 Points
		
		// How do you look up Amy's phone number?
		// 5 Points
		
		// Use the add() method to change Amy's phone number.  What does the method return?
		// 10 Points
		
		// How do you remove Steve from the phoneList?
		// 5 Points
		
		// How do you remove everyone from the phoneList?
		// 5 Points
		
		// TODO #3: phonedata.txt contains 100 lines of phone data.  Add all of them to the
		// phonebook.
		// 30 Points
		
		
	

}
