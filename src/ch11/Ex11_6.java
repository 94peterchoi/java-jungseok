package ch11;

import java.util.*;

public class Ex11_6 {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        int[][] board = new int[5][5];
//
//        for (int i = 0; integers.size() < 30; i++) {
//            int randomNumber = (int)(Math.random() * 30) + 1;
//            if (integers.contains(randomNumber)) {
//                continue;
//            }
//            integers.add((int)(Math.random() * 30) + 1);
//        }
//
//        Iterator it = integers.iterator();
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = (Integer) it.next();
//                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
//            }
//            System.out.println();
//        }


        HashSet set = new HashSet();
        int[][] board = new int[5][5];

        for (int i=0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1 + "");
        }

        List arr = new ArrayList(set);

        Collections.shuffle(arr);

        Iterator it = arr.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }





    }

}
