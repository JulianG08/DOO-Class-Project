package co.edu.uco.tiendachepito.entity;

import co.edu.uco.tiendachepito.crosscutting.helpers.TextHelper;

public final class CiudadEntity {
	
	private int id;
	private String nombre;
	private DepartamentoEntity departamento;
	
	private CiudadEntity(final int id) {
		setId(id);
		setNombre(TextHelper.EMPTY);
		setDepartamento(DepartamentoEntity.build());
	}
	
	private CiudadEntity(final int id, final String nombre, final DepartamentoEntity departamento) {
		setId(id);
		setNombre(nombre);
		setDepartamento(departamento);
	}
	
	public static final CiudadEntity build(final int id) {
		return new CiudadEntity(id);
	}
	
	public static final CiudadEntity build(final int id, final String nombre, final DepartamentoEntity departamento) {
		return new CiudadEntity(id, nombre, departamento);
	}
	
	public final void setId(final int id) {
		this.id = id;
	}
	
	private final void setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
	}
	
	protected static final CiduadEntity build() {
		return new CiudadEntity(ZERO);
	}
	
	public final int getId() {
		return id;
	}

	private String getNombre() {
		return nombre;
	}

	private DepartamentoEntity getDepartamento() {
		return departamento;
	}

	private final void setDepartamento(final DepartamentoEntity departamento) {
		
	}
}