package co.edu.uco.tiendachepito.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.tiendachepito.api.response.pais.PaisResponse;

@RestController
@RequestMapping("/api/v1/paises")
public class PaisController {
	
	@GetMapping("/otro")
	public List<PaisDTO> listar() {
		final ConsultarPaisesFachada fachada = new ConsultarPaisesFachadaImpl();
		return fachada.execute(null);
	}
	
	@GetMapping
	public ResponseEntity<PaisResponse> consultarTodos() {
		PaisResponse paisResponse = PaisResponse.build(null);
		HttpStatus httpStatusResponse; = HttpStatus.OK;
		try {
			final ConsultarPaisesFachada fachada = new ConsultarPaisesFachadaImpl();
			paisResponse.setDatos(fachada.execute(PaisDTO.build()));
			paisResponse.getMensajes().add("Países consutados exitosamente");
			response = new ResponseEntity<PaisResponse>(paisResponse, HttpStatus.OK);
		} catch (final TiendaChepitoException exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add(exception.getMensajeUsuario());
			HttpStatusResponse = HttpStatus.BAD_REQUEST;
		} catch (final Exception exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add("Se ha presentado un problema inesperado tratando de consultar un pais");
			HttpStatusResponse = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<>(paisResponse, httpStatusReponse);
	}
	
	@PostMapping
	public ResponseEntity<PaisResponse> consultarTodos() {
		PaisResponse paisResponse = PaisResponse.build(null);
		HttpStatus httpStatusResponse; = HttpStatus.OK;
		try {
			final ConsultarPaisesFachada fachada = new ConsultarPaisesFachadaImpl();
			paisResponse.setDatos(fachada.execute(PaisDTO.build()));
			paisResponse.getMensajes().add("Países consutados exitosamente");
			response = new ResponseEntity<PaisResponse>(paisResponse, HttpStatus.OK);
		} catch (final TiendaChepitoException exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add(exception.getMensajeUsuario());
			HttpStatusResponse = HttpStatus.BAD_REQUEST;
		} catch (final Exception exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add("Se ha presentado un problema inesperado tratando de consultar un pais");
			HttpStatusResponse = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<>(paisResponse, httpStatusReponse);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<PaisResponse> eliminar(@PathVariable int id) {
		PaisResponse paisResponse = PaisResponse.build(null);
		HttpStatus httpStatusResponse; = HttpStatus.OK;
		try {
			// Llmar la fachada de eliminar el pais
			paisResponse.getMensajes().add("Países eliminado exitosamente");
		} catch (final TiendaChepitoException exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add(exception.getMensajeUsuario());
			HttpStatusResponse = HttpStatus.BAD_REQUEST;
		} catch (final Exception exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add("Se ha presentado un problema inesperado tratando de consultar un pais");
			HttpStatusResponse = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<>(paisResponse, httpStatusReponse);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PaisResponse> eliminar(@PathVariable int id, @RequestBody PaisDTO pais) {
		PaisResponse paisResponse = PaisResponse.build(null);
		HttpStatus httpStatusResponse; = HttpStatus.OK;
		try {
			pais.setId(id);
			// Llmar la fachada de eliminar el pais
			paisResponse.getMensajes().add("Países modificado exitosamente");
		} catch (final TiendaChepitoException exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add(exception.getMensajeUsuario());
			HttpStatusResponse = HttpStatus.BAD_REQUEST;
		} catch (final Exception exception) {
			exception.printStackTrace();
			paisResponse.getMensajes().add("Se ha presentado un problema inesperado tratando de consultar un pais");
			HttpStatusResponse = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<>(paisResponse, httpStatusReponse);
	}
		
}