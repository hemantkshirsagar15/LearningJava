import java.util.*;

public class CustomExceptionDemo {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks ");
		String mark  = sc.nextLine();
		isQualified(Double.parseDouble(mark));
	}
	
	public static void isQualified(double marks){
		if(marks < 65 ){
			throw new QualifiedException("You are not qualified for an interview");
		} else {
			System.out.println("Congratulations!! you are eligible for an interview");
		}
	}	
	
	
}