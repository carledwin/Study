class ShowdowingWithThisLargerScope{
	
static int x; //nao e obrigatorio inicializar constant primitiva iniciado com o valor padrao caso nao seja definido um 
static String s; // nao e obrigatorio inicializar contant Wapper nao e iniciado caso nao seja definido um valor o default e null
int y = 0;

public void serY(int y){
	//usando this
	this.y = y; // larger scope of class 	
}

public static void setX(int x){
	//usando a referencia da classe
	ShowdowingWithThisLargerScope.x = x;
}

public static void main(String[] args){
	int y = 13;

	System.out.println("Acessando variavel y - Smaller scope: >> " + y);
	// System.out.println("Acessando with error non static variavel in main this.y - Larger scope: >> " + this.y); // erro non-static variavel this cannot be referenced from a static context	
	System.out.println("Acessando variavel new ShowdowingWithThisLargerScope().y - Larger scope: >> " + new ShowdowingWithThisLargerScope().y);	
	// System.out.println("Acessando with error static variavel in main this.x - Larger scope: >> " + this.x); // erro non variavel this cannot be referenced from a static context
	System.out.println("Acesssando static variavel int main ShowdowingWithThisLargerScope.x: >> " + ShowdowingWithThisLargerScope.x);
	System.out.println("Acessando static variavel Wapper in main ShowdowingWithThisLargerScope.s: >>" + ShowdowingWithThisLargerScope.s);
}
}