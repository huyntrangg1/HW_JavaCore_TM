public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age =age;
    }

    // kiem tra tuoi:
    public String printAlert() {
        return age <= 0 || age >= 150 ? "Invalid age!" : Integer.toString(age);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + printAlert();
    }
}
