package factorymethod.main;

public abstract class PagoAbstractFactory {
	
	public abstract Usuario crearUsuario();
	
	public abstract Pago crearFormaPago();
}
