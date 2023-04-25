public class BardzoDobry extends Oceny {
    private String bdb;

    public BardzoDobry() {

    }

    public BardzoDobry(String bardzoDobry, String dobry, String dostateczny, String dopuszczajacy, String niedostateczny, String bdb) {
        super(bardzoDobry, dobry, dostateczny, dopuszczajacy, niedostateczny);
        this.bdb = bdb;
    }

    public void setBdb(String bdb) {
        this.bdb = bdb;
    }

    @Override
    public String toString() {
        return "BDB to ocena Bardzo Dobra - 5";
    }
}
