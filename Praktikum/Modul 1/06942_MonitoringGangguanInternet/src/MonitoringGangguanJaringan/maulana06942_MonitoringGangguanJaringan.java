package MonitoringGangguanJaringan;
import java.util.Scanner;

public class maulana06942_MonitoringGangguanJaringan { 
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Dtang di Aplikasi Monitoring Case Gangguan");
        int Pilihan;
        
        CaseGangguan CaseGGN = new CaseGangguan();
        Helpdesk HD = new Helpdesk();
        Pelanggan PLG = new Pelanggan();
        
        //Tambahkan Contoh Sample Data
        HD.TambahSample();
        PLG.TambahSample();
        CaseGGN.TambahSample();
        //Tambahkan Contoh Sample Data
        
        do{
            System.out.println("1. List Case Gangguan");
            System.out.println("2. List Pelanggan");
            System.out.println("3. List Helpdesk");
            System.out.println("4. Exit");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    CaseGGN.TampilanMenu();
                    break;
                case 2:
                    PLG.TampilanMenu();
                    break;
                case 3:
                    HD.TampilanMenu();
                    break;
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
