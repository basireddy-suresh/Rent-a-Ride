class Ride {
    private double distance;
    private String carRequested;

    public Ride(double distance, String carRequested) {
        this.distance = distance;
        this.carRequested = carRequested;
    }

    public double getDistance() {
        return distance;
    }

    public String getCarRequested() {
        return carRequested;
    }
}
