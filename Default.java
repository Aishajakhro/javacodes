package constructanddestructor;
  


public class Default {
    
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
        
    }
    public static void main(String[]args){
       Default p1=new Default(); 
       Default p2=new Default(); 
       
       p1.display();
       p2.display();
       
    }
    
}

