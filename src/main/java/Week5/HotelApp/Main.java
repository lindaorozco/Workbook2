package Week5.HotelApp;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("King", 5, true);
        System.out.println(reservation.getReservationTotal());

        Employee employee = new Employee("A123", "Bolita", "Dogs", 10,.50);
        System.out.println("Employee " + employee.getName() + " " + employee.getEmployeeId() + " salary for the week is: " + employee.totalPay());

    }
}
