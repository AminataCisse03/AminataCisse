package src.repositories;

import java.util.ArrayList;
import java.util.List;

import src.entities.Zone;

public class ZoneRepository {
      List<Zone> tZones=new ArrayList<>();
      public void insert(Zone zone){
        tZones.add(zone);
      }

      public List<Zone> selectAll(){
        return tZones;
      }
    
          
          

      
}
