package factorymethod.main;

import java.util.List;

public class Factura {
	private int numeroTicket;
	private String cliente;
	private double total;
	private FormaPago formaPago;
	private List<Pago> listaPagos;
	
	public Factura(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void agregarPago(TipoPago tipoPago, double monto) {
		Pago unPago = formaPago.crearPago(tipoPago,monto);
		listaPagos.add(unPago);
	}
}
