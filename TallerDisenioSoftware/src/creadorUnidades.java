package main;

public class creadorUnidades {
	
	private builderUnidadEducativa builderUnidadEducativa;
	
	public void crearUnidadEducativa() {
		builderUnidadEducativa.crearUnidadEducativa();
	}
	
	public unidadEducativa getUnidadEducativa() {
		
		return builderUnidadEducativa.getUnidadEducativa();
	}
	public void setBuilderUnidadEducativa(builderUnidadEducativa builder) {
		builderUnidadEducativa = builder;
	}

}
