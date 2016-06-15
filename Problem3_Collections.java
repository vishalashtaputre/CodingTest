
public class Problem3_Collections {
	
	private static final String STR_BLANK = "";
	
	/*
	*	//Requirements: Generate 100 random numbers between 1-1000.
	*	//Put the numbers into a Map.  Then move them to a Set.
	*	//Then move the numbers into a List.  Then sort the numbers.
	*	//Finally output the numbers, with one number on every row
	*/
	public void collectionFun() {
		
		Map<Double, String> randomNumbersMap = problem.generateRandomNumbersMap(1000, 1);
		
		Set<Double> randomNumbersSet = randomNumbersMap.keySet();
		
		List<Double> randomNumbersList = new ArrayList<Double>();
		
		randomNumbersList.addAll(randomNumbersSet);
		Collections.sort(randomNumbersList);		
		printList(randomNumbersList);
	}
	
	/*
	 * Generates random number within given range and returns the numbers in a Map.
	 */
	private Map<Double, String> generateRandomNumbersMap(Integer high, Integer low){
		String STR_BLANK = "";
		Map<Double, String> randomNumbersMap = new HashMap<Double, String>();
		int maxRandomNumbers = 100;
		for(int index=1; index <= maxRandomNumbers ; index++){
			randomNumbersMap.put(generateRandomNumber(high, low, index), STR_BLANK);			
		}		
		return randomNumbersMap;
	}
	
	/*
	 * Generates the random number within given range and returns @Double.
	 */
	private Double generateRandomNumber(Integer high, Integer low, int index){
		Random rand = new Random();
		double randomNumber = rand.nextDouble() * 100;
		return randomNumber;
	}
	
	/*
	 * Prints the given list of random numbers.
	 */
	private void printList(List<Double> randomNumbersList){
		int count = 1;
		for(Double randomNumber : randomNumbersList ){			
			System.out.println("Row# " + count++ +", Random Number is : " +randomNumber);
		}		
	}
}
