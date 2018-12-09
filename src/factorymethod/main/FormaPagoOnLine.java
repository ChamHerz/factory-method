package factorymethod.main;

public class FormaPagoOnLine extends FormaPago {

	public Pago crearPago(TipoPago tipoPago, double monto) {
		if (tipoPago == TipoPago.MERCADO_LIBRE) {
			return new PagoMercadoLibre(monto);
		}
		return null;
	}
}
