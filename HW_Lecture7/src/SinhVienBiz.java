public class SinhVienBiz extends SinhVienTechmaster {
    private double scoreMarketting;
    private double scoreSales;


    public SinhVienBiz(String fullname, String major, double scoreMarketting, double scoreSales) {
        super(fullname, major);
        this.scoreMarketting = scoreMarketting;
         this.scoreSales = scoreSales;
    }

    @Override
    public double getScore() {
        return (2*scoreMarketting + scoreSales)/3;
    }

}
