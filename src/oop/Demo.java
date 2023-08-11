package oop;

//Än mer effektivt är att skapa en "template"/blueprint i en separat klass

class Person {
	//varje person har namn, email och telefonnummer
	String name;
	String email;
	String phone;
	
	//varje person kan gå, äta och sova. Vi gör metoder för detta
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

//and because of this person-class, we don't need all that code in main method
// anymore, see commented code

public class Demo {

	public static void main(String[] args) {
		
		//Now we use the above blueprint.
		//We call the variable person1, which will have all the attributes
		//listed in the class (Person-blueprint)
		//THIS IS CALLED INSTANSIATING AN OBJECT
		//person1 is variable, we point it to the class called Person()
		Person person1 = new Person();
		
		//Define properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "073975094";
		
		//Abstraction. We have person1 object, variable with name, email, phone
		//we also have methods walk, sleep, eat.
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		/*//Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testmail.com";
		String phone = "787789456";
		
		//Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is running");
		
		//What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testmail.com";
		String phone2 = "089046584";
		
		//Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is running");
		
		}
	
	//Enhance by adding functions to minimize code
	static void walking (String name) {
		System.out.println(name + " is walking"); */
	}

}
