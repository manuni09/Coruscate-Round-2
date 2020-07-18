/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coruscate.task1;

import java.util.Scanner;

/**
 *
 * @author Manuni
 */
public class CoruscateTask1 {

    public static int coin(int[] A) {
        int[][] MV = new int[A.length][A.length];

        for (int interval = 0; interval < A.length; interval++) {
            for (int i = 0, j = interval; j < A.length; i++, j++) {
                // a = MV(i+2,j) - Player1 chooses i Player2 chooses i+1
                int a, b, c;
                if (i + 2 <= j)
                    a = MV[i + 2][j];
                else
                    a = 0;
                // b = MV(i+1,j-1)- Player1 chooses i , Player2 chooses j OR
                // Player1 chooses j , Player2 chooses i
                if (i + 1 <= j - 1)
                    b = MV[i + 1][j - 1];
                else
                    b = 0;
                //// c = MV(i,j-2)- Player1 chooses j , Player2 chooses j-1
                if (i <= j - 2)
                    c = MV[i][j - 2];
                else
                    c = 0;
                //////////////////////////////////
                MV[i][j] = Math
                        .max(A[i] + Math.min(a, b), A[j] + Math.min(b, c));
            }
        }
        return MV[0][A.length - 1];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //int[] B = { 18, 20, 15, 30, 10, 14};
        Scanner s = new Scanner(System.in);
        int p;
        System.out.println("Enter No. of players :");
        p=s.nextInt();
        System.out.println("Enter no of element in array :");
        int n;
        n=s.nextInt();
        int b[]=new int[n];
        System.out.println("\nArray Elements :");
        for(int i =0;i<n;i++)
        {
            b[i] = s.nextInt();
        }
        //here player1 chooses all odd places digits (18+15+10 = 43)
        //And player2 chooses all even places digits (20+30+14 = 64)
        System.out.println("Max value pick up by Player2 = " + coin(b));
    }
    
}
