package helloworld;

public class LogicalOperationsWithBoolean {

    public static void main(String[] args) {
        
        int a = 2 , b = 4 , c = 6 ;
        
        boolean result ;
        
        result = ( a > b || c > a );
        System.out.println( result );
        
        result = ( a > b && c > a );
        System.out.println( result);
    }
    
}
