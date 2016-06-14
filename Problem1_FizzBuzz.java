
public class Problem1_FizzBuzz {
	/*
	* //Requirements: Output the numbers 1-100, with one number on every row.
	*	//	If the number is a multiple of 3 output an F instead of the number.
	*	//	If the number is a multiple of 5 output an B instead of the number.
	*	//	If the number is a multiple of 15 output output an FB instead of the number.
	*/
	public void print() {
		int[] numbers = new int[100];
		int numbersLength = numbers.length;
		//initialize the numbers array
		for(int index=0; index<numbersLength; index++){
			numbers[index] = index+1;
		}
	
		for(int index=0; index < numbersLength; index++){
			int number = numbers[index];
			if((number%3) == 0){
				System.out.println("F");
			}else if ((number%5) == 0){
				System.out.println("B");
			}else if ((number%15) == 0){
				System.out.println("FB");
			}else{
				System.out.println(number);
			}
		}
	}
}
