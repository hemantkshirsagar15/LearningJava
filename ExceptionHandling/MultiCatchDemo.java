public class MultiCatchDemo{
	  int i;
	  try{
			i = 10/0;
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught ArrayIndexOutOfBoundsException Exception");
		}
		catch(NullPointerException e){
			System.out.println("Caught NullPointerException Exception");
		}
		catch(ArithmeticException e){
			System.out.println("Caught Arithmetic Exception");
		}
		catch(Exception e){
			System.out.println("Caught General Exception");
		}
}