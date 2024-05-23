package co.edu.uco.tiendachepito.api.response.pais;

import co.edu.uco.tiendachepito.api.response.Response;
import co.edu.uco.tiendachepito.dto.PaisDTO;

public class PaisResponse extends Response<PaisDTO> {
	
	public static final PaisResponse build(final List<String> mensajes, final List<PaisDTO> datos) {
		PaisResponse<PaisDTO> instance = new PaisResponse();
		instance.setMensajes(mensajes);
		instance.getDatos(datos);
		
		return instance;
	}
	
	public static final PaisResponse build(final List<PaisDTO> datos) {
		PaisResponse<PaisDTO> instance = new PaisResponse();
		instance.setMensajes(new ArrayList<>());
		instance.getDatos(datos);
		
		return instance;
	}
	
	public static final PaisResponse build() {
		PaisResponse<PaisDTO> instance = new PaisResponse();
		instance.setMensajes(new ArrayList<>());
		instance.getDatos(new ArrayList<>());
		
		return instance;
	}
}