class VariavelMesmoNomeDoParam{

String param;//permitido declarar variavel de instancia com o mesmo nome de um parametro de metodo

public void metodo(String param){
	// int param; // variable param is already defined in class VariavelMesmoNomeDoParam
	int param1;
	
	//param1 = 90;
	//System.out.println(param1);
}

public static void main(String[] args){
	new VariavelMesmoNomeDoParam().metodo("param");
}
}