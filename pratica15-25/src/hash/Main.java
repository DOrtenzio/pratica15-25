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
    }
}