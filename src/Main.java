import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts let the sorting hat place you in your correct house. what is your name?");
        String name = scan.nextLine().toLowerCase();
        System.out.println("To determine your house placement the sorting hat will ask you several questions.");
        System.out.println("Would you say you are Brave?(yes or no)");
        String answer1 = scan.nextLine().toLowerCase();
        if (answer1.equals("yes")) {
            System.out.println("Would you step in if you saw someone getting bullied?(yes or no");
            String answer2 = scan.nextLine().toLowerCase();
            if (answer2.equals("yes")) {
                System.out.println(name+" You are Griffendor");
            }
        }
        System.out.println("Would you say gathering knowledge is very important to you?(yes or no)");
        String answer3 = scan.nextLine().toLowerCase();
        if (answer3.equals("yes")) {
            System.out.println("When faced with a problem do you think deeply before acting?(yes or no)");
            String answer4 = scan.nextLine().toLowerCase();
            if (answer4.equals("yes")) {
                System.out.println(name+" You are Ravenclaw");
            }
        }
        System.out.println("Would you say achieving your ambitions is most important?( yes or no)");
        String answer5 = scan.nextLine().toLowerCase();
        if (answer5.equals("yes")) {
            System.out.println("Would you use any means necessary to succeed?(yes or no)");
            String answer6 = scan.nextLine().toLowerCase();
            if (answer6.equals("yes")) {
                System.out.println(name+" You are Slytherin");
            }
        }
        System.out.println("Would you say working hard is your best quality? (yes or no)");
        String answer7 = scan.nextLine().toLowerCase();
        if(answer7.equals("yes")){
            System.out.println("Do you appreciate nature and learning more then material item?(yes or no)");
            String answer8 = scan.nextLine().toLowerCase();
            if(answer8.equals("yes")){
                System.out.println(name+" You are a Hufflepuff");
            }
            else{
                System.out.println(name+" Please think deeper and choose the answers that most closely represent you");
            }
        }
    }
}
