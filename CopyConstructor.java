
package constructoranddestructor;
 class CopyConstructor {
int id;
String name;
CopyConstructor(int i,String m){
id = i;
name = m;
}
CopyConstructor(CopyConstructor k){
    id=k.id;
    name=k.name;
}
void display(){
    System.out.println(id+" "+name);
}
public static void main(String[]args){
    CopyConstructor p1 = new CopyConstructor(1,"Anus");

    CopyConstructor p2 = new CopyConstructor(p1);
p1.display();
p2.display();
}
}
