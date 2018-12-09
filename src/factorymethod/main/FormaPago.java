package factorymethod.main;

public abstract class FormaPago {

	protected abstract Pago crearPago(TipoPago tipoPago, double monto);

}
