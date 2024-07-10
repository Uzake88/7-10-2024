package adapter;

public class GasolineSystemAdapter implements GasolineSystemPlan
{
    ElectricVehicleSystemPlan g1;
    GasolineSystemAdapter(ElectricVehicleSystemPlan g1)
    {
        this.g1 = g1;
    }

    public void provideGasolineFuel()
    {
        this.g1.provideGasEnergy();
    }
}