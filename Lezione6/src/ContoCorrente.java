
public class ContoCorrente {
	// campi
	private String idUtente;
	private double importo;
	// costruttore a 0
	public ContoCorrente(String idUtente) {
		this.idUtente = idUtente;
		this.importo = 0;
	}
	// costruttore impostato
	public ContoCorrente(String idUtente, double importo) {
		this.idUtente = idUtente;
		this.importo = importo;
	}
	// metodo svuota
	public double svuota() {
		double svuotato = importo;
		importo = 0;
		return svuotato;
	}
	// metodo getImporto
	public double getImporto() {
		return importo;
	}
	// metodo getIdUtente
	public String getIdUtente() {
		return idUtente;
	}
	// metodo preleva
	public void preleva(double sottrai) {
		importo -= sottrai;
	}
	// metodo versa
	public void versa(double aggiungi) {
		importo += aggiungi;
	}
}
