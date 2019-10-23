package luta;
public class Luta {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
                
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.9f, 14, 2, 3);
        
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5] = new Lutador("Claudio", "Brasil", 19, 1.66f, 65.0f, 19, 0, 0);        
       
     Lutar UEC01 = new Lutar();
     UEC01.marcarLuta(l[0],l[5]);
     UEC01.lutar();
     l[0].status();
     l[5].status();
        
    }
    
}
