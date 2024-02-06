package entities;

public class Epargne extends Compte {
    private double taux;

    public double getTaux(){
        return taux;
    }

    public void setTaux(double taux){
        this.taux= taux;
    }

    public void setNumero(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNumero'");
    }
}
