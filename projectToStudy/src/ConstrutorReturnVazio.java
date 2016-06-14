class ConstrutorReturnVazio{
	
int j = -100;




 /* 
    Este construtor nao e obrigatorio
    Caso nao exista construtor padrao e seja realizada a chamada  new ConstrutorReturnVazio(); 
    dara erro constructor ConstrutorReturnVazio in class cannot be applied to given types.
*/

 
 /*
   ConstrutorReturnVazio(){
	System.out.println("Construtor padrao.");
   }
*/


ConstrutorReturnVazio(int i){
	
	System.out.println("I: >> " + i);	

	if(i > 1)
	return;
	
	j =  i;
	System.out.println("J: >> " + j);	
}


public static void main(String[] args){
	/* erro Nao existe construtor sem argumentos declarado	
	constructor ConstrutorReturnVazio in class cannot be 
	applied to given types
	required: argument int
	found: no arguments
	reason: actual and formal argument lists difffer in lengh
	*/

	// new ConstrutorReturnVazio(); 

	// new ConstrutorReturnVazio(1); // imprime I e J

	// new ConstrutorReturnVazio(2); // imprime I e return

        new ConstrutorReturnVazio(); // imprime somente a mensagem do construtor padrao
}
}