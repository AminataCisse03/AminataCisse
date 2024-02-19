package src.services;

import java.util.List;

import bin.repositories.ZoneRepository;
import src.entities.Zone;

public class ZoneService {
    ZoneRepository zoneRepository=new ZoneRepository();
   
   public  List<Zone>listerZone(){
    
        return zoneRepository.selectAll();
    }
    public void ajouterZone(Zone zone){
        zoneRepository.insert(zone);
    }

}
