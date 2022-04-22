import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws Exception {

        File file = new File("GuessTheMovie");
        Scanner scanner = new Scanner(file);
        Scanner userScanner = new Scanner (System.in);

        int numberOfLines = 0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            numberOfLines++;
        }
        System.out.println(numberOfLines);

        String title = "Matrix";
        int titleLength = title.length();
        String [] arr = title.split("");

        int number = 0;
        String underscore = title.replaceAll("[a-zA-Z]" , "_");
        String [] underscore2 = underscore.split("");

        System.out.print("You are guessing: ");
        for (int j = 0; j < titleLength; j++){
            System.out.print(underscore2[j]);

        }
        System.out.println();
        System.out.println("You have guessed " + number + " wrong letters");
        System.out.print("Guess the letter: ");

        String guess = userScanner.next();

        for(int k = 0; k < titleLength; k++){
            if(guess.equals(arr[k])){
                underscore2[k] = underscore2[k].replace("_", guess);
                System.out.print("You are guessing: ");
                for( int l = 0; l < titleLength; l++){
                    System.out.print(underscore2[l]);
                }
            }
        }



        }


        }








