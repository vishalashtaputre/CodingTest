
public class Problem2_Recursion {
	/*
	* //Requirements: reverse the input string by using recursion.
	*/
	public String reverseString(String inputStr) {
		
		int inputStrLength = inputStr.length();
		String reverseInputStr = "";
		
		if(inputStrLength == 1){
			return inputStr;
		}else{		
			reverseInputStr  += inputStr.charAt(inputStrLength-1)
					+reverseString(inputStr.substring(0, inputStrLength-1));
		}		
			
		return reverseInputStr;
	}
}
