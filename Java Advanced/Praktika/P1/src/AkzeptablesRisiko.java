import java.util.Objects;

public class AkzeptablesRisiko extends Risiko{

    public AkzeptablesRisiko(String bezeichnung, float eintrttswahrscheinlichkeit, float kosten_im_schadensfall) {
        super(bezeichnung, eintrttswahrscheinlichkeit, kosten_im_schadensfall);
    }


    @Override
    public float ermittleRueckstellung(){

        return 0.0f;
    }

    @Override
    public void druckeDaten(){
        System.out.println(" Id "+ getId() + " Akzeptables Risiko  " + getBezeichnung() +
                " aus " + getErstellungsdatum().getMonth()+"/"+getErstellungsdatum().getYear()+";"+ " Risikowert "+ getRisikowert()+";"+ " Rückstellung " + ermittleRueckstellung()
                + " Maßnahme "


        );

    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode());
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
        AkzeptablesRisiko ris = (AkzeptablesRisiko) o;

        //fachliche Gleichheit vom Objektzustaende

        if(super.equals(ris)){
            return true;
        }

        return false;
    }
}