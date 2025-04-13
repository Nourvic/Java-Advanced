import java.util.Objects;

public class ExtremesRisiko extends InakzeptablesRisiko{
    private float versicherungsbeitrag;

    public ExtremesRisiko(String bezeichnung, float eintrttswahrscheinlichkeit, float kosten_im_schadensfall, String massnahme, float versicherungsbeitrag) {
        super(bezeichnung, eintrttswahrscheinlichkeit, kosten_im_schadensfall, massnahme);
        this.versicherungsbeitrag = versicherungsbeitrag;
    }

    public float getVersicherungsbeitrag() {
        return versicherungsbeitrag;
    }

    public void setVersicherungsbeitrag(float versicherungsbeitrag) {
        this.versicherungsbeitrag = versicherungsbeitrag;
    }



    @Override
    public float ermittleRueckstellung(){

        return  versicherungsbeitrag * versicherungsbeitrag ;
    }

    @Override
    public void druckeDaten(){

        System.out.println(" Id "+ getId() + " Extremes Risiko  " + getBezeichnung() +
                " aus " + getErstellungsdatum().getMonth()+"/"+getErstellungsdatum().getYear()+";"+ " Versicherungsbeitrag  "+
                getVersicherungsbeitrag()+";"+ " Maßnahme " + getMassnahme()
        );

    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),versicherungsbeitrag);
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
        ExtremesRisiko ris = (ExtremesRisiko) o;

        //fachliche Gleichheit vom Objektzustaende

        if(super.equals(ris)&&ris.versicherungsbeitrag==this.versicherungsbeitrag){
            return true;
        }

        return false;
    }
}
