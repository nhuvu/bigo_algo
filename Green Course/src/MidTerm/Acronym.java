package MidTerm;

import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();

        String[] parts = song.split(" ");
        StringBuilder builder = new StringBuilder(parts.length);
        for(String part : parts){

            char[] chars = part.toUpperCase().toCharArray();
            builder.append(chars[0]);
        }
        System.out.println(builder);
    }
}
