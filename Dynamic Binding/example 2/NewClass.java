public class NewClass{
    public static class Animal{
        void print(){   
            System.out.println("print in Animal.");
        }
    }
    public static class Dog extends Animal{
        @Override
        void print(){
            System.out.println("print in Dog.");
        }
    }
    public static void main(String[] args){
        Animal A = new Animal();
        Animal B = new Dog();
        A.print();
        B.print();
    }
}
