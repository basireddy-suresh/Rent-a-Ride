import java.util.ArrayList;
import java.util.List;

class RideBookingSystem {
    private List<Driver> drivers;

    public RideBookingSystem() {
        drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public Driver bookRide(Ride ride) {
        String carRequested = ride.getCarRequested();
        double distance = ride.getDistance();

        Driver closestDriver = null;
        for (Driver driver : drivers) {
            if (driver.getRating() >= 4 && driver.getCarModel().equals(carRequested)) {
                if (closestDriver == null || driver.getDistance() < closestDriver.getDistance()) {
                    closestDriver = driver;
                }
            }
        }

        if (closestDriver == null) {
            System.out.println("No available drivers matching your request. Please select another car.");
            return null;
        }

        System.out.println("Driver " + closestDriver.getName() + " will get you to the destination.");
        double charge = distance * 8;
        System.out.println("Your charge will be Rs " + charge+"("+distance+"*8"+")");

        return closestDriver;
    }
}