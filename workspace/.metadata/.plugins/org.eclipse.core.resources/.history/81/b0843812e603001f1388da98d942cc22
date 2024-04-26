package co.edu.uco.tiendachepito.data.dao.factory;
import co.edu.uco.tiendachepito.data.dao.PaisDAO;
import co.edu.uco.tiendachepito.data.dao.DepartamentoDAO;
import co.edu.uco.tiendachepito.data.dao.CiudadDAO;
public abstract class DAOFactory {
	
	protected abstract void obtenerConexcion();
	public abstract void iniciarTransaccion();
	public abstract void confirmarTransaccion();
	public abstract void cancelarTransaccion();
	public abstract void cerrarConexion();
	public abstract PaisDAO getPaisDAO();
	public abstract DepartamentoDAO getDepartamentoDAO();
	public abstract CiudadDAO getCiudadDAO();
}
