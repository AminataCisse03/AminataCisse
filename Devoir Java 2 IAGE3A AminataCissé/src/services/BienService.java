package src.services;

import java.util.List;

import src.entities.Bien;
import src.entities.Zone;
import src.repositories.BienRepository;

public class BienService {
   private BienRepository bienRepository=new BienRepository();
    
  public List<Bien> listerBien(){
      return bienRepository.selectAll();
   }
  
   public void ajouterBien(Bien bien){
    bienRepository.insert(bien);
   }

public List<Zone> listerZone() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listerZone'");
}
}
