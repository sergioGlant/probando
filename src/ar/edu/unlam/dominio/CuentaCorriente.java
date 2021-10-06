package ar.edu.unlam.dominio;

public class CuentaCorriente extends Cuenta {

	private Double descubierto;

	public CuentaCorriente(Double saldo, Integer numeroCuenta, Integer cbu) {
		super(saldo, numeroCuenta, cbu);
	}

	@Override
	public Boolean extraer(Double monto) {

		return null;
	}

}
