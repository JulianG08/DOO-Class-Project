package co.edu.uco.tiendachepito.data.dao.factory.sql.azuresql;
import co.edu.uco.tiendachepito.data.dao.*;
import co.edu.uco.tiendachepito.data.dao.factory.*;

public final class AzureSqlDAOFactory extends DAOFactory {
	private Connection connection;
	
	public AzureSqlDAOFactory() {
		obtenerConexion();
	}
	
	@Override
	protected void obtenerConexcion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PaisDAO getPaisDAO() {
		return new PaisAzureSqlDAO(connection);
	}

	@Override
	public DepartamentoDAO getDepartamentoDAO() {
		return new DepartamentoAzureSqlDAO(connection);
	}

	@Override
	public CiudadDAO getCiudadDAO() {
		return CiudadAzureSqlDAO(connection);
	}
}
