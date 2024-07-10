package Factory;

class ToyotaFactory {
    enum carType {
        SEDAN, SPORTSCAR, LUXURYCAR;
    };
    static ToyotaFactory create(carType car) throws Exception{
        switch (car) {
            case SEDAN:
                return new Sedan();
            case SPORTSCAR:
                return new SportsCar();
            case LUXURYCAR:
                return new LuxuryCar();
            default:
                throw new Exception(" This Car type is not supported now");
        }
    }
    void showme() {
    };
}