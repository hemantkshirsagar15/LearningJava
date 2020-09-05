public class FinallyVsReturnDemo{
	
	public static void main(String[] args){
		String str = returnString();
    	System.out.println("output " + str);	
	}
	
	public static String returnString(){
		try{
			 return "try block";
		}catch(Exception e){
			return "catch block";
		}finally{
			return "finally block";
		}
		
	}
}