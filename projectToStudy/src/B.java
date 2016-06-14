class B{
String b;

B(){}
	
String b(){
return null;//Tudo compila normalmente.....
}

public static void main(String[] args){
System.out.println("Executou mesmo com nomes iguais.....");
System.out.println("Valor de B: >> " + new B().b);
}

}