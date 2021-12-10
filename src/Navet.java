public class Navet extends Legume implements Printemps {
    private final static double poidsg=(int)(Math.random()*11)+300;
    private final static double prixkg = 1.38 ;
    private static int cpt=1;
    
    public Navet(){
        super("Navet"+" n°"+cpt,poidsg,prixkg,"graine");
        cpt++;
    }
    public double getPrix(){
        return Navet.prixkg*Navet.poidsg/1000;
    }
    public int getCpt(){
        return cpt;
    }

    
    @Override
    public boolean isPrintemps(Serre s) {
        if(s.getSaison() == "Printemps"){
            return true;
        }
        return false;
    }

    @Override
    public void pousse(Vegetaux v, Serre s) {
        if(isPrintemps(s)){
            if(Math.random() < 0.8){
                v.pousser();
            }
        }
        else{
            if(Math.random() < 0.1){
                v.pousser();
            }
        }
    }
    
}
