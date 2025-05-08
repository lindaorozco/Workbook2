package week2;

import java.util.Scanner;

public class sandwichShopExercises {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //size of sandwich

       double sizeOfSandwich = getSandwichPrice();

        // age of user

        int age = ageOfUser();

        // calculate the discount

        double discount = discountOfUser(sizeOfSandwich, age);

        System.out.println(discount);
        // Display the cost



    }
    //1 getting the sandwich size
    public static double getSandwichPrice(){
        System.out.println(" Do you want regular (1) or large (2)");
        int sizeOfSandwich = scanner.nextInt();
        double price = 0;

        if (sizeOfSandwich == 1){
            price = 5.20;

        } else if (sizeOfSandwich ==2 ){
            price = 6.50;
        }
        return price;

    }
    // 2 asking for the age
    public static int ageOfUser(){
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        return age;
    }
    //3 calculate the discount
    public static double discountOfUser(double price, int age) {
        if (age <= 17) {
            return price * 0.90;
        } else if (age >= 65) {
            return price * 0.80;
        } else {
            return price * 1;
        }
    }}