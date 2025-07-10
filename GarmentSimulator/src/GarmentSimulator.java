import java.util.Scanner;

public class GarmentSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OutfitFactory factory = null;

        System.out.println("👗 Welcome to the Garment Matching Simulator 👖");
        System.out.println("Choose an outfit type:");
        System.out.println("1. Casual");
        System.out.println("2. Professional");
        System.out.println("3. Party");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory = new CasualFactory();
                break;
            case 2:
                factory = new ProfessionalFactory();
                break;
            case 3:
                factory = new PartyFactory();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        System.out.println("\n️ Your matching outfit:");
        top.wear();
        pants.wear();
        shoes.wear();
    }
}
