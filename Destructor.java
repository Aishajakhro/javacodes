
package Constructoranddestructor;


public class Destructor {
public void finalize() throws Throwable{
    System.out.println("object is destroyed by the garbage collector");
}    
public static void main(String[]args){
Destructor test= new Destructor();
test = null;
System.gc();


}
        }
