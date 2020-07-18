/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coruscate.task2;

import java.util.Scanner;

/**
 *
 * @author Manuni
 */
public class CoruscateTask2 {
    public static int facingseat(int n)
    {
//from the figure it is clear that the window seats will have a difference of either 1 or 11 with their facing seats.
//For middle seats the difference is either 3 or 9.
//And for aisle seats difference is either 7 or 5.        
 	int ch;
 	ch = n % 12;
 	switch(ch)
 	{
            //if seat number is 1 then facing seat22 will be 1+(11) = 12
 		case 0: n-=11;
 				System.out.println( n + "WS");
 				break;

 		case 1: n+=11;
 				System.out.println( n + "WS");
 				break;
//if seat number is 26 then facing seat will be 26+(9)=35
 		case 2: n+=9;
 				System.out.println( n + "MS");
 				break;	
//if seat is 39 then facing seat  will be 39+(7)=46
 		case 3: n+=7;
 				System.out.println( n + "AS");
 				break;
//if seat is 28 then facing seat will be 28+(5)=33
 		case 4: n+=5;
 				System.out.println( n + "AS");
 				break;
//if seat is 77 then facing seat will be 77+(3)=80
 		case 5: n+=3;
 				System.out.println( n + "MS");
 				break;

 		case 6: n+=1;
 				System.out.println( n + "WS");
 				break;

 		case 7: n-=1;
 				System.out.println( n + "WS");
 				break;

 		case 8: n-=3;
 				System.out.println( n + "MS");
 				break;

 		case 9: n-=5;
 				System.out.println( n + "AS");
 				break;

 		case 10: n-=7;
 				System.out.println( n + "AS");
 				break;

 		case 11: n-=9;
 				System.out.println( n + "MS");
 				break;
 	}
 	return 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t , n;
        //t variable will take the test case input
        //n variable will take the seat number according to cases entered.
	Scanner s = new Scanner(System.in);
	t = s.nextInt();
	for(int i=1 ; i<=t ; i++)
	{
		System.out.println("Enter seat number :");
		n = s.nextInt();
                //function call
		facingseat(n);
	}
    }
    
}
