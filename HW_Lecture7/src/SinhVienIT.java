public class SinhVienIT extends SinhVienTechmaster {
    private double scoreJava;
    private double scoreHtml;
    private double scoreCss;


    public SinhVienIT(String fullname, String major, double scoreJava, double scoreHtml, double scoreCss) {
        super(fullname, major);
        if (scoreJava >= 0 && scoreJava <= 10) this.scoreJava = scoreJava;
        if (scoreHtml >= 0 && scoreHtml <= 10) this.scoreHtml = scoreHtml;
        if (scoreCss >= 0 && scoreCss <= 10) this.scoreCss = scoreCss;
}

    public double getScore() {
       return (2 * scoreJava + scoreHtml + scoreCss) / 4;
    }

}
