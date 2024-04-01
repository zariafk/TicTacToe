import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");

        int[] positions = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //enterPos();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a position: ");
        int pos = keyboard.nextInt();
        List<Integer> player = new ArrayList<>();
        checkPos(pos, player);
        }

    /* 
    public static int enterPos() {
        int pos;
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a position: ");
            pos = keyboard.nextInt();
        }
        catch (Exception e) {
            System.out.println("Error: an integer was not entered");
        }
        return pos;
    }
    */

    public static void checkPos(int pos, List<Integer> player) {
        switch (pos) {
            case 1 : 
                player.add(1);
                break;
            case 2 : 
                player.add(2);
                break;
            case 3 :
                player.add(3);
                break;
            case 4 :
                player.add(5);
                break;
            case 5 :
                player.add(6);
                break;
            case 6 :
                player.add(6);
                break;
            case 7 : 
                player.add(7);
                break;
            case 8 :
                player.add(8);
                break;
            case 9 :
                player.add(9);
                break;
            default :
                myError();
        }
    }

    public static void myError() {
        try {
            throw new Exception ("input out of range");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
