import java.util.*;
public class CharSorter {

    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    boolean loopingMenu = true; // boolean for loop
    int switchMenu = 0; // variable used for menu options
    int frequencyInt = 0;
    int[] charFrequencies = new int [4];
    System.out.println("Welcome to Character Sorter Program \nPlease input a string to be sorted");

    String userInput = scnr.nextLine();
    //char[] sortArray = userInput.toCharArray();   // user array input

    while (loopingMenu) {
        try {
            System.out.println("Please select the option you would like to see");
            System.out.println("1.Display character frequencies alphabetically \n2.Display sorted frequencies \n3.Show types of character frequencies \n4.Exit");
            switchMenu = scnr.nextInt();
            switch (switchMenu) {
                case 1:
                    System.out.println("Case 1 worked");
                    break;
                case 2:
                    System.out.println("Case 2 worked");
                    break;
                case 3:
                    System.out.println("Case 3 worked");
                    charFrequencies = charTypes(userInput);
                    System.out.println("Textual Character count: " + charFrequencies[0]);
                    System.out.println("Numerical Character count: " + charFrequencies[1]);
                    System.out.println("WhiteSpace Character count: " + charFrequencies[2]);
                    System.out.println("Symbol Character count: " + charFrequencies[3] +"\n");
                    break;
                case 4:
                    System.out.println("Case 4 worked");
                    return;
                default:
                    loopingMenu = true;
                    System.out.println("Error, bad input, please enter an integer value between 1-4\n");
            }
        }
        catch (Exception InputMismatchException) {
            System.out.println("Error, bad input, please enter an integer value between 1-4\n");
            scnr.nextLine();
        }

    }


        return;
    }



    public static int[] charTypes(String userInput) {
        int[] returnThis = new int[4];
        char[] sortArray = userInput.toCharArray();
        for(int i = 0; i < userInput.length(); i++) {
            if( Character.valueOf(sortArray[i]) >= 65 && Character.valueOf(sortArray[i]) <= 90 || Character.valueOf(sortArray[i]) >= 97 && Character.valueOf(sortArray[i]) <= 122) {
                returnThis[0]++; // Textual character counter
            }
            else if ( Character.valueOf(sortArray[i]) >= 48 && Character.valueOf(sortArray[i]) <= 57){
                returnThis[1]++; //Numerical character counter
            }
            else if (Character.valueOf(sortArray[i]) == 32) {
                returnThis[2]++; //WhiteSpace counter
            }
            else {
                returnThis[3]++; // symbol counter
            }
        }

        return returnThis;
    }


}
