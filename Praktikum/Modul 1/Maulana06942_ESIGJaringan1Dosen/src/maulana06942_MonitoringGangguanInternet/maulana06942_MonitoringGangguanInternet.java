package maulana06942_MonitoringGangguanInternet;
import java.util.Scanner;

public class maulana06942_MonitoringGangguanInternet { 
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Monitoring Case Gangguan");
        int Pilihan;
        
        CaseGangguan CaseGanggu = new CaseGangguan();
        Helpdesk HelpD = new Helpdesk();
        Pelanggan PelG = new Pelanggan();
        
        //Tambahkan Contoh Sample Data
        HelpD.TambahSample();
        PelG.TambahSample();
        CaseGanggu.TambahSample();
        //Tambahkan Contoh Sample Data
        
        do{
            System.out.println("1. List Case Gangguan");
            System.out.println("2. List Pelanggan");
            System.out.println("3. List Helpdesk");
            System.out.println("4. Exit");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    CaseGanggu.TampilanMenu();
                    break;
                case 2:
                    PelG.TampilanMenu();
                    break;
//                case 3:
//                    HelpD.TampilanMenu();
//                    break;
                case 4:
                    System.out.println("Terima Kasih !");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        }while(Pilihan!=4);
    }
}
