package Factory;

class FactoryMain
{
    public static void main(String[] args)
    {
        try{
            ToyotaFactory car1 = ToyotaFactory.create(ToyotaFactory.carType.SEDAN);
            car1.showme();
            ToyotaFactory car2 = ToyotaFactory.create(ToyotaFactory.carType.LUXURYCAR);
            car2.showme();
            ToyotaFactory car3 = ToyotaFactory.create(ToyotaFactory.carType.SPORTSCAR);
            car3.showme();
            ToyotaFactory car4 = ToyotaFactory.create(ToyotaFactory.carType.SEDAN);
            car4.showme();
        }
        catch(Exception e){
        }
    }
}