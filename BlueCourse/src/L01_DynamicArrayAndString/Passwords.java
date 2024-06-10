package L01_DynamicArrayAndString;

import java.util.ArrayList;
import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPasswords = scanner.nextInt();
        int numOfFailAllowed = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> pswList = new ArrayList<>();
        for(int i = 0; i < numOfPasswords; i++){
            pswList.add(scanner.nextLine());
        }
        String password = scanner.nextLine();
        timeGuess(pswList, password, numOfFailAllowed);
    }
    public static void timeGuess(ArrayList<String> pswList, String password, int failAllow){
        int bestCase, worstCase;

        //Create new lists of:
        // 1. psw from pswList that are shorter than the password
        // 2. psw from pswList that are same length with the password
        ArrayList<String> listPswShorterThanPassword = new ArrayList<>();
        ArrayList<String> listPswSameLength = new ArrayList<>();
        for(String psw : pswList){
            if(psw.length() < password.length()) {
                listPswShorterThanPassword.add(psw);
            } else if (psw.length() == password.length()) {
                listPswSameLength.add(psw);
            }
        }

        //Now try all the psw in the listPswShorterThanPassword
        if(listPswShorterThanPassword.isEmpty()){
            bestCase = 1;
            worstCase = countTimeByFailAllow(pswList.size(), failAllow);
        } else {
            //first guess all shorter psw, with +5s for each failAllow times
            int timeToGuessShorterPsw = countTimeByFailAllow(listPswShorterThanPassword.size(), failAllow);
            //for best case, +1s to guess correct psw, at best shot
            bestCase = timeToGuessShorterPsw + 1;

            //for worst case, count worst time to guess all psw with shorter & same length until found correct password
            worstCase = countTimeByFailAllow(listPswShorterThanPassword.size() + listPswSameLength.size(), failAllow);
        }
        System.out.printf("%d %d", bestCase, worstCase);
    }

    public static int countTimeByFailAllow(int listSize, int failAllow){
        int numberOfTimeBeingBlocked = listSize/failAllow;
        int numberOfTimeRemained = listSize % failAllow;
        if(failAllow == 1){
            return (listSize - 1) * 5 + listSize;
        }
        if(listSize == failAllow){
            return listSize;
        } else {
            if(numberOfTimeBeingBlocked > 0){
                return (numberOfTimeBeingBlocked * failAllow) + (numberOfTimeBeingBlocked * 5) + numberOfTimeRemained;
            } else {
                return listSize;
            }
        }
    }
}
