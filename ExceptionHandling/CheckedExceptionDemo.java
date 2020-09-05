import java.io.*;

public class CheckedExceptionDemo{
	//main method
	public static void main(String[] args){
		PrintWriter pw;
		try{
			pw = new PrintWriter("abc.txt");
			//write to file
			pw.write("Hello");
			pw.flush();
			
			//close resources
			pw.close();
		}catch(FileNotFoundException e){
			System.out.println("");
		}
		
	}
}