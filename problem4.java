
public class problem4 {

	/**
	 * Problem 4
	 * A palindromic number reads the same both ways. 
	 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1,max = 0;
		String intToString = "";
		boolean bool = true;
		
		for(int i = 100;i<999;i++){
			for(int j = i; j<999;j++){
				product = i * j;
				intToString = Integer.toString(product);	
				bool = palindrome(intToString);
				
				if(bool){
					if( product > max)
						max = product;
				}
			}
		}
		
		System.out.print(max);

	}
	
	public static boolean palindrome(String palindrome){
		int start = 0,end = palindrome.length() -1; 
		
		while(start < end){
			if(palindrome.charAt(end) != palindrome.charAt(start)){
				return false;
			}
			
			start++;
			end--;
		}
		return true;
	}

}
