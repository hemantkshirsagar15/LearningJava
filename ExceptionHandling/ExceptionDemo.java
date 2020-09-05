public class ExceptionDemo{
	public static void main(String[] args){
      int i;
	  try{
			i = 10/0;
		} 
		catch(ArithmeticException e){
			System.out.println("Handled Exception");
			i = 10/5 ;
			System.out.println("Value of i => "+ i);
		}
		
	}
}