import co.edu.uco.tiendachepito.data.dao.sql.SqlConnection;
import java.util.List;

import co.edu.uco.tiendachepito.data.dao.PaisDAO;
import co.edu.uco.tiendachepito.entity.PaisEntity;

public final class PaisAzureSqlDAO extends SqlConnection implements PaisDAO {
	
	public PaisAzureSqlDAO(final Connection connecion) {
		super(connection);
	}
	
	@Override
	public final void crear(PaisEntity entidad) {
		final var sentenciaSql = new StringBuilder();
		sentenciaSql.append("INSERT INTO Pais(Nombre)");
		sentenciaSql.append("VALUES('Colombia')");
	}
	
	@Override
	public void actualizar(PaisEntity entiidad)
		//TODO Auto-generated method stub
	
	@Override
	public void eliminar(int id) {
		final var sentenciaSql = new StringBuilder();
		sentenciaSql.append("DELETE FROM Pais");
		sentenciaSql.append("WHERE id = 1");
	}
	
	@Override
	public final List<PaisEntity> consultar(final CiudadEntity entidad) {
		final var sentenciaSql = new StringBuilder();
		sentenciaSql.append("SELECT id, nombre");
		sentenciaSql.append("FROM Pais");
		sentenciaSql.append("ORDER BY nombre ASC");
		return null;
	}
}