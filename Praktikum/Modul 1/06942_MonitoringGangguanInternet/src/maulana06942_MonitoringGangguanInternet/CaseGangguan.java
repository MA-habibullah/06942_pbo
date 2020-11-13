package maulana06942_MonitoringGangguanInternet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class CaseGangguan {
    
    ArrayList <CaseGangguanEntity> ArrayCaseGangguan = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    public void TampilanMenu(){   
        int Index, Pilihan, NoCase, IdPelanggan, IdHelpdesk;
        String Komplain;
        Date Tanggal;
        do{
            System.out.println("Menu Case Gangguan");
            System.out.println("1. Create Case");
            System.out.println("2. Edit Case");
            System.out.println("3. Delete Case");
            System.out.println("4. Tampilkan Case");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Nomor Case          = "); NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); Komplain = input.next();
                    ArrayCaseGangguan.add(new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); 
                        Index = input.nextInt();
                    System.out.print("Nomor Case          = "); 
                        NoCase = input.nextInt();
                    System.out.print("Tanggal(dd/mm/yyyy) = "); 
                        Tanggal = new Date(input.next());
                    System.out.print("Id Pelanggan        = "); 
                        IdPelanggan = input.nextInt();
                    System.out.print("Id Helpdesk         = "); 
                        IdHelpdesk = input.nextInt();
                    System.out.print("Komplain            = "); 
                        Komplain = input.next();
                    ArrayCaseGangguan.set(Index, new CaseGangguanEntity(NoCase, Tanggal, IdPelanggan, IdHelpdesk, Komplain));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    ArrayCaseGangguan.remove(Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<ArrayCaseGangguan.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Nomor Case          = "+ArrayCaseGangguan.get(i).GetNoCase());
                        System.out.println("Tanggal(dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(ArrayCaseGangguan.get(i).GetTanggal()));
                        System.out.println("Id Pelanggan        = "+ArrayCaseGangguan.get(i).GetIdPelanggan());
                        System.out.println("Id Helpdesk         = "+ArrayCaseGangguan.get(i).GetIdHelpdesk());
                        System.out.println("Komplain            = "+ArrayCaseGangguan.get(i).GetKomplain());
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
        ArrayCaseGangguan.add(new CaseGangguanEntity(1, new Date("02/02/2019"), 123, 234, "Internet Mati"));
        ArrayCaseGangguan.add(new CaseGangguanEntity(2, new Date("02/02/2019"), 345, 456, "Router Mati"));
        ArrayCaseGangguan.add(new CaseGangguanEntity(3, new Date("02/02/2019"), 567, 678, "Putus putus"));
    }
}
