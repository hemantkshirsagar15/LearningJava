import java.io.*;

public class FinallyDemo{
	//main method
	public static void main(String[] args){
		PrintWriter pw;
		try{
			pw = new PrintWriter("abc.txt");
			//write to file
			pw.write("Hello");
			pw.flush();
		}catch(FileNotFoundException e){
			System.out.println("");
		}
		finally{
			//close resources
			pw.close();
		}
		
	}
}