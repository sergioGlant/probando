package ar.edu.unlam.dominio;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Double saldo, Integer numeroCuenta, Integer cbu) {
		super(saldo, numeroCuenta, cbu);

	}

	@Override
	public Boolean extraer(Double monto) {

		Boolean sePudoExtraer = false;
		if (monto <= this.getSaldo() && monto > 0) {
			this.setSaldo(getSaldo() - monto);
			sePudoExtraer = true;
		}
		return sePudoExtraer;
	}
}
