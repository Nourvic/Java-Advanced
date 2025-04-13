import java.util.Objects;

public class InakzeptablesRisiko extends Risiko{
    private String massnahme;

    public InakzeptablesRisiko(String bezeichnung, float eintrttswahrscheinlichkeit, float kosten_im_schadensfall, String massnahme) {
        super(bezeichnung, eintrttswahrscheinlichkeit, kosten_im_schadensfall);
        this.massnahme = massnahme;
    }


    public String getMassnahme() {
        return massnahme;
    }

    public void setMassnahme(String massnahme) {
        this.massnahme = massnahme;
    }

    @Override
    public float ermittleRueckstellung(){

        return super.getRisikowert();
    }

    @Override
    public void druckeDaten(){
        System.out.println(" Id "+ getId() + " Inakzeptables Risiko  " + getBezeichnung() +
                " aus " + getErstellungsdatum().getMonth()+"/"+getErstellungsdatum().getYear()+";"+ " Risikowert "+ getRisikowert()+";"+ " Rückstellung " + ermittleRueckstellung()
                + " Maßnahme "+ getMassnahme()


        );

    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),massnahme);
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
        InakzeptablesRisiko ris = (InakzeptablesRisiko) o;

        //fachliche Gleichheit vom Objektzustaende

        if(super.equals(ris)&&this.massnahme.equals(ris.massnahme)){
            return true;
        }

        return false;
    }


}
