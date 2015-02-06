package test;
 
public class Methods {

	public String truncateAInFirst2Positions(String str){
		if(str.length() <= 2){
			return str.replaceAll("A","");		
		}
		
		String firstTwo = str.substring(0, 2);
		String rest = str.substring(2);
		
		return firstTwo.replaceAll("A", "") + rest;
		
	}
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str){	
		if(str.length() <= 1)
			return false;
		if(str.length() == 2)
			return true;
		
		String firstTwo = str.substring(0, 2);
		String lastTwo = str.substring(str.length()-2);
		return firstTwo.equals(lastTwo);
	}
	
/*
	public static void main(String args[]){

		String aString = "AABCEDEFAAAAAAAAAAAAAAAAAA";
		String truncatedString = truncateAInFirst2Positions(aString);
		System.out.println(truncatedString);
	}
*/
}
