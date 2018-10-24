package Mnoziny;



public class prunik {

public void prunik(int[] gen1, int[] gen2) {
    
    
    System.out.println("-!-!-!-!-!-!-!-!");
    
    int[] slouceni = new int[gen1.length + gen2.length];
       for (int i = 0; i < gen1.length; i++) {
            slouceni[i] = gen1[i];
        }
       for (int i = 0; i < gen2.length; i++) {
           slouceni[i+gen1.length] = gen2[i];
       }
       
       for (int i = 0; i < slouceni.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < slouceni.length; j++)
                if (slouceni[j] < slouceni[index]) 
                    index = j;
      
            int mensiCislo = slouceni[index];  
            slouceni[index] = slouceni[i];
            slouceni[i] = mensiCislo;
        }
    
      
       
    for (int i = 0; i < gen1.length; i++) {
           
           System.out.println(gen1[i]);
           System.out.println("Druhá množina >");
           System.out.println(gen2[i]);
       
   }
    
}


    
}
