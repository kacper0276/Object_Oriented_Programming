package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord("Imie", "1", 4.1);
        StudentRecord studentRecord1 = new StudentRecord("Imie 1","15", 4);

        studentRecord1.printDetails();
        studentRecord.printDetails();

        if(studentRecord.isHonorStudent()) {
            System.out.println("StudetnRecord - jest");
        }

        if(studentRecord1.isHonorStudent()) {
            System.out.println("StudentRecord1 - jest");
        }
    }
}
