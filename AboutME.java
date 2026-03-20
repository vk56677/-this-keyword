// ============================================
// This Keyword Example ~ Student Class
// Author ~ Vikas Kumar
// Topic ~ OOP ~ this keyword
// ============================================

// Main class ~ Student info
class ME {
    
    // Fields~
    String name;
    String StudyIn;
    char section;

    // Default constructor ~ calls parameterized~
    ME() {
        this("Vikas", "BCA", 'c'); // this() call~
        System.out.println("Student created~");
    }

    // Parameterized constructor~
    ME(String name, String StudyIn, char section) {
        this.name = name;       // this = current object~
        this.StudyIn = StudyIn;
        this.section = section;
    }

    // Display method~
    void Info() {
        System.out.println("Name    : " + this.name);
        System.out.println("Course  : " + this.StudyIn);
        System.out.println("Section : " + this.section);
    }
}

// Entry point~
public class AboutME {
    public static void main(String[] args) {

        // Default object~
        ME s1 = new ME();
        s1.Info();

        System.out.println("---");

        // Custom object~
        ME s2 = new ME("Vikas", "BCA", 'c');
        s2.Info();
    }
}
