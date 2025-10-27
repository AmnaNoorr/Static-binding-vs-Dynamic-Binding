public class NewClass{
    public static class Vehicle{
        void print(){   
            System.out.println("print in Vehicle.");
        }
    }
    public static class Bike extends Vehicle{
        @Override
        void print(){
            System.out.println("print in Bike.");
        }
    }
    public static void main(String[] args){
        Vehicle A = new Vehicle();
        Vehicle B = new Bike();
        A.print();
        B.print();
    }
}
