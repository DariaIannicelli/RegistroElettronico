package com.mycompany.registroelettronico;
import java.util.Vector;
import java.util.Date;

public class Studente {
    private String Nome;
    private String Cognome;
    private Date DataNascita;
    Vector Voti;
    
    public Studente(String n,String c, Date d){
        Nome=n;
        Cognome=c;
        DataNascita=d;
        Voti= new Vector<Voto>();
            
        
    }
    public String getNome(){
        return Nome;
    }
    public String getCognome(){
        return Cognome;
    }
    public Date getDataNascita(){
        return DataNascita;
    }
    public void setNome(String x){
        Nome=x;
    }
    public void setCognome(String y){
        Cognome=y;
    }
    public void setDataNascita(Date x){
        DataNascita=x;
    }
    public String toString(){
        String tmp;
        tmp="nome studente: "+Nome+"\n";
        tmp=tmp+"Cognome studente: "+Cognome+"\n";
        tmp=tmp+"Data studente: "+DataNascita+"\n";
        return tmp;
    }
    public void setVoto(Voto v){
        Voti.add(v);
    }
    public Voto getVoto(String m, Date d){
       Voto v=new Voto();
       Voto tmp=new Voto();
       for(int i=0;i<Voti.size();i++){
           v=(Voto)Voti.elementAt(i);
           if(v.getMateria().localeCompare(m)==0){
               if(v.getDataVoto()==d){
                   tmp=v;
               }
           }
       }
       
       return tmp;
    }
}

