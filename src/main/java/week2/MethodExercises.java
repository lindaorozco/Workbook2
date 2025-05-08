package week2;

public class MethodExercises {
    public static void main(String[] args) {
        printWelcome();
        displayPlayerName("Linda");
        showLevel(1);
        showLevel(2);
        attacker( "Little mermaid",  "Ursela");
        attacker("Harry Potter", "Malfoid " );
        foundItem("Linda ", "pizza ");
        foundItem("SpongeBob ", "Krabby patty");
        foundItem("Snow white ", "apple ");
        castSpell("Wizard Coco melon ", "fireball ", 10);
        gameOver("Linda");
        displayInventory("Rumplesteelskin", 10 );
        enterDungeon("Flower leaf" , "Maze of the white wizard ");
        victoryDance("Paco the ogro");

    }
    public static void printWelcome(){
        System.out.println(" Welcome to code quest ");
    }

    public static void displayPlayerName(String firstName){
        System.out.println("Player joined: " + firstName);
    }

    public static void showLevel (int level){
        System.out.println("Level: " + level);
    }

    public static void attacker(String attacker, String target ){
        System.out.println( attacker + " attacks " + target);}

    public static void foundItem(String player, String item){
        System.out.println(player + "found a " + item ); }

    public static void castSpell(String wizard, String fireball, int manaCost ) {
        System.out.println(wizard + "casts a " + fireball + "costing " + manaCost ); }

    public static void gameOver(String player){
        System.out.println("Game over for "+ player );}

    public static void displayInventory(String player, int itemCount){
        System.out.println(player + " has "+ itemCount + " items in inventory ");}

    public static void enterDungeon( String player, String dungeonName){
        System.out.println(player + " braverly enters the "+ dungeonName);}

    public static void victoryDance(String player){
        System.out.println(player + " does a little victory dance ");}






    }





