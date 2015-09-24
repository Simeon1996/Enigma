import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Integer linesCount = reader.nextInt();

        reader.nextLine();

        for(Integer i = 0; i < linesCount; i++){
            String input = reader.nextLine();

            Integer m = input.toString().replaceAll("\\s*\\d*","").length() / 2;

            for(Integer j = 0; j < input.length(); j++){
                Character currentLetter = input.charAt(j);

                if(currentLetter == ' '){
                    System.out.print(" ");
                } else if(Character.isDigit(currentLetter)){
                    System.out.print(currentLetter);
                } else{
                    Character decryptedLetter = (char) (currentLetter + m);

                    System.out.print(decryptedLetter);
                }
            }

            System.out.println();
        }

    }
}
