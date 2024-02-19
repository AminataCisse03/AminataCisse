package src.entities;

import java.sql.Date;

public class Bien {
    private int id;
    private String reference;
    private String description;
    private int prix;
    private Date dateCreation;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date date) {
        this.dateCreation = date;
    }
    public String getNomZone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNomZone'");
    }
    public void setId(String id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
