
/* A deveria ser a class public pois e o nome do arquivo*/
class A implements B{
}
/* erro de compilacao pois o nome do arquivo e A.java quando deveria 
ser B.java, pois a interface B e public
*/
public interface B{
}
class C extends A{
}
class D extends A implements B{
}