import java.util.Scanner;

public class decide {
    private String choice;

    public void dec() {
        Scanner check = new Scanner(System.in);
        // while (true) continuous input until user breaks {
        System.out.println(
                "--Connecting to Waste Management database...Hey admin, if this item is recyclable press Y or y to approve. If not press the other button. Thank you for your service!");
        choice = check.nextLine();

        // for (int i = 0; i < 5; i++) iterates specific amount of time {
        if (choice.equals("Y") || choice.equals("y")) {
            System.out.println(
                    "\nTaking it to recycle...\nTHANK YOU FOR LOOKING OUT FOR THE ENVIRONMENT. THAT'S ONE LESS THREAT OUR ANIMALS HAVE TO FACE :))\n");
        } else {
            System.out.println(
                    "\nTaking it to general trash\nAIGHT APPRECIATES YOU FOR MAKING THE RIGHT DECICSION. HAVE A GREAT DAY :))\n");
        }
        // check.close(); this freaks program up

    }

}
