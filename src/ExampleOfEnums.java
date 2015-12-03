import java.util.Scanner;

public class ExampleOfEnums {
	Day day;
	
	public static void main(String args[]){
		//Scanner scan = new Scanner();
		//String dayText = scan.next();
		
		
		Person guy = new Person(2011, Day.MONDAY, 22, Month.JANUARY, 
				"Guy Jones");
		
		guy.print();
	}
	
	public Day getDay(String text){
		if(text.equals("Monday")){
			return Day.MONDAY;
		}
		return Day.SATURDAY;
	}
	public void setDay(Day this_day){
		day = this_day;
	}
}
