import java.io.*;

public class MultiCatchNewVersionDemo{
	  
	  public static void main(String[] args){
	  int i;
	  String s = null;
	  try{
			i = 10/0;
			System.out.println("String length "+ s.length());
		} 
		catch(ArithmeticException |  NullPointerException e){
			System.out.println("Caught Exception "+ e);
		}
		/*catch(ArithmeticException |  Exception e){
			System.out.println("Caught Exception "+ e);
		}*/
	
	  }
}
