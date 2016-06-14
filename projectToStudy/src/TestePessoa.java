class TestePessoa{
	
public static void main(String[] args){

	Pessoa p = new Pessoa();
	System.out.println(p.id); //acessando variavel static pelo objeto
	System.out.println(Pessoa.id);//acesso a variavel static diretamente a partir da classe

}
}