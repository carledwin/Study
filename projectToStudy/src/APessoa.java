class APessoa{
	String nome;
	String sobreNome;

APessoa(String nome, String sobreNome){
	this.nome = nome;
	this.sobreNome = sobreNome;
}

public String getNomeCompleto(){
	return this.nome + this.sobreNome;
}

public static void main(String[] args){
	
	System.out.println(new APessoa("Fulano ", "De Tal").getNomeCompleto());
}
}