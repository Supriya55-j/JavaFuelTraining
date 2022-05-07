import java.util.Scanner;
public class FantasyGame
{
    final static int MAX_POINTS = 15;

    public static void main(String[] args) {
        System.out.println("Welcome to Jack Bagbada's Quest");
        String characterName = null;
        int strength = 100;
        int health = 100;
        int luck = 1000;
        Scanner inpScan = new Scanner(System.in);

        System.out.print("Enter the name of your character: ");
        characterName = inpScan.nextLine();
        do
        {
            System.out.print("Enter strength (1-10): ");
            strength = inpScan.nextInt();
        }
        while (strength < 1 || strength > 10);
        do
        {
            System.out.print("Enter health (1-10): ");
            health = inpScan.nextInt();
        }
        while (health < 1 || health > 10);
        do
        {System.out.print("Enter luck (1-10): ");
            luck = inpScan.nextInt();
        }
        while (luck < 1 || luck > 10);

        if (strength + health + luck > MAX_POINTS)
        {
            System.out.println("You have give your character too many points! Default values have been assigned:");
            strength = 5;
            health = 5;
            luck = 5;
        }
        inpScan.close();

        System.out.println(characterName + ", strength: " + Integer.toString(strength) + ", health: " + Integer.toString(health) + ", luck: " + Integer.toString(luck));
    }
}