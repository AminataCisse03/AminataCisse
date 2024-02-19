package src.services;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import src.entities.Bien;
import src.entities.Zone;
import src.services.ZoneService;

public class View {
    public static void main(String[] args) throws Exception {
        int choix;
         Scanner sc=new Scanner(System.in);
         //Dependances
         BienService agenceService=new BienService();
         ZoneService clientService=new ZoneService();
         
         do {
             System.out.println("1-Créer une zone");
             System.out.println("2-Lister les zones"); 
             System.out.println("3-Ajouter un bien et lui associe une zone"); 
             System.out.println("4-Lister les biens en affichant le nom de la zone "); 
             System.out.println("5-Quitter"); 
              choix=sc.nextInt();
              sc.nextLine();
              switch (choix) {
                case 1:
                     System.out.println("Entrer un nom");
                     String nomZone=sc.nextLine(); 
                    Zone zone=new Zone();
                    break;
                
                case 2:
                List<Zone> zones= Zone.listerZone();
                     for (Zone zone :zones) {
                          System.out.println("id "+ zone.getId());
                          System.out.println("nomZone "+ zone.getNomZone());
                          System.out.println("=================================");
                     }
                     break;

                 case 3:
                     System.out.println("Entrer un id");
                     String id=sc.nextLine(); 
                     System.out.println("Entrer une reference");
                     String reference=sc.nextLine();  
                     System.out.println("Entrer une description");
                     String description=sc.nextLine();  
                     System.out.println("Entrer un prix");
                     int prix=sc.nextLine();  
                     System.out.println("Entrer une date");
                     Date date=sc.nextLine();  
                     Bien bn=new Bien();
                      bn.setId(id);
                      bn.setReference(reference);
                      bn.setDescription(description);
                      bn.setPrix(prix);
                      bn.setDateCreation(date);
                      bienService.ajouterBien(bn);

                    break;    

                
                    }
                }while(choix!=5);

     }

           }







