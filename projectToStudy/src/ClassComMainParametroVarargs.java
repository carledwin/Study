class ClassComMainParametroVarargs{
public static void main(String... varargs){
//public static void main(String[] varargs){
int i = 0;
for(String s : varargs){
	System.out.println("$$$ " + i + " varargs: " + s);
	i++;
}
}
}