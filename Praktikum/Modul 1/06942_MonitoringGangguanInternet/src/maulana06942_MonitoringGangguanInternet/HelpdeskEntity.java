package maulana06942_MonitoringGangguanInternet;

public class HelpdeskEntity {
    int IdHelpdesk, Kontak;
    String NamaHelpdesk;

    public HelpdeskEntity(int IdHelpdesk, String NamaHelpdesk, int Kontak){
        this.IdHelpdesk=IdHelpdesk;
        this.NamaHelpdesk=NamaHelpdesk;
        this.Kontak=Kontak;

    }
    int GetIdHelpdesk(){
        return this.IdHelpdesk;
    }
    String GetNamaHelpdesk(){
        return this.NamaHelpdesk;
    }
    int GetKontak(){
        return this.Kontak;
    }
 }
