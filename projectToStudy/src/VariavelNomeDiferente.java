class VariavelNomeDiferente{

static int b;
int a;

public static void main(String[] args){
	
	System.out.println(VariavelNomeDiferente.b); //chamada a variavel static ou de classe
	System.out.println(new VariavelNomeDiferente().b); //chamada a varivel de class a partir do objeto
	System.out.println(new VariavelNomeDiferente().a); //chamada a variavel do objeto
	//System.out.println(VariavelNomeDiferente.a); //non-static variavel a cannot be referenced from a static context 
}
}