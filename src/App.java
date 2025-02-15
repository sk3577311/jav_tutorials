import programs.RecordsPrograms;

public class App {
    public static void main(String[] args) {
        RecordsPrograms rp = new RecordsPrograms("John", -9999);
        System.out.println("Name: " + rp.name());
        System.out.println("Emp id.: " + rp.employeeNumber());
    }
}