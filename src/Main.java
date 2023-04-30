public class Main {
    public static void main(String[] args) {

        BardzoDobry bardzoDobry = new BardzoDobry();
        Dobry dobry = new Dobry();
        Dostateczny dostateczny = new Dostateczny();
        Dopuszczajacy dopuszczajacy = new Dopuszczajacy();
        Niedostateczny niedostateczny = new Niedostateczny();

        Oceny[] tabela = {bardzoDobry, dobry, dostateczny, dopuszczajacy, niedostateczny};

        for (Oceny o : tabela){
            System.out.println(o.getName());
        }

    }
}