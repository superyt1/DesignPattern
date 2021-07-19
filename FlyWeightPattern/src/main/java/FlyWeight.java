public abstract class FlyWeight {
    public boolean isRide;
    abstract void ride(String name);
    abstract void back();

    public boolean getIsRide() {
        return isRide;
    }

    public void setIsRide(boolean isRide) {
        this.isRide = isRide;
    }
}
