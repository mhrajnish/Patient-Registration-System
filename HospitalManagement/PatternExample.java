public class PatternExample {  
    private static PatternExample instance;  

    private PatternExample() {}  

    public static PatternExample getInstance() {  
        if (instance == null) {  
            instance = new PatternExample();  
        }  
        return instance;  
    }  
}  
