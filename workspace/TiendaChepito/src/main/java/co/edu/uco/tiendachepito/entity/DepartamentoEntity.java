package co.edu.uco.tiendachepito.entity;

import co.edu.uco.tiendachepito.crosscutting.helpers.NumericHelper;
import co.edu.uco.tiendachepito.crosscutting.helpers.TextHelper;

public final class DepartamentoEntity {
	
	private int id;
	private String nombre;
	private PaisEntity pais;
	
	private DepartamentoEntity(final int id) {
		setId(id);
		setNombre(TextHelper.EMPTY);
		setPais(PaisEntity.build());
	}
	
	private DepartamentoEntity(int id, String nombre, PaisEntity pais) {
		setId(id);
		setNombre(nombre);
		setPais(pais);
	}
	
	public static final DepartamentoEntity build(final int id) {
		return new DepartamentoEntity(id);
	}
	
	public static final DepartamentoEntity build(final int id, final String nombre, final PaisEntity pais) {
		
	}
	
	protected static final DepartamentoEntity uild() {
		return new DepartamentoEntity(NumericHelper.ZERO);
	}

	private final void setId(final int id) {
		setId(id);
	}
	
	private final void setNombre(final String nombre) {
		setNombre(TextHelper.EMPTY)
	}
	
	private final void setPais(final PaisEntity pais) {
		
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setPais(PaisEntity pais) {
		this.pais = pais;
	}
	private int getId() {
		return id;
	}
	private String getNombre() {
		return nombre;
	}
	private PaisEntity getPais() {
		return pais;
	}
}
