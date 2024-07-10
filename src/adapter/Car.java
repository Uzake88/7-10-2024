package adapter;

public class Car
{
    GasolineSystemPlan p1;
    public Car()
    {
        this.p1 = new GasolineSystem();
    }

    public void setSystem(GasolineSystemPlan p1)
    {
        this.p1 = p1;
    }

    public void startCar(){
        this.p1.provideGasolineFuel();
        System.out.println("adapter.Car started successfully");
    }
}