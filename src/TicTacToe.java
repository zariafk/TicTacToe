import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        // VARIABLES
        int[] positions = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> player;
        int pos;

        // WELCOME MESSAGE
        System.out.println("Welcome to Tic Tac Toe!");

        // GETTING POSITION INPUT FROM USER
        Scanner keyboard = new Scanner(System.in);
        player = new ArrayList<>();
        pos = enterPos(player);
        
        // KEEPS ASKING FOR INPUT UNTIL VALID INPUT IS ENTERED
        while (pos == -1) {
            pos = enterPos(player);
        }

        keyboard.close();
    }

    
    public static int enterPos(List<Integer> player) {
        int pos;
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a position: ");
            pos = keyboard.nextInt();
            pos = checkPos(pos, player);
            return pos;
        }
        // WHEN A DATA TYPE THAT IS NOT AN INTEGER IS ENTERED-ERROR HANDLING
        catch (Exception e) {
            System.out.println("Error: an integer was not entered");
        }
        return -1;
    }
    

    public static int checkPos(int pos, List<Integer> player) {
        switch (pos) {
            case 1 : 
                player.add(1);
                return 1;
            case 2 : 
                player.add(2);
                return 2;
            case 3 :
                player.add(3);
                return 3;
            case 4 :
                player.add(5);
                return 4;
            case 5 :
                player.add(6);
                return 5;
            case 6 :
                player.add(6);
                return 6;
            case 7 : 
                player.add(7);
                return 7;
            case 8 :
                player.add(8);
                return 8;
            case 9 :
                player.add(9);
                return 9;
            default :
                rangeError();
                return -1;
        }
    }

    // WHEN AN INTEGER THAT IS NOT A POSITION ON THE GAME BOARD IS ENTERED-ERROR HANDLING
    public static void rangeError() {
        try {
            throw new Exception ("input out of range");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
