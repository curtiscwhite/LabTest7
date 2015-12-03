
public class Person {
	Date dateOfBirth;
	String name;
	
	public Person(int year, Day day, int num, Month month,
			String name){
		this.name = name;
		this.dateOfBirth = new Date(month, day, num, year);
	}
	
	public void print(){
		System.out.print(name + " was born on " );
		dateOfBirth.print();
	}
}
