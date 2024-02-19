package src.entities;

import java.util.List;

public class Zone {
    private int id;
    private String nomZone;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomZone() {
        return nomZone;
    }
    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }
    public static List<Zone> listerZone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listerZone'");
    }
}
