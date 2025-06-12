package Week5.CarDealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    public static String FILENAME = "src\\main\\java\\Week5\\CarDealership\\inventory.csv";

    public static Dealership getDealership(){
        // create list
        List<Vehicle> vehicles = new ArrayList<>();

        // create a file READER
        String[] arrayDealershipInfo = null;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){

            String dealershipInfo = br.readLine();
            arrayDealershipInfo = dealershipInfo.split("\\|");

            String line;

            while ((line = br.readLine()) !=null){
                String[] arrayVehicle = line.split("\\|");

                Vehicle vehicle = new Vehicle(arrayVehicle[0],Integer.parseInt(arrayVehicle[1]), arrayVehicle[2], arrayVehicle[3], arrayVehicle[4], arrayVehicle[5], Double.parseDouble(arrayVehicle[6]), Double.parseDouble(arrayVehicle[7]));

                vehicles.add(vehicle);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Dealership dealership = new Dealership(arrayDealershipInfo[0], arrayDealershipInfo[1], arrayDealershipInfo[2]);

        dealership.setInventory(vehicles);

        return dealership;
    }
    // create a file WRITER
    public static void writeVehicleFile(Vehicle vehicle){
        try (FileWriter fw = new FileWriter(FILENAME, true)){
        fw.write(vehicle.toFileString() + "\n"); // writes when adding the vehicle to the file
    } catch (IOException e){
        System.out.println(e.getMessage());
    }
    }
    // SAVES dealership info
    public static void saveDealership (Dealership dealership){
        // c
        List<Vehicle> vehicles = dealership.getInventory();
        // write information to the file
        try (FileWriter fw = new FileWriter(FILENAME)){
            fw.write(dealership.toFileString() + "\n");

            for (Vehicle vehicle : vehicles){
                fw.write(vehicle.toFileString() + "\n");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
