import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Citizen name");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Superhero name");
        String superName = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Super Power");
        String superPower = sc3.nextLine();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Creation Year");
        String creYear = sc4.nextLine();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Strength");
        double strength = sc5.nextDouble();

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Is human?");
        boolean isHuman = sc6.hasNext();


    }
}
