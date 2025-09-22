import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) { //all declarative statements
        Scanner sc = new Scanner(System.in);
        String name;
        String player_category = "";
        String position = "";
        String attacker_status;
        String eligibility = "";
        String decision;
        String final_decision = "";
        int age;
        double height;
        double converted_height;
        double weight;
        double converted_weight;
        int jersey_number;


        System.out.println("        PLAYER DETAILS           "); //input taking
        System.out.print("Player name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();

        System.out.print("Height in metres: ");
        height = sc.nextDouble();
        converted_height = height * 100;

        System.out.print("Weight in pounds: ");
        weight = sc.nextDouble();
        converted_weight = weight * 0.45359237;

        System.out.print("Jersey number: ");
        jersey_number = sc.nextInt();

        if (age <20) {
            player_category = "Rising Star";
        }else if (age >=20 && age <=30){
            player_category = "Prime Player";
        }else if (age > 30){
            player_category = "Veteran";
        }

        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position  = "Midfielder";
                break;
            case 7:
            case 11:
                position  = "Winger";
                break;
            case 9:
                position  = "Striker";
                break;
            case 10:
                position  = "Playmaker";
                break;
            default:
                position  = "Player position not known";
        }

        boolean attacker_jersey = (jersey_number == 11 || jersey_number == 10 || jersey_number == 9 || jersey_number == 7);
        if (attacker_jersey) {
                attacker_status = "Yes. Attacker Position ";
        }else{
            attacker_status = "No. Not Attacker Position ";
        }

        eligibility = (age >= 18 && age<= 35) ? "Eligible" :"Not Eligible";
        final_decision = (age >= 18 && age <= 35) ? "Play" : "Rest";

        if (age >= 20 && age <= 30) {

            if (weight < 80) {
                decision = "Starting lineup";
            } else {
                decision = "Benched";
            }
        }else{
            decision = "Benched";

        }
        //Unfortunately unless you're in the 20-30 range you get benched!

        System.out.println("\n\n\n           PLAYER REPORT            ");//printing report
        System.out.println("\nPlayer: "+ name);
        System.out.println("Age: "+ age + " (" + player_category + ")");
        System.out.printf("Height: %.2f cm%n", converted_height);
        System.out.printf("Weight: %.2f kg%n", converted_weight);
        System.out.println("Jersey: "+ jersey_number);
        System.out.println("Position: "+ position);
        System.out.println("Attacker Jersey: "+ attacker_status + " (If you're Jersey 7, 9, 10,11 then, you're an attacher)");
        System.out.println("Eligibility: "+ eligibility);
        System.out.println("Lineup Decision: "+ decision);
        System.out.println("Final Decision: "+ final_decision);

        System.out.println("\nUnwanted Fall-Through demo");

        System.out.println("Enter any jersey number: ");
        jersey_number = sc.nextInt();
        switch (jersey_number) {
            case 1:
                System.out.println("Goalkeeper");
                break; // no fall-through
            case 2:
                System.out.println("Defender"); //no break, falls through for demo

            case 6:
                System.out.println("Midfielder");//no break, falls through for demo

            case 7:
                System.out.println("Winger");//no break, falls through for demo

            case 9:
                System.out.println("Striker");//break here to stop the fall-through
                break;
            case 10:
                System.out.println("Playmaker"); // no fall-through
                break;
            case 11:
                System.out.println("Winger"); // no fall-through
                break;
            case 5:
                System.out.println("Defender"); // no fall-through
                break;
            case 8:
                System.out.println("Midfielder");// no fall-through
                break;
            default:
                System.out.println("Player position not known");//default
        }
//multiple prints may occur during fall-through, especially for jersey 2
        System.out.println("\n\nSimulation of age changes based on a season - Increment and Decrement   ");
        System.out.println("Current age: " +age);
        age++;
        System.out.println("Age the next season: " +age);
        System.out.println("Jersey number before:" + jersey_number);
        jersey_number--;//during a penalty..
        System.out.println("Jersey number after:" + jersey_number);




        sc.close();


            }
}
