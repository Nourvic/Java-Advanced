public class Main {
    public static void main(String[] args) {
        Fuhrpark fk = new Fuhrpark();
        fk.addAuto(new Auto("BMW", 2020));
        fk.addAuto(new Auto("BMW", 2025));
        fk.addAuto(new Auto("Saba", 2025));
        fk.addAuto(new Auto("Lada", 2025));
        fk.addAuto(new Auto("Nissan", 2025));
        fk.addAuto(new Auto("CHEVOURLETT", 2025));
        fk.addAuto(new Auto("Kia", 2025));
        fk.addAuto(new Auto("Mercedes", 2018));
        fk.addAuto(new Auto("VW", 2023));
        fk.addAuto(new Auto("Audi", 2019));

        System.out.println(fk.istHerstellerVorhanden("VW"));
        System.out.println(fk.neustesBaujahr("BMW").getBaujahr());
        fk.druckeAutosmitBaujahr(2025, 6);


    }
}