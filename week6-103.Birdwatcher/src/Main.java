import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Observations observations = new Observations();

       while (true) {
           System.out.print("? ");
           String command = scanner.nextLine();

           if (command.equals("Add")) {
               System.out.print("Name: ");
               String name = scanner.nextLine();
               System.out.print("Latin Name: ");
               String latinName = scanner.nextLine();
               observations.addBird(name, latinName);
           } else if (command.equals("Observation")) {
               System.out.print("What was observed:? ");
               observations.observeBird(scanner.nextLine());
           } else if (command.equals("Statistics")) {
               observations.statistics();
           } else if (command.equals("Show")) {
               System.out.print("What? ");
               observations.showBird(scanner.nextLine());
           } else if (command.equals("Quit")) {
               break;
           }
       }
            
    }

}
