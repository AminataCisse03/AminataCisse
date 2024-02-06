package repositories;

import java.util.ArrayList;


import entities.Compte;

public class CompteRepository {

      ArrayList<Compte> comptes= new ArrayList<>();
      public void insert(Compte compte){
        comptes.add(compte);
      }

      public ArrayList<Compte> selectAll(){
        return comptes;
      }
}

