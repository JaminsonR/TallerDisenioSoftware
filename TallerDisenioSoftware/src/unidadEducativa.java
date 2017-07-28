package main;

public class unidadEducativa {
	
	//Atributos
	private String provincia;
	private String canton;
	private String parroquia;
	private String zona;
	private String nombreUem;
	private int a�oCreacion;
	
	//Getters and Setters
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getParroquia() {
		return parroquia;
	}
	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getNombreUem() {
		return nombreUem;
	}
	public void setNombreUem(String nombreUem) {
		this.nombreUem = nombreUem;
	}
	public int getA�oCreacion() {
		return a�oCreacion;
	}
	public void setA�oCreacion(int a�oCreacion) {
		this.a�oCreacion = a�oCreacion;
	}
	
	//Constructor 
	public unidadEducativa(String provincia, String canton, String parroquia, String zona, String nombreUem,
			int a�oCreacion) {
		super();
		this.provincia = provincia;
		this.canton = canton;
		this.parroquia = parroquia;
		this.zona = zona;
		this.nombreUem = nombreUem;
		this.a�oCreacion = a�oCreacion;
	}
	public unidadEducativa() {
		super();
	}
	
	//Metodos
	public void setAtributos(String provincia, String canton, String parroquia, String zona, String nombreUem,int a�oCreacion) {
		setA�oCreacion(a�oCreacion);
		setCanton(canton);
		setNombreUem(nombreUem);
		setParroquia(parroquia);
		setProvincia(provincia);
		setZona(zona);
	}
	
	
}
