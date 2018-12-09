package factorymethod.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hola mundo");
		
		Empleado unEmpleado = new Empleado();
		FormaPagoFactoryMethod factory = new FormaPagoFactory();
		FormaPago formaPagoEmpleado = factory.crearFormaPago(unEmpleado);
		Factura unafactura = new Factura(formaPagoEmpleado);
		unafactura.setTotal(2343);
		try {
			unafactura.agregarPago(TipoPago.EFECTIVO, 100);
		}
		catch (Exception e) {
			
		}
		
		UsuarioWeb unUsuarioWeb = new UsuarioWeb();
		FormaPago formaPagoWeb = factory.crearFormaPago(unUsuarioWeb);
		Factura otraFactura = new Factura(formaPagoWeb);
		
		otraFactura.setTotal(5312);
		try {
			unafactura.agregarPago(TipoPago.MERCADO_LIBRE, 100);
		}
		catch (Exception e) {
			
		}
	}

}
