/*      Title: Histogram

        Abstract: This program takes input in whole number from the user and display those numbers with their occurrence.
        it also creates vertical bar for the occurrences.

        Author: Prajwal Pisal

        Date: 10/9/2021

 */

import java.util.*;

public class Histogram {

    public static void main(String args[]) {
        //Declaring and initializing variables
        int a = 0;
        int b = 0;
        int u = 0;

        //Declaring scanner object
        Scanner capture = new Scanner(System.in);
        System.out.println("How many input values [MAX:  30]?");

        //Taking input
        int x = capture.nextInt();
        ArrayList<Integer> Digits = new ArrayList<>();
        System.out.println("Enter " + x + " numbers.");

        //Declaring and initializing HashMap object
        HashMap<Integer, Integer> Occur = new HashMap<>();

        // Initialize Hashmap
        for(int i=0;i<10;i++){
            Occur.put(i,0);
        }




        int tmp = x;
        // Initialize ArrayList
        while(tmp>0){
            Digits.add(capture.nextInt());
            tmp--;
        }



        // ----------------------------
        while (b < x) {
            if (Occur.get(Digits.get(b)) != null) {
                int cnt = Occur.get(Digits.get(b)) + 1;
                Occur.put(Digits.get(b), cnt);
            }
            else {
                Occur.put(Digits.get(b), 1);
            }
            b++;
        }

        int height = 0;
        System.out.println("\nNumber    Occurrence");

        height = 0;
        for(Map.Entry<Integer,Integer> entry : Occur.entrySet()){
            if(entry.getValue()>0){
                System.out.println(entry.getKey() + "        " + entry.getValue());
            }
            if(entry.getValue()>height){
                height = entry.getValue();
            }
        }

        System.out.println("================= Vertical bar =================");

        //Printing histogram
        int h = height;
        while ( h > 0) {

            System.out.print("| "+h+" | ");

            int g = 0;
            while (g < 10) {
                if(Occur.get(g) != null) {
                    int kallen =  Occur.get(g);
                    if(kallen >= h)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else
                {
                    System.out.print(" ");
                }
                g++;
            }
            System.out.print("\n");
            h--;
        }
        System.out.println("================================================");
        System.out.print("| N |");
        while ( u < 10 ) {
            System.out.print(" "+ u );
            u++;
        }
        System.out.println("\n================================================");
    }
}
