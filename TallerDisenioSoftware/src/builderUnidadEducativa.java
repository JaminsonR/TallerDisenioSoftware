package main;

public abstract class builderUnidadEducativa {
	
	//Atributos
	protected unidadEducativa unidadeducativa;
	
	//Getter
	public unidadEducativa getUnidadEducativa() {
		return unidadeducativa;
	}
	
	public void crearUnidadEducativa() {
		
		this.unidadeducativa = new unidadEducativa();
	}
	
	public abstract void imprimirMenu();
	
	
	

}
