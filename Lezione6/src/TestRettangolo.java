
public class TestRettangolo {
	// unico metodo
	public static void main(String[] args) {
		// nuovo oggetto Rettangolo
		Rettangolo r = new Rettangolo(0, 0, 20, 10);
		// chiamo trasla
		r.trasla(10, 5);
		// stampo con toString
		System.out.println(r.toString());
	}
}
