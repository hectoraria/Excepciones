package ejercicio03;

/**
 * Clase que recoge los datos de la cuenta corriente personal
 */
public class CuentaCorriente {
	/**
	 * Atributo donde guardar el DNI del titular
	 */
	private String dni;
	/**
	 * Atributo donde guardar el nombre del titular
	 */
	private String nombre;
	/**
	 * Atributo donde guardar el saldo del titular
	 */
	private double saldo;

	/**
	 * Constructor con parametros (dni y saldo) de la clase CuentaCorriente
	 */
	public CuentaCorriente(String dni, int saldo) {

		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Constructor con parametros (dni, nombre y saldo) de la clase CuentaCorriente
	 */
	public CuentaCorriente(String dni, String nombre, int saldo) throws ExcepcionNombre,ExcepcionDni,ExcepcionSaldo {
		super();
		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		}else if(dni.equals("")|| dni==null) {
			throw new ExcepcionDni();
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}else if(nombre.equals("") || nombre==null) {
			throw new ExcepcionNombre();
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}else if(saldo<0) {
			throw new ExcepcionSaldo();
		}
	}

	/**
	 * Método para
	 * 
	 * @param dinero
	 */
	public boolean sacarDinero(double dinero) {
		boolean sacarDinero = false;
		if (this.saldo > dinero) {
			sacarDinero = true;
			this.saldo -= dinero;
		}
		return sacarDinero;
	}

	public void ingresarDinero(double dinero) {
		this.saldo += dinero;
	}

	public void mostrarInformacion() {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.saldo);
	}
}
