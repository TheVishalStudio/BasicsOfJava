public class student1 {
        private String name;
        private int rollNumber;
        private char grade;


        public student1(String name, int rollNumber, char grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
        }
        public void dispDetails() {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }


        public static void main(String[] args) {
            student1 student = new student1("Ambuj Singh", 1, 'D');
            student.dispDetails();
        }
    }

