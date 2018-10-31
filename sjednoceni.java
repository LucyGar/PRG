
package mnoziny;

public class sjednoceni {

   public void sjednot(int[] gen1, int[] gen2) {
       
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
      
       
      int pocetDvoj = 0;
       for (int i = 0; i < slouceni.length - 1; i++){
           
                if (slouceni[i] == slouceni[i + 1]) {
                 pocetDvoj++;   
        } 
       }
       System.out.println("Pocet dvojic je " + pocetDvoj);
       System.out.println("Pocet cisel je " + slouceni.length);
       
        int[] sjednoceni = new int[slouceni.length - pocetDvoj];
     
       int p = 0;
        for (int i = 0; i == slouceni.length; i++){  
        if (i == slouceni.length - 1) {
            sjednoceni[p] = slouceni[i + 1];
            i++;
        }
        else if (slouceni[i] != slouceni[i + 1]) { 
                sjednoceni[p] = slouceni[i];
                p++;
           }
                }
   
                
        System.out.println("--------");
       for (int i = 0; i < slouceni.length; i++) {
           System.out.println(slouceni[i]);
       }
   
       
        
       System.out.println("--------");
       for (int i = 0; i < sjednoceni.length; i++) {
           
           System.out.println(sjednoceni[i]);
       
   }
        } 
}





