package wrapper_class;

public class WrapperExample {
    public static void main(String[] args) {
        
        Integer intObj = Integer.valueOf(10); 
        Double doubleObj = Double.valueOf(20.5);
        Character charObj = Character.valueOf('A');
        Boolean boolObj = Boolean.valueOf(true);

    
        Integer autoIntObj = 30;
        Double autoDoubleObj = 40.5;
        Character autoCharObj = 'B';
        Boolean autoBoolObj = false;

        int intVal = intObj.intValue();  
        double doubleVal = doubleObj.doubleValue();
        char charVal = charObj.charValue();
        boolean boolVal = boolObj.booleanValue();

  
        int autoIntVal = autoIntObj;
        double autoDoubleVal = autoDoubleObj;
        char autoCharVal = autoCharObj;
        boolean autoBoolVal = autoBoolObj;

    
        System.out.println("Boxing and Auto-Boxing:");
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);
        
        System.out.println("\nUnboxing and Auto-Unboxing:");
        System.out.println("int value: " + intVal);
        System.out.println("double value: " + doubleVal);
        System.out.println("char value: " + charVal);
        System.out.println("boolean value: " + boolVal);
        Integer i=10;
        Integer j=10;
        System.out.println(i==j);
    }
}