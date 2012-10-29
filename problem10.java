
public class problem10 {

	/**
	 * Problem 10
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 2000000;
		boolean bool = true;
		long sum = 2;
		
		for(int i=2;i<n; i++){
			bool = isPrime(i);
			if(bool){
				sum += i;
			}
		}
		
		System.out.print(sum);

	}
	
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
