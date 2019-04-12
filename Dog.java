
public class Dog {
	// core instance variables for Dog class
	String name;
	String breed;
	int age;
	double weight;
	
	// constructor
	public Dog(String name, String breed) {
		this.weight = 125;
		this.age = 0;
		this.breed = breed;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	// changes the name of the dog to the new name supplied as an argument
	public void rename(String newName) {
		this.name = newName;
	}



	public int getAge() {
		return age;
	}


	// make dog one year early and congratualte
	public void hasBirthday() {
		System.out.println("happy birthday");
		this.age = age + 1;
	}



	public double getWeight() {
		return weight;
	}


	// increases the dog's weight by 0.1 g
	public void eat() {
		this.weight = weight + 0.1;
	}



	public String getBreed() {
		return breed;
	}
	
}
