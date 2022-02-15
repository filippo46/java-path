
public class TestContoCorrente {
	public static void main(String[] args) {
		ContoCorrente c = new ContoCorrente("1234", 1000);
		System.out.println(c.getIdUtente());
		System.out.println(c.getImporto());
		c.versa(500);
		c.preleva(250);
		System.out.println(c.getImporto());
		System.out.println(c.svuota());
	}
}
