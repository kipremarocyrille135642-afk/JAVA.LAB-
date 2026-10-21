public class EncapsuleEx
{
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EncapsuleEx emp = new EncapsuleEx();
        emp.setName("Jay");
        System.out.println("Employee Name: " + emp.getName());
        emp.getName());
    }
}
