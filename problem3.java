
public class problem3 {

	/**
	 * Problem 3
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String no = "600851475143";
		Long primeFactor = Long.decode(no);
		long max = 0;
		
		for(int i =1;i < 100000; i++){
			if(prime(i) && primeFactor % i == 0)
			{
				if ( i > max){
					max = i;
				}
			}
		}
		
		System.out.print(max);

	}
	
	public static boolean prime(int n){
		
		if(n == 1){
			return false;
		}
		if(n == 2){
			return true;
		}
		else{
			for(int i= 3;i<n;i++){
				if ( n % i == 0){
					return false;
				}
			}
		}
		
		return true;
		
	}

}
