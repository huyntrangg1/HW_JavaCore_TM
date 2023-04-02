public class ManageHospital {
private int id;
private String name;
private int age;

    public ManageHospital(int id, String name, int age) {
        this.id = id;
        this.name = name;
        if (0<age && age <=150) {
            this.age = age;
        }
    }

    // kiem tra tuoi:
    public String printAlert() {
            if (age <= 0 || age >= 150) {
                return "Invalid age!";
            }
            return Integer.toString(age);
        }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + printAlert();
    }
}
