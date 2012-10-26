
public class problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 4000000,sum = 0;
		long[] fib = new long[(int) n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i =2;i<n;i++){
			fib[i] = fib[i-1] + fib[i-2];
			if(fib[i] %2 == 0){
				sum += fib[i];
				if(sum > 4000000){
					break;
				}
				
			}
		}
		
		System.out.print(sum);
	}

}
