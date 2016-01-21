
public class Date {
	public Month month;
	public Day day;
	public int number;
	public int year;
	
	public Date(Month month, Day day, int number,
			int year){
		this.month = month;
		this.day = day;
		this.number = number;
		"change here";
		this.year = year;
	}
	
	public void print(){
		printDay();
		printMonth();
		
		System.out.println(number + ", " + year);
	}
	
	public void printMonth(){
		if(month == Month.JANUARY){
			System.out.print("January ");
		}
	}
	
	public void printDay(){
		if(day == Day.MONDAY){
			System.out.print("Monday, ");
		}
	}
}
