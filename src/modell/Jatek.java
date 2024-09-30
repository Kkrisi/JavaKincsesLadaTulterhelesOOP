

package modell;

import java.util.Scanner;



public class Jatek {
    
    private static final Scanner sc = new Scanner(System.in);
    
    private Lada[] ladak;
    private int valasztas;

    public Jatek() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset!", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik!");
        
        ladak[1].KincsetElhelyez();
        
        System.out.println(kezdes());
        bekeres();
        megjelenit(ellenorzes());
        vege();
    }
    
    
    public String kezdes(){
        String s = "Hol a kincs? csak az egyik felirat az igaz!\n";
        
        int i = 1;
        for (Lada lada : ladak){
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + "." + a + "láda:" + f + "\n";
        }
        return s;
    }
    
    public void bekeres(){
        
        megjelenit("Melyik ládában van a kincs? (1,2,3): \n");
        int v = sc.nextInt() -1;  
        
        //sc.close();
        
    }    
    
    public String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        s = ladak[valasztas].isKincs() ? s : "Sajnos nem talált!";
        
        
        return s;
    }
    
    
    public void megjelenit(String uzenet){
        System.out.print(uzenet);
    }
    
    private void vege(){
        sc.close();
    }
    
}
