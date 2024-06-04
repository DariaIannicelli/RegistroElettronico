package com.mycompany.registroelettronico;
import java.util.Vector;
import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Studente {
    private String Nome;
    private String Cognome;
    private Date DataNascita;
    private int IDStudente;
    Vector Voti;
    public Studente(){
        
    }
    
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
       String stmp="";
       Date dtmp=null;
       for(int i=0;i<Voti.size();i++){
           v=(Voto)Voti.elementAt(i);
           stmp=v.getMateria();
           if(stmp==m){
               dtmp=v.getDataVoto();
               if(dtmp==d){
                   tmp=v;
               }
           }
       }
       
       return tmp;
    }
    public void setVoto(String m, Date d, double v){
        Voto tmp= new Voto();
        tmp.setMateria(m);
        tmp.setDataVoto(d);
        tmp.setvoto(v);
        
        Voti.add(tmp);
    }
    public void CancellaVoto(String m, Date d){
        int k=-1;
        Voto v=new Voto();
        Voto tmp=new Voto();
        String stmp="";
        Date dtmp=null;
        for(int i=0;i<Voti.size();i++){
           v=(Voto)Voti.elementAt(i);
           stmp=v.getMateria();
           if(stmp==m){
               dtmp=v.getDataVoto();
               if(dtmp==d){
                   Voti.removeElementAt(k);
                   System.out.println("ho cancellato questo voto");
                   tmp=v;
               }
           }
       }
        if(k<0){
            System.out.println("non ho trovato il voto secondo i criteri");
        }
    }
    public void ModificaVoto(String m, Date d,double x){
        int k=-1;
        Voto v=new Voto();
        Voto tmp=new Voto();
        String stmp="";
        Date dtmp=null;
        for(int i=0;i<Voti.size();i++){
           v=(Voto)Voti.elementAt(i);
           stmp=v.getMateria();
           if(stmp==m){
               dtmp=v.getDataVoto();
               if(dtmp==d){
                   tmp.setDataVoto(d);
                   tmp.setMateria(m);
                   tmp.setvoto(x);
                   System.out.println("ho modificato questo voto");
                   tmp=v;
               }
           }
       }
        if(k<0){
            System.out.println("non ho trovato il voto secondo i criteri");
        }
    }
    public void StampaDettaglioStudente(){
        Voto tmp=new Voto();
        System.out.println("Nome: " + Nome);
        System.out.println("Cognome: " + Cognome);
        System.out.println("Data di Nascita: " + DataNascita);
        int k=0;
        System.out.println();
        System.out.println("Voti:");
        System.out.printf("%-15s %-15s %-5s%n", "Materia", "Data", "Voto");
        System.out.println("----------------------------------------");
        for (k=0;k<Voti.size();k++) {
            tmp=(Voto)Voti.elementAt(k);
            System.out.printf("%-15s %-15s %-5d%n", tmp.getMateria(), tmp.getDataVoto(), tmp.getvoto());
        }
    }
    public int getIDStudente(){
        return IDStudente;
    }
    public void setIDStudente(int x){
        IDStudente=x;
    }
    
    public void InputStudente(){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Inserisci il cognome: ");
            Cognome=sc.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("Errore nell'inserimento del cognome");
        }
        
        try{
            System.out.println("Inserisci il nome: ");
            Nome=sc.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("Errore nell'inserimento del nome");
        }
        
        SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
        String tmp="";
        try{
            System.out.println("Inserisci la data di nascita (nel formato dd-MM-yyyy): ");
            tmp=sc.nextLine();
            try{
                DataNascita= sd.parse(tmp);
            }
            catch(ParseException e1){
                System.out.println("Errore nel formato della data");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Errore nell'inserimento della data");
        }
        sc.close();
    }
}

