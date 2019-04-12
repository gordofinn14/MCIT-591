
public class StringBuilderExperiment {

	public static void main(String[] args) {
		String myName = "Gordon Finn";
		// create new StringBuilder object containing myName
		StringBuilder name = new StringBuilder(myName);
		System.out.println(name);
		
		//modify to add "Yes" to end of name StringBuilder
		name.append(" Yes");
		System.out.println(name);
		
		//modify to create a palindrome out of same StringBuilder object
		name.replace(0, name.length(), "racecar");
		System.out.println(name);		
		
	}

}
