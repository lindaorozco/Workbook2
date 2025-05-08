package Week5.HotelApp;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double hoursWorked;
    private double payRate;
    private boolean punch;
    private double startTime;

    // only these are getters and setters
    private double overTimeHours;


    // create constructor
    public Employee(String employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        totalPay();

    }

    // calc total pay method
    public double totalPay(){
        double totalPay;

        if (hoursWorked > 40){
         this.overTimeHours = (getHoursWorked() - 40);   // overtime hours set
            totalPay = (overTimeHours * (getPayRate() * 1.5)) + (getHoursWorked() - overTimeHours) * getPayRate();
        } else {
           totalPay = getHoursWorked() * getPayRate();
        }
        return totalPay;
    }

    public void punchTimeCard(){
        if (punch) {
            this.startTime = LocalDateTime.now().getHour();

            double minutes = LocalDateTime.now().getMinute();

            this.startTime += minutes / 60;
        } else {

        }
    }


    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

