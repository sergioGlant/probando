package ar.edu.unlam.dominio;

public class CajaAhorro extends Cuenta {

	private Integer cantidadExtracciones;
	private final Integer IMPORTE_ADICIONAL = 6;
	private final Integer CANTIDAD_MAXIMA_EXTRACCIONES_SIN_COSTO = 4;

	public CajaAhorro(Double saldo, Integer numeroCuenta, Integer cbu) {
		super(saldo, numeroCuenta, cbu);
		this.cantidadExtracciones = 0;
	}

	@Override
	public Boolean extraer(Double monto) {
		Boolean sePudoExtraer = false;
		Double montoARetirar = monto;
		Double montoMaximoARetirar = this.getSaldo();

		if (this.cantidadExtracciones >= this.CANTIDAD_MAXIMA_EXTRACCIONES_SIN_COSTO) {
			montoMaximoARetirar = this.getSaldo() - IMPORTE_ADICIONAL;
			montoARetirar = monto + this.IMPORTE_ADICIONAL;
		}
		if (montoARetirar <= montoMaximoARetirar && montoARetirar > 0) {
			this.setSaldo(getSaldo() - montoARetirar);
			this.cantidadExtracciones++;
			sePudoExtraer = true;
		}

		return sePudoExtraer;
	}

}
