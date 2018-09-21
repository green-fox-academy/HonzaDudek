import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first string.");
        String firstString = scanner.nextLine();

        System.out.println("Please enter second string.");
        String secondString = scanner.nextLine();

        for (int i = 0; i < firstString.length(); i++) {
            char a = secondString.charAt(i);

                if (firstString.length() != secondString.length()) {
                    System.out.println("These are not anagrams");
                    break;
                }

                else if (firstString.indexOf(a) == -1){
                    System.out.println("These are not anagrams");
                    break;
                }

                else {
                    System.out.println("These are anagrams");
                }
            }
    }



    // write your code here
    }

