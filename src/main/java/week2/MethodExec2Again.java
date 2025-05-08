package week2;

import java.util.Scanner;

public class MethodExec2Again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        String name = getPlayerTitle("Linda ");
        System.out.println("Welcome Princess " + name + "to the game ");

        //2
        int xp = 400;
        int doubleXP = doubleXP(xp);
        System.out.println("Original " + xp);
        System.out.println("Doubled XP is: " + doubleXP);

        //3
        int currentXP = 1000;
        int threshold = 900;
        boolean level = hasLeveledUp(currentXP, threshold);
        if (hasLeveledUp(currentXP, threshold)) {
            System.out.println("You leveled up! ");
        } else {
            System.out.println("Keep grinding...");
        }

        //4
        System.out.println("Random dice roll 1: " + rollDice());
        System.out.println("Random dice roll 2: " + rollDice());
        System.out.println("Random dice roll 3: " + rollDice());

        //5
        int damage = calculateDamage(20, 10);
        System.out.println("Damage dealt: " + damage);

        //6

//        System.out.println("Test 1: "+ canOpenChest(false, false));
//        System.out.println("Test 2: "+can);


    }

    ///  ////////////////////////////////////////////////////////////////////////////////////
    //1
    public static String getPlayerTitle(String name) {
        return name;
    }

    //2
    public static int doubleXP(int xp) {
        return xp * 2;
    }

    //3
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        return currentXP >= threshold;
    }

    //4
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    //5
    public static int calculateDamage(int strength, int enemyDefense) {
        return (strength * 2) - enemyDefense;

//    //6
//    public static boolean canOpenChest(boolean hasKey,boolean lockIsBroken){
//        return hasKey || lockIsBroken;

        }

    public static class miniProject1Calculator {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Enter the first number:");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number:");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Choose an operator ( +,-,/,*): ");
            String operator = scanner.nextLine();

            double result;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 = num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            } else {
                System.out.println("unknown operator!");
            }
        }
    }
}

