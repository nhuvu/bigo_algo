package MidTerm;

import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if(checkValid(email) == true){
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }

    public static boolean checkValid (String email){
        //email must contain '@'
        if(!email.contains("@")){
           return false;
        }

        String[] parts = email.split("@");
        //rule 1
        if(parts.length > 2){
            return false;
        }
        String localPart = parts[0];
        String domainPart = parts[1];

        if(checkValidLocalChar(localPart) && checkValidDomainChar(domainPart)) {
            return true;
        }
        return false;
    }

    public static boolean checkValidLocalChar (String s){
        if(s == null || s.isEmpty()){
            return false;
        }
        char[] chars = s.toCharArray();
        for(char currentChar : chars){
            if(!((currentChar >= 'a' && currentChar <= 'z') ||
                    (currentChar >= 'A' && currentChar <= 'Z') ||
                    (currentChar >= '0' && currentChar <= '9') ||
                    currentChar == '.' || currentChar == '_')){
                return false;
            }
        }
        return true;
    }

    public static boolean checkValidDomainChar (String s){
        if(s == null || s.isEmpty()){
            return false;
        }
        if(!s.contains(".") || s.contains("..")){
            return false;
        }
        char[] chars = s.toCharArray();
        for(char currentChar : chars){
            if(!((currentChar >= 'a' && currentChar <= 'z') ||
                    (currentChar >= 'A' && currentChar <= 'Z') ||
                    currentChar == '.')){
                return false;
            }
        }
        return true;
    }
}
