public class MoByFlyWeight extends FlyWeight{
    private String bikeId;
    @Override
    public void ride(String name) {
        this.setIsRide(true);
    }

    public MoByFlyWeight(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    public void back() {
        this.setIsRide(false);

    }
}
