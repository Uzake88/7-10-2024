package Factory;

class Sedan extends ToyotaFactory
{
    static int globalid = 0;
    int carId;
    public Sedan(){
        globalid++;
        this.carId = globalid;
    }
    protected void showme()
    {
        System.out.println("I am sedan car with id " + this.carId);
    }
}
class SportsCar extends ToyotaFactory
{
    static int globalid = 0;
    int carId;
    public SportsCar(){
        globalid++;
        this.carId = globalid;
    }
    protected void showme()
    {
        System.out.println("I am sports car with id " + this.carId);
    }
}
class LuxuryCar extends ToyotaFactory
{
    static int globalid = 0;
    int carId;
    public LuxuryCar(){
        globalid++;
        this.carId = globalid;
    }
    protected void showme()
    {
        System.out.println("I am luxury car with id " + this.carId);
    }
}
