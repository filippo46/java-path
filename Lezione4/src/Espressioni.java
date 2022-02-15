
public class Espressioni {
	public static void main(String[] ags) {
		
		// esempi di espressioni
		int k = 10;
		int j = k+20;
		// int h;
		
		System.out.print("k == ");
		System.out.println(k);
		System.out.print("j == ");
		System.out.println(j);
		System.out.print("h == ");
		// System.out.println(h);	// non definito; errore di compilazione
		
		String s1 = "una stringa ";
		String s2 = "e un'altra stringa";
		String s3 = s1+s2;
		System.out.println(s3);
		
		double d = j+5.3;
		System.out.println("d == "+d);
		
		boolean b = (d == 35.3) && (j == 30);
		System.out.println("b == "+b);
	}

}
