class VariosNewDentroDoFor{
	static int i = 3;

	public static void main(String[] a){

	for(new VariosNewDentroDoFor().i = 10; new VariosNewDentroDoFor().i < 100; new VariosNewDentroDoFor().i++){
		//System.out.println(this.i); // variable this cannot be referenced from a static context		
		//System.out.println(VariosNewDentroDoFor.i); // compila sem problemas
		System.out.println(i); // compila sem problemas
	}
	}
}