import java.time.LocalDate;
import java.util.Objects;

public abstract class Risiko {

    private final int id;
     private static int idnummer=0;
    private String bezeichnung;

    private float eintrttswahrscheinlichkeit;

    private float kosten_im_schadensfall;

    private float risikowert;

    private LocalDate erstellungsdatum;


    public Risiko(String bezeichnung,float eintrttswahrscheinlichkeit,float kosten_im_schadensfall){
        this.bezeichnung =bezeichnung;
        this.eintrttswahrscheinlichkeit=eintrttswahrscheinlichkeit;
        this.kosten_im_schadensfall=kosten_im_schadensfall;
        this.id=idnummer++;
        erstellungsdatum= LocalDate.now();
        risikowert=berechneRisikowert();
    }

    public int getId(){
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public float getEintrttswahrscheinlichkeit() {
        return eintrttswahrscheinlichkeit;
    }

    public void setEintrttswahrscheinlichkeit(float eintrttswahrscheinlichkeit) {
        this.eintrttswahrscheinlichkeit = eintrttswahrscheinlichkeit;
    }

    public float getKosten_im_schadensfall() {
        return kosten_im_schadensfall;
    }

    public void setKosten_im_schadensfall(float kosten_im_schadensfall) {
        this.kosten_im_schadensfall = kosten_im_schadensfall;
    }

    public LocalDate getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(LocalDate erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }
    public float getRisikowert(){
        return risikowert;
    }

    public float berechneRisikowert(){
        return eintrttswahrscheinlichkeit * kosten_im_schadensfall;
    }

    public abstract float ermittleRueckstellung();
    public abstract void druckeDaten();


    @Override
    public int hashCode(){
        return Objects.hash(bezeichnung,eintrttswahrscheinlichkeit,kosten_im_schadensfall);
    }
    @Override
    public boolean equals(Object o){
        //Referrenz
        if(this==o){
            return true;
        }
        //Parameter ist null
        if(this==null){
            return false;
        }
        //Klassenvergleich
        if(this.getClass()!=o.getClass()){
            return false;
        }
        //Typkonvertierung
        Risiko ris = (Risiko) o;

       //fachliche Gleichheit vom Objektzustaende

        if(ris.bezeichnung.equals(this.bezeichnung)&&ris.kosten_im_schadensfall==this.kosten_im_schadensfall
        &&ris.eintrttswahrscheinlichkeit==this.eintrttswahrscheinlichkeit
        ){
            return true;
        }

        return false;
    }
}
