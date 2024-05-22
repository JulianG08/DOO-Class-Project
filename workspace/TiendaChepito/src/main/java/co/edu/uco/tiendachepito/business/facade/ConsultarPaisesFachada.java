package co.edu.uco.tiendachepito.business.facade;

import org.springframework.beans.factory.ListableBeanFactory;

public interface ConsultarPaisesFachada {
	List<PaisDTO> execute(PaisDTO pais)
}
