package src.repositories;

import java.util.ArrayList;
import java.util.List;

import src.entities.Bien;

public class BienRepository {
     private List<Bien> tBiens=new ArrayList<>();

     public  List<Bien> selectAll(){
        return tBiens;
     }
    
     //update
     //delete
     //insert
     public  void insert(Bien bien){
         tBiens.add(bien);
      }
}
