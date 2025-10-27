 public class StaticBinding {
    public static class MotorVehicle {
        static void start(){
            System.out.println("start vehicle.");
        }
    }
    public static class MotorBike extends MotorVehicle{
        //overridden
        static void start(){
            System.out.println("start bike.");
        }        
        public void revEngine() {System.out.println("rev engine");}
    }
    
    public static void main(String[] args) {
        MotorVehicle bike = new MotorBike();
        bike.start();

    }
}