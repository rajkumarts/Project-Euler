
public class problem7 {

	/**
	 * Problem 7
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1, i =3,primeNo = 0;
		boolean bool = true;
		while(count <= 10001){
			bool = prime(i);
			if(bool){
				count++;
				primeNo = i;
			}
			i++;
		}
		
		System.out.println(primeNo);
	}
	
	
	public static boolean prime(int n){
		
			for(int i=3;i<n;i++){
				if ( n % i == 0){
					return false;
				}
			}
		
		return true;
		
	}

}
