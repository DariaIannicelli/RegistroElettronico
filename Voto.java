package com.mycompany.registroelettronico;
import java.util.Date;

class Voto {
    private double voto;
    private Date DataVoto;
    private String Materia;
    public Voto(){
        
    }
    public Voto(double v, Date d, String m){
        voto=v;
        DataVoto=d;
        Materia=m;
    }
    public double getvoto(){
        return voto;
    }
    public Date getDataVoto(){
        return DataVoto;
    }
    public String getMateria(){
        return Materia;
    }
    public void setvoto(double x){
        voto=x;
    }
    public void setDataVoto(Date x){
        DataVoto=x;
    }
    public void setMateria(String x){
        Materia=x;
    }
    public String toString(){
        String tmp;
        tmp="Voto riportato: "+voto+"\n";
        tmp= tmp+"data del voto: "+DataVoto+"\n";
        tmp=tmp+"materia voto: "+Materia+"\n";
        return tmp;
    }
}
