
public class First {
    public static void main(String[] args) {
        System.out.println("Hello there from first class");
    }
    public static void main(Integer args[]){
    
    }
}

//default
//public private default protected
//only public and default
class second{
    public static void main(String[] args) {
        for(String s: args){
            System.out.println(s);
        }
        System.out.println("From second class");
    }
}
