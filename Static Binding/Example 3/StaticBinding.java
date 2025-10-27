 public class StaticBinding {
    public static class Animal {
        static void hello(){
            System.out.println("this is animal.");
        }
    }
    public static class Dog extends Animal{
        //overridden
        static void hello(){
            System.out.println("this is dog.");
        }        
    }
    
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.hello();

    }
}