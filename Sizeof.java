package helloworld;

public class Sizeof {
    
    public static void main(String[] args){
        
        //In Bytes
    
        System.out.println("The Size of byte = " + (Byte.SIZE/8) + "bytes.");
        System.out.println("The Size of short = " + (Short.SIZE/8) + "bytes.");
        System.out.println("The Size of int = " + (Integer.SIZE/8) + "bytes.");
        System.out.println("The Size of long = " + (Long.SIZE/8) + "bytes.");
        System.out.println("The Size of char = " + (Character.SIZE/8) + "bytes.");
        System.out.println("The Size of float = " + (Float.SIZE/8) + "bytes.");
        System.out.println("The Size of double = " + (Double.SIZE/8) + "bytes.");
    
        // In Nibble
    
        System.out.println("The Size of byte = " + (Byte.SIZE/4) + "nibble.");
        System.out.println("The Size of short = " + (Short.SIZE/4) + "nibble.");
        System.out.println("The Size of int = " + (Integer.SIZE/4) + "nibble.");
        System.out.println("The Size of long = " + (Long.SIZE/4) + "nibble.");
        System.out.println("The Size of char = " + (Character.SIZE/4) + "nibble.");
        System.out.println("The Size of float = " + (Float.SIZE/4) + "nibble.");
        System.out.println("The Size of double = " + (Double.SIZE/4) + "nibble.");
    
        //In Bit
    
        System.out.println("The Size of byte = " + (Byte.SIZE) + "bit.");
        System.out.println("The Size of short = " + (Short.SIZE) + "bit.");
        System.out.println("The Size of int = " + (Integer.SIZE) + "bit.");
        System.out.println("The Size of long = " + (Long.SIZE) + "bit.");
        System.out.println("The Size of char = " + (Character.SIZE) + "bit.");
        System.out.println("The Size of float = " + (Float.SIZE) + "bit.");
        System.out.println("The Size of double = " + (Double.SIZE) + "bit.");
    
    }
    
}
