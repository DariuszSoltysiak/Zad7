public class Oceny {
    private String bardzoDobry;
    private String dobry;
    private String dostateczny;
    private String dopuszczajacy;
    private String niedostateczny;

    public Oceny() {

    }

    public Oceny(String bardzoDobry, String dobry, String dostateczny, String dopuszczajacy, String niedostateczny) {
        this.bardzoDobry = bardzoDobry;
        this.dobry = dobry;
        this.dostateczny = dostateczny;
        this.dopuszczajacy = dopuszczajacy;
        this.niedostateczny = niedostateczny;
    }

    public String getBardzoDobry() {
        return bardzoDobry;
    }

    public String getDobry() {
        return dobry;
    }

    public String getDostateczny() {
        return dostateczny;
    }

    public String getDopuszczajacy() {
        return dopuszczajacy;
    }

    public String getNiedostateczny() {
        return niedostateczny;
    }


    @Override
    public String toString() {
        return "Oceny{" +
                "bardzoDobry='" + bardzoDobry + '\'' +
                ", dobry='" + dobry + '\'' +
                ", dostateczny='" + dostateczny + '\'' +
                ", dopuszczajacy='" + dopuszczajacy + '\'' +
                ", niedostateczny='" + niedostateczny + '\'' +
                '}';
    }
}
