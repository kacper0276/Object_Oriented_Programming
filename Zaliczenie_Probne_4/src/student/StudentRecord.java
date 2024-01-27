package student;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord {
        if(gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Błąd");
        }
    }

    public boolean isHonorStudent() {
        return this.gpa >= 3.5;
    }

    public void printDetails() {
        System.out.println(String.format("Imie: %s, Id: %s, Gpa: %1.1f", name, id, gpa));
    }
}
