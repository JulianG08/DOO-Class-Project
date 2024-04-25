package co.edu.uco.tiendachepito.data.dao.general;

public interface ConsultarDAO<E> {
	List<E> consultar(E entidad);
}
