
public class Rettangolo {
	// campi
	private double x;
	private double y;
	private double base;
	private double altezza;
	// costruttore
	public Rettangolo(double x, double y, double base, double altezza) {
		// set dei campi
		this.x = x;
		this.y = y;
		this.base = base;
		this.altezza = altezza;
	}
	// metodo trasla
	public void trasla(double mx, double my) {
		// muove le x e le y
		x += mx;
		y += my;
	}
	// metodo toString
	public String toString() {
		// ottengo x2 e y2
		double x2 = x + base;
		double y2 = y + altezza;
		// ritorno la stringa
		return "(" + x + ", " + y + ") -> (" + x2 + ", " + y2 + ")";
	}
}
