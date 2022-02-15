
public class Counter {
	
	/**
	 * Valore intero del contatore
	 */
	private int value;
	
	/**
	 * Costruttore della classe
	 */
	public Counter() {
		value = 0;
	}
	
	/**
	 * Incrementa il contatore
	 */
	public void count() {
		value++;
	}
	
	/**
	 * Ottiene il valore corrente del contatore
	 * @return valore intero del contatore
	 */
	public int getValue() {
		return value;
	}

}
