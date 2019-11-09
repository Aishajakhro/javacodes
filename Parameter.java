
public class Parameter {
    
    Parameter(int i,String n){
        id = i;
        name = n;
    }
     int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
        
    }
    public static void main(String[]args){
       Parameter p1=new Parameter(1,"Aisha"); 
       Parameter p2=new Parameter(2,"Almas"); 
       Parameter p3 = new Parameter(3,"Laiba");
       Parameter p4= new Parameter(4,"Abduallah");
       p1.display();
       p2.display();
       p3.display();
       p4.display();
    }
    
}
