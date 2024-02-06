package services;
import java.util.ArrayList;
import entities.Client;
import entities.Compte;
import repositories.CompteRepository;

public class CompteService {
    CompteRepository CompteRepository= new CompteRepository();
    public void ajouterCompte(Compte compte){
        CompteRepository.insert(compte);
    }


    public static ArrayList<Compte> listerCompte(){
        return CompteRepository.selectAll();
    }

    public ArrayList<Compte> listerCompte(Client client){
        return null;
    }
}
