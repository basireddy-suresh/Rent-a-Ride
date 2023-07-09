import java.util.Scanner;
public class RideBooking {
    public static void main(String[] args) {
        RideBookingSystem bookingSystem = new RideBookingSystem();
        Scanner sc = new Scanner(System.in); 
        bookingSystem.addDriver(new Driver("A", "Sedan", 4, 500));
        bookingSystem.addDriver(new Driver("B", "Hatchback", 4.3, 1000));
        bookingSystem.addDriver(new Driver("C", "5-Seater", 4.8, 200));
        bookingSystem.addDriver(new Driver("D", "Sedan", 4.1, 700));
        bookingSystem.addDriver(new Driver("E", "Hatchback", 4.7, 430));

        System.out.print("Customer Ride Distance: ");
        double distance = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Car Requested: ");
        String carRequested = sc.nextLine();

        Ride ride = new Ride(distance, carRequested);
        bookingSystem.bookRide(ride);

        sc.close();
    }
}
