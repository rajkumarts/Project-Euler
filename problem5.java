
public class problem5 {

	/**
	 * Problem 5
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
	 * without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		boolean bool = true;
		for(int j = 20; j< Integer.MAX_VALUE; j++){
			bool = divisible(j);
			if(bool && j < min){
				min = j;
			}
		}
		System.out.println(min);
	}
	
	public static boolean divisible(int j){
		for (int i = 1; i< 20; i++){
			if ( j % i != 0){
				return false;
			}
		}
		
		return true;
	}

}
