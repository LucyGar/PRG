package Mnoziny;



public class prunik {


public void prunik(int[] gen1, int[] gen2) {
    System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
    int i = 0;
    int o = 0;
    int plus = 0;
    int n = 0;
    
       
       for (int ic = 0; ic < gen1.length; ic++) {
           
            int a = gen1[i];
            int c = gen2[o];
       
          if (a == c) {
           int[] cislo = new int[20];
           cislo[plus] = a;
           System.out.println(cislo[plus]);
           i = i + 1;
           o = 0;
           plus = plus + 1;
           
       }    
       else {
           o = o + 1;
       }
           System.out.println("------");
   }
}
}