
public class AnnoBisestile {
	
	public static void main(String[] args) {
		
		int anno = Integer.parseInt(args[0]);
		boolean bisestile;
		bisestile = anno % 4 == 0;
		bisestile = bisestile && (anno % 100 != 0);
		bisestile = bisestile || (anno % 400 == 0);
		
		System.out.println("L'anno " + anno + " è bisestile? " + bisestile);
	}
}
