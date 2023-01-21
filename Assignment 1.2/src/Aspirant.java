public class Aspirant extends Student {

    private String scientificWork;

    @Override
    public int getScholarship() {
        if (averageMark == 5) return 200;
        else return 180;
    }

    public Aspirant() {}

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String researchPaperTheme) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = researchPaperTheme;
    }
}
