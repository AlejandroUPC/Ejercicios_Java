package ejerciciosjava.ejercicio1;

public class Tree {
	int longitud = 0;
	String tipo = "";
Tree(){}
Tree(int abc){
	longitud = abc;

}
Tree (String def){
	tipo= def;
	
}
public Tree(int abc, String def)
{
	longitud = abc;
	tipo=def;
}

public void escribir(){
	if (this.longitud != 0 && this.tipo == ""){ //tipo es null, solo longitud
	System.out.println("Un árbol de " + longitud + " metros");
	//System.out.println("Caso solo longitud");
	}
	if (this.tipo != "" && this.longitud == 0){
		System.out.println("Un " + tipo);
		//System.out.println("Caso solo nombre");

	}
	if (this.longitud != 0 && this.tipo != ""){
		
		System.out.println("Un " + tipo + " de " + longitud + " metros");
		//System.out.println("Caso completo");

	}
	if (this.longitud == 0 && this.tipo =="")
	{
		System.out.println("Un árbol");

	}
}
}
