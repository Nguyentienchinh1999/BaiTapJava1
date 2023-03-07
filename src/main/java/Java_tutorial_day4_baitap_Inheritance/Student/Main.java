package Java_tutorial_day4_baitap_Inheritance.Student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("chinh", "BN","IT",1999, 200000);
        System.out.println(st1.toString());

        Staff staff1 = new Staff("Chinh", "TU SON","HUBT",300000);
        System.out.println(staff1.toString());
    }
}
