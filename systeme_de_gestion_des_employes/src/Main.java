//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create new employee objects
        Employe employee1 = new Employe("asmaa", "directeur", "2024-01-01");
        Employe employee2 = new Employe("ahmed", "team_manager", "2024-02-15");

        // Print employee details
        System.out.println("Employee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        // Update salary based on job title
        employee1.update_salary();
        employee2.update_salary();

        // Print updated employee details
        System.out.println("\nEmployee Details After Salary Update:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        // Add hours for overtime
        employee1.add_hour(2.5f);
        employee2.add_hour(7.0f);

        // Print employee details after adding overtime hours
        System.out.println("\nEmployee Details After Adding Overtime Hours:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        // Raise salary for overtime
        employee1.Hour_raiseSalary();
        employee2.Hour_raiseSalary();

        // Print employee details after raising salary for overtime
        System.out.println("\nEmployee Details After Raising Salary for Overtime:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        // Add bonus to raise salary
        employee1.Bonus_raiseSalary("type2");
        employee2.Bonus_raiseSalary("type3");

        // Print employee details after adding bonus
        System.out.println("\nEmployee Details After Adding Bonus:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        // Show employee list
        System.out.println("\nEmployee List:");
        employee1.show_Employe_list();
        employee2.show_Employe_list();

        // Delete an employee
        employee1.delete_employe("asmaa");

        // Show employee list after deletion
        System.out.println("\nEmployee List After Deletion:");
        employee1.show_Employe_list();
    }
}