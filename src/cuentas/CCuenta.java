package cuentas;

/**
 * @author Oscar
 * @since 14/01/2022
 * @version 1.0
 */

/**
 * Clase que contiene los atributos de Ccuenta
 */
public class CCuenta {

	/**
	 * Método para obtener el nombre del usuario de la cuenta
	 */
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el número de cuenta
	 */
	private String cuenta;

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para obtener el saldo de la cuenta
	 */
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para obtener el tipo de interés de la cuenta
	 */
	private double tipoInteres;

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public CCuenta() {
	}

	/**
	 * Constructor que recibe los parámetros de la cuenta
	 * 
	 * @param nom	nombre del usuario de la cuenta
	 * @param cue	numero de la cuenta
	 * @param sal	saldo de la cuenta
	 * @param tipo	tipo de interés de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Método que devuelve el saldo de la cuenta
	 * 
	 * @return saldo
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Método que resuelve el ingreso de una cantidad en la cuenta
	 * 
	 * @param cantidad Cantidad a ingresar
	 * @throws Exception Lanza un error si la cantidad es inferior a 0
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Método que resuelve la retirada de una cantidad de la cuenta
	 * 
	 * @param cantidad Cantidad a retirar
	 * @throws Exception Lanza un error si la cantidad es igual o inferior a 0 o si
	 *                   la cantidad a retirar es superior al saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
