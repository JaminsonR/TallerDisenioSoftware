package main;

public class unidadEducativa {
	
	//Atributos
	private String provincia;
	private String canton;
	private String parroquia;
	private String zona;
	private String nombreUem;
	private int añoCreacion;
	
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
	public int getAñoCreacion() {
		return añoCreacion;
	}
	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	
	//Constructor 
	public unidadEducativa(String provincia, String canton, String parroquia, String zona, String nombreUem,
			int añoCreacion) {
		super();
		this.provincia = provincia;
		this.canton = canton;
		this.parroquia = parroquia;
		this.zona = zona;
		this.nombreUem = nombreUem;
		this.añoCreacion = añoCreacion;
	}
	public unidadEducativa() {
		super();
	}
	
	//Metodos
	public void setAtributos(String provincia, String canton, String parroquia, String zona, String nombreUem,int añoCreacion) {
		setAñoCreacion(añoCreacion);
		setCanton(canton);
		setNombreUem(nombreUem);
		setParroquia(parroquia);
		setProvincia(provincia);
		setZona(zona);
	}
	
	
}
