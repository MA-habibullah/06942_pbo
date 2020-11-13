
package maulana06942_MonitoringGangguanInternet;

import java.util.ArrayList;
import java.util.Scanner;

public class Helpdesk {
    ArrayList <HelpdeskEntity> ArrayHelpdesk = new ArrayList();
    Scanner input = new Scanner(System.in);
    public void TampilanMenu(){
        int Index, Pilihan, IdHelpdesk, Kontak;
        String NamaHelpdesk;
        do{
            System.out.println("Menu Helpdesk");
            System.out.println("1. Create Helpdesk");
            System.out.println("2. Edit Helpdesk");
            System.out.println("3. Delete Helpdesk");
            System.out.println("4. Tampilkan Helpdesk");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Helpdesk   = "); IdHelpdesk = input.nextInt();
                    System.out.print("Nama Helpdesk = "); NamaHelpdesk = input.next();
                    System.out.print("Kontak        = "); Kontak = input.nextInt();
                    ArrayHelpdesk.add(new HelpdeskEntity(IdHelpdesk, NamaHelpdesk, Kontak));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); Index = input.nextInt();
                    System.out.print("Id Helpdesk   = "); IdHelpdesk = input.nextInt();
                    System.out.print("Nama Helpdesk = "); NamaHelpdesk = input.next();
                    System.out.print("Kontak        = "); Kontak = input.nextInt();
                    ArrayHelpdesk.set(Index, new HelpdeskEntity(IdHelpdesk, NamaHelpdesk, Kontak));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    ArrayHelpdesk.remove(Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<ArrayHelpdesk.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Id Helpdesk   = "+ArrayHelpdesk.get(i).GetIdHelpdesk());
                        System.out.println("Nama Helpdesk = "+ArrayHelpdesk.get(i).GetNamaHelpdesk());
                        System.out.println("Kontak        = "+ArrayHelpdesk.get(i).GetKontak());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
        
    }
    
    public void TambahSample(){
        ArrayHelpdesk.add(new HelpdeskEntity(123, "Helpdesk Jakarta", 234));
        ArrayHelpdesk.add(new HelpdeskEntity(345, "Helpdesk Surabaya", 456));
        ArrayHelpdesk.add(new HelpdeskEntity(567, "Helpdesk Semarang", 678));
    }
}
