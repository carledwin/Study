class MetodoNaoConstrutor{
	MetodoNaoConstrutor(){
	System.out.println("Construtor");
}
void MetodoNaoConstrutor(){
	System.out.println("Metodo");
}

public static void main(String[] args){
	new MetodoNaoConstrutor().MetodoNaoConstrutor();
}
}