public class Outerclass {
    String marke;

    private class InnerClass {
        public void printMarke() {
           marke = "BMW";
            System.out.println("Das Automarke heisst : " + marke);
        }
    }




    public static void main(String[] args) {
      Outerclass o = new Outerclass();
      Outerclass.InnerClass in = o.new InnerClass();
      in.printMarke();
    }

}