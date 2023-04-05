public abstract class SinhVienTechmaster {
    private String fullname;
    private String major;

    public SinhVienTechmaster(String fullname, String major) {
        this.fullname = fullname;
        this.major = major;
    }

    public abstract double getScore();
    public String getGrade(){
        if (getScore() < 5) {
            return "Below Average";
        } else if (5 <= getScore() && getScore() < 6.5) {
            return "Average";
        } else if (6.5 <= getScore() && getScore() < 7.5) {
            return "Good";
        } else {
            return "Exellent";
        }
    }

    @Override
    public String toString() {
        return  "{"+
                "fullname='" + fullname + '\'' +
                ", major='" + major + '\'' + ", score = " + getScore() + ", grade = " +getGrade() +
                '}';
    }

}
