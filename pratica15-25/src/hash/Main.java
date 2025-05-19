package hash;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        HashMap<Targa,Proprietario> targaProprietario=new HashMap<Targa,Proprietario>();
        //Inserimento
        for (int i=0; i<3; i++){
            System.out.println("Inserire targa: ");
            Targa t=new Targa(in.nextLine().trim());
            System.out.println("Inserire Nome, Cognome e Codice Fiscale");
            Proprietario p=new Proprietario(in.nextLine().trim(),in.nextLine().trim(),in.nextLine().trim());
            targaProprietario.put(t,p);
        }
        System.out.println(targaProprietario); //Stampa prima

        //Reinserimento 4
        System.out.println("Inserire targa: ");
        Targa t=new Targa(in.nextLine().trim());
        Proprietario precedente=targaProprietario.get(t);

        System.out.println("Inserire Nome, Cognome e Codice Fiscale");
        Proprietario p=new Proprietario(in.nextLine().trim(),in.nextLine().trim(),in.nextLine().trim());
        targaProprietario.put(t,p);
        System.out.println(targaProprietario); //Stampa seconda

        System.out.println("----------------------------------\nCome noti l'elemento con la stessa chiave con propr: \n"+precedente+"\n diventa prop: \n"+p+"----------------------------------\n");

        //Controllo sovrascrittura
        System.out.println("Inserire targa: ");
        Targa t1=new Targa(in.nextLine().trim());
        if (!targaProprietario.containsKey(t1)){
            System.out.println("Inserire Nome, Cognome e Codice Fiscale");
            Proprietario p1=new Proprietario(in.nextLine().trim(),in.nextLine().trim(),in.nextLine().trim());
            targaProprietario.put(t1,p1);
        }
        System.out.println(targaProprietario); //Stampa terza

        //Inverti la mappa
        HashMap<Proprietario,Targa> proprietarioTarga =new HashMap<Proprietario,Targa>();
        for (Targa targa: targaProprietario.keySet()){
            proprietarioTarga.put(targaProprietario.get(targa),targa);
        }
        System.out.println(proprietarioTarga);
    }
}