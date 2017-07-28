

public class Main {

	public static void main(String[] args) {
		
		//Crear Unidades Educativas
		creadorUnidades Ministerio = new creadorUnidades();
		//Unidad 1
		Ministerio.setBuilderUnidadEducativa(new builderUnidadTipo1());
		Ministerio.crearUnidadEducativa();
		unidadEducativa Unidad1=Ministerio.getUnidadEducativa();
		//Unidad2
		Ministerio.setBuilderUnidadEducativa(new builderUnidadTipo2());
		Ministerio.crearUnidadEducativa();
		unidadEducativa Unidad2=Ministerio.getUnidadEducativa();
		//Unidad3
		Ministerio.setBuilderUnidadEducativa(new builderUnidadTipo3());
		Ministerio.crearUnidadEducativa();
		unidadEducativa Unidad3=Ministerio.getUnidadEducativa();

		
		//SetAtributos
		Unidad1.setAtributos("Imbabura", "Otavalo", "San Juan", "1", "JATUN KURAKA", 2009);
		Unidad2.setAtributos("Esmeraldas", "San Lorenzo", "San Lorenzo", "1", "PROF. CONSUELO BENAVIDES", 2009);
		Unidad3.setAtributos("Imbabura", "Cotacachi", "Imantag", "1", "SUMAK YACHANA WASI", 2012);
		System.out.println("---Sistema de Calificaciones---");
		
		

	}

}
