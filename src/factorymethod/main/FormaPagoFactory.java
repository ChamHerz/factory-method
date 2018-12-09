package factorymethod.main;

public class FormaPagoFactory implements FormaPagoFactoryMethod {

	@Override
	public FormaPago crearFormaPago(Usuario usuario) {
		if (usuario.getClass() == Empleado.class) {
			return new FormaPagoFisico();
		}
		if (usuario.getClass() == UsuarioWeb.class) {
			return new FormaPagoOnLine();
		}
		return null;
	}

}
