public class Anonymtest {


    public static void druckeWerteTabelle(Berechnung b) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("f(" + i * 1.0 + ") = " + b.berechne((double) i));
        }
    }



    public static void main(String[] args) {



        Anonymtest.druckeWerteTabelle(new Berechnung() {
            @Override
            public double berechne(double x) {
                return x * x;
            }
        });




      //  Anonymtest.druckeWerteTabelle((x) -> x*x);
    }


//        Anonymtest h = new Anonymtest();
//        //  hilfklasse hilf = new hilfklasse();
//        Anonymtest.hilfklasse in = h.new hilfklasse();
//        Anonymtest.druckeWerteTabelle(new Anonymtest().new hilfklasse());
//        Anonymtest.druckeWerteTabelle(in);

    }


