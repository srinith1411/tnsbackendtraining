package tnsjavaoops;
class Car implements Engine, Wheels{
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
@Override
    public void rotateWheels() {
        System.out.println("Car wheels rotating");
    }
}