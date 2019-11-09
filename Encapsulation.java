package encapsulation;

class Encap{
    
    private int ssn,age;
    private String empName;


    public int getAge(){
    return age;
    }
    
    public int getSsn(){
        return ssn;
    }
    
    public String getEmpName(){
        return empName;
    }
    
   public void setAge(int age){
       this.age = age;
   }
   
   public void setSsn(int newvalue){
       ssn = newvalue;
   }
   
   public void setEmpName(String newvalue){
       empName = newvalue;
   }
}

  

public class Encapsulation {

    public static void main(String[] args) {
        
        Encap obj = new Encap();
        
        obj.setEmpName("Aisha");
        obj.setAge(18);
        obj.setSsn(651);
        
        System.out.println("Employe NAME : " + obj.getEmpName());
        System.out.println("employe age : " + obj.getAge());
        System.out.println("employe ssn : " + obj.getSsn());
        
        
    }
    
}
