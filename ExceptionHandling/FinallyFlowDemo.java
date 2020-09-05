public class FinallyFlowDemo{
	//main method
	public static void main(String[] args){
      int i;
	  try{
		  System.out.println("Statement 1");      //line no 5
		   //i  = 10/0;
		  System.out.println("Statement 2");	  //line no 6
		  System.out.println("Statement 3");      //line no 7
		} 
		catch(ArithmeticException e){
			System.out.println("Statement 4");	  //line no 11
		}
		finally{
			System.out.println("Statement 5");		  //line no 13
		}
		System.out.println("Statement 6");		  //line no 13

	}
}