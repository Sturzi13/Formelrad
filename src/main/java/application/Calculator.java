package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
	}
	public double pAusUundI(double u, double i) {
		return u*i;
	}
	public double pAusUundR(double u, double r) {
		return u*u/r;
	}
	public double pAusRundI(double r, double i) {
		return r*i*i;
	}
	/* Hier die Methoden mit den Formlen hinzuf�gen
	 */

	//Alle Methoden zur Berechnung der Spannung U aus zwei bekannten Grössen
	public double UAusRUndI(double r, double i){
		return r*i;
	}

	public double UAusPUndI(double p, double i){
		return p/i;
	}

	public double UAusPUndR(double p, double r){
		return Math.sqrt(p*r);
	}

	//Alle Methoden zur Berechnung des Widerstandes R aus zwei bekannten Grössen
	public double RAusUUndP(double u, double p){
		return Math.pow(u,2)/p;
	}

}
