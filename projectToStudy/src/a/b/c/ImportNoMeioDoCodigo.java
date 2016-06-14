package a.b.c;

//import java.io.*; //com o import apos o package evita-se o erro
import java.util.*;

	     
public class ImportNoMeioDoCodigo{
public static void main(String[] args){
ArrayList<String> lista = new ArrayList<String>();
for(String arg : args){
if (new E().existe(arg))
lista.add(arg);
}
}
}

import java.io.*; /* erro de compilacao pois o import nao pode ficar no meio do codigo
			class, interface or enum expected
			*/

class E{
public boolean existe(String nome){
File f = new File(nome);
return f.exists();
}
}