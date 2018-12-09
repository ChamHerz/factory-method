package factorymethod.main;

public class FormaPagoFisico extends FormaPago {
	
	public Pago crearPago(TipoPago tipoPago, double monto) {
		if (tipoPago == TipoPago.EFECTIVO) {
			return new PagoEfectivo(monto);
		}
		
		if (tipoPago == TipoPago.TARJETA_CREDITO) {
			return new PagoTarjetaCredito(monto);
		}
		
		if (tipoPago == TipoPago.CHEQUE) {
			return new PagoCheque(monto);
		}
		return null;
	}

}
