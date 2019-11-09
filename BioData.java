package encapsulation;

class Data{
    private int age ;
    private String name,fname,email,sec;
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    
    public void setFname(String fname){
        this.fname = fname;
    }
    
    public String getFname(){
        return fname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setSec(String sec){
        this.sec = sec;
    }
    
    public String getSec(){
        return sec;
    }
}

public class BioData {
    
    public static void main(String[] args){
        
        Data obj = new Data();
        
        obj.setAge(18);
        obj.setName("Aisha JAkhro");
        obj.setFname("Khalil Ahmed Jakhro");
        obj.setEmail("aishajakhro2017@gmail.com");
        obj.setSec("bscs A");
        
        System.out.println("your bio data is : \n" + obj.getName() + "\n" + obj.getFname() + "\n" + obj.getAge() + "\n" + obj.getEmail() + "\n" + obj.getSec());
    }
    
}




