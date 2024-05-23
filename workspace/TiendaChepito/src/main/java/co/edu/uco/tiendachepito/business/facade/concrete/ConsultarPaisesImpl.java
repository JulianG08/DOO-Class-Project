package co.edu.uco.tiendachepito.business.facade.concrete;

public class ConsultarPaisesImpl implements ConsultarPaises {
	private final DAOFactory factory;
	
	public ConsultarPaisesImpl(final DAOFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public final List<PaisDomain> ejecutar()
}
