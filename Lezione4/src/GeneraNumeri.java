
public class GeneraNumeri {
	
	public static void main(String[] args) {
		
		// numero in input
		int max = Integer.parseInt(args[0]);
		
		// numero (pseudo)casuale compreso tra 0 e 1
		double r = Math.random();
		
		// intero (pseudo)casuale tra 0 e max-1
		int n = (int) (r*max);
		
		System.out.println(n);
	}

}
