package Mnoziny;

import java.util.Arrays;

public class Doplnek {
    
  public void Doplnek(int[] gen1, int[] gen2) {
      int pocetDvoj = 0;
       for (int i = 0; i < gen1.length - 1; i++){
           
                if (gen1[i] == gen1[i + 1]) {
                 pocetDvoj++;   
        } 
       }       
  int[] dop1 = new int[gen1.length - pocetDvoj];
  
    int p = 0;
        for (int i = 0; i < gen1.length - 1; i++){  
         if (gen1[i] != gen1[i + 1]) { 
                dop1[p] = gen1[i];
                p++;
           }
         if (i == gen1.length - 2) {
            dop1[p] = gen1[i+1];
                    i++;
         }            
  }
        pocetDvoj = 0;
       for (int i = 0; i < gen2.length - 1; i++){
           
                if (gen2[i] == gen2[i + 1]) {
                 pocetDvoj++;   
        } 
       }       
  int[] dop2 = new int[gen2.length - pocetDvoj];
  
        p = 0;
        for (int i = 0; i < gen2.length - 1; i++){  
         if (gen2[i] != gen2[i + 1]) { 
                dop2[p] = gen2[i];
                p++;
           }
         if (i == gen2.length - 2) {
            dop2[p] = gen2[i+1];
                    i++;
         }            
  }
        p = 0;
        int poradi = 0;
        int pocet  = 0;
                
        if (dop1.length < dop2.length) {
        for (int i = 0; i < dop2.length - 1; i++) {
            do  {
            if (dop1[poradi] != dop2[i]) {
                poradi++;
                p++;
            }
            else {
                pocet++;
                poradi++;
                p++;
            }            
            } while (p != dop1.length); 
           
             
            p = 0;
            poradi = 0;
        }
        
        if (pocet == dop1.length) {
          int[] doplnekBA = new int[dop2.length - dop1.length];
             p = 0;
            poradi = 0;
            int por = 0;
            boolean ulozit = true;
            
            for (int i = 0; i < dop2.length - 1; i++) {
           
            do  {
            if (dop1[poradi] != dop2[i]) {
                poradi++;
                p++;
            }
            else {
                ulozit = false;
                poradi++;
                p++;
            }            
            } while (p != dop1.length); 
           
            if (ulozit == true) {
                doplnekBA[por] = dop2[i];
                por++;
            }
             if (por == doplnekBA.length - 1) {
                doplnekBA[por] = dop2[i +1];
               i++;  
              }
             
            p = 0;
            poradi = 0;
            ulozit = true;  
        }
            System.out.println("");
            System.out.println("Doplněk BA");
            System.out.println("▼");
             System.out.println(Arrays.toString(doplnekBA));
             System.out.println("▲");
        }
        else {
            System.out.println("▼");
            System.out.println("Doplněk pro tyto množiny neexistuje.");
            System.out.println("▲");
        }
        }
        
      else {
        for (int i = 0; i < dop1.length - 1; i++) {
            do  {
            if (dop2[poradi] != dop1[i]) {
                poradi++;
                p++;
            }
            else {
                pocet++;
                poradi++;
                p++;
            }            
            } while (p != dop2.length); 
             
            p = 0;
            poradi = 0;
        }
        if (pocet == dop2.length) {
            int[] doplnekAB = new int[dop1.length - dop2.length];
             p = 0;
            poradi = 0;
            int por = 0;
            boolean ulozit = true;
            
            for (int i = 0; i < dop1.length - 1; i++) {
           
            do  {
            if (dop2[poradi] != dop1[i]) {
                poradi++;
                p++;
            }
            else {
                ulozit = false;
                poradi++;
                p++;
            }            
            } while (p != dop2.length); 
           
            if (ulozit == true) {
                doplnekAB[por] = dop1[i];
                por++;
            }
             if (por == doplnekAB.length - 1) {
                doplnekAB[por] = dop1[i +1];
               i++;  
              }
             
            p = 0;
            poradi = 0;
            ulozit = true;  
        } 
            System.out.println("Doplněk AB");
            System.out.println("▼");
             System.out.println(Arrays.toString(doplnekAB));
             System.out.println("▲");
        }
        else {
            System.out.println("▼");
            System.out.println("Doplněk pro tyto množiny neexistuje.");
            System.out.println("▲");
        }
         }
}
}    

