    public class Employee {
        private String name;
        private int id;
        private double salary;


        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }


        public void displayDetails() {
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Monthly Salary: " + salary);
        }


        public double getAnnualSalary() {
            return salary * 12;
        }


        public static void main(String[] args) {
            Employee emp = new Employee("Vishal Kumar", 101, 10000.0);
            emp.displayDetails();
            System.out.println("Annual Salary: " + emp.getAnnualSalary());
        }
    }

