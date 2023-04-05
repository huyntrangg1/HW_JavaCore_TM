public class SinhVienBiz extends SinhVienTechmaster {
    private double scoreMarketting;
    private double scoreSales;

    public SinhVienBiz(String fullname, String major, double scoreMarketting, double scoreSales) {
        super(fullname, major);
        if(scoreMarketting <=0 &&  scoreMarketting<=10) this.scoreMarketting = scoreMarketting;
        if(scoreSales <=0 &&  scoreSales<=10) this.scoreSales = scoreSales;
    }

    @Override
    public double getScore() {
        return (2*scoreMarketting + scoreSales)/3;
    }

}
