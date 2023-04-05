public class SinhVienIT extends SinhVienTechmaster {
    private double scoreJava;
    private double scoreHtml;
    private double scoreCss;

    public SinhVienIT(String fullname, String major, double scoreJava, double scoreHtml, double scoreCss) {
        super(fullname, major);
        this.scoreJava = scoreJava;
        this.scoreHtml = scoreHtml;
        this.scoreCss = scoreCss;
    }

    public double getScore() {
        return (2 * scoreJava + scoreHtml + scoreCss) / 4;
    }

}
