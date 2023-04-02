public class ManageHospital {
private int id;
private String name;
private int age;

    public ManageHospital(int id, String name, int age) {
        this.id = id;
        this.name = name;
        if (0<age && age <=110) {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (0<age && age <=110) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age;
    }
}
