interface Autenticavel{
	final int TAMANHO_SENHA = 8;

	void autentica(String login, String senha);
}