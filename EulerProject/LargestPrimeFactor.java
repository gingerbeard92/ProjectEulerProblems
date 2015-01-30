public class LargestPrimeFactor{

	public static void main(String args[]){
	
		//Need the 'L' to specify that it's a long
		System.out.println(findLargestPrimeFactor(600851475143L));
	
	}
	
	/*Utilizing Sieve of  method*/
	public static int findLargestPrimeFactor(long N){
	
		int factor;
		
		for (factor = 2; 2 <= N; factor++){
			
			if(N % factor == 0){
				N /= factor;
				factor--;
			
			}
		
		}
		return factor;
	}


}