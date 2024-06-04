package com.mycompany.registroelettronico;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;

public class Registro {
    private int UltimoId=0;
    private FileOutputStream f;
    public Registro(){
        
    }
    
    public void ScriviStudente(Studente st){
        UltimoId++;
        try{
            f= new FileOutputStream("Studente.dat, true"); 
            ObjectOutputStream obj= new ObjectOutputStream(f);
            obj.writeObject(st);
            f.close();
        }
        catch(IOException e){
            System.out.println("Errore nell'apertura del file");
        }
    }
    
    public Studente LeggiStudente(){
        Studente tmp= new Studente();
        
        
        return tmp;
    }
    
    public void ScriviVoto(Voto v, int ID){
        
    }
    
    public Voto LeggiVoto(){
        Voto tmp= new Voto();
        return tmp;
    }
}
