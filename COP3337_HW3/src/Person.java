public class Person {

	private String name;
	public Person(){
		this("No name" );
	}
	public Person(String name){
		setName(name);

	}
	public Person(Person otherPerson){
		if(otherPerson == null) {
			System.out.println("Error creating Person");
			System.exit(0);
		}
		this.name = otherPerson.name;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		if(name == null) {
			System.out.println("Invalid Name");
			System.exit(0);
		}
		this.name = name;
	}
	public String toString(){
		return "The name is: " + getName();
	}
	public boolean equals(Person otherPerson){
		return getName().equals(otherPerson.getName());
	}


}
