import java.util.ArrayList;
public class Employe {
    private String name;
    private String jobTitle; // (directeur default:max salary per month 13000dh   , team_manager default: salary per month 8000dh , technicien default: salary per month 5000dh  , assistant default: salary per month 3500dh )

    private String date_embauche;
    private double salary;
    private float Hour_Sup; // ( max hour per week 6h ; 70dh for hour )
    ArrayList<String> Employee_list = new ArrayList<String>();
    public Employe(String name, String jobTitle,String date_embauche ) {
        this.name = name;
        this.jobTitle = jobTitle;

        this.date_embauche = date_embauche;
        Employee_list.add(name);

    }
    //afficher la liste des employe
    public void show_Employe_list(){
        for(int i=0 ; i<= Employee_list.size(); i++){
            System.out.println(Employee_list.get(i));

        }
    }
    //delete employe from the list
    public void delete_employe(String name){
            Employee_list.remove("name");
    }
    // Update the salary for Employe depending on the jobTitle
    public void update_salary(){
        if (jobTitle=="directeur"){
            salary=13000;
        } else if (jobTitle=="team_manager") {
            salary=8000;
        } else if (jobTitle=="technicien") {
            salary=5000;
        } else if (jobTitle=="assistant") {
            salary=3500;
        }
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(String date_embauche) {
        this.date_embauche = date_embauche;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setHourSup(float hour) {
        this.Hour_Sup = hour;
    }
    public float getHourSup() {
        return Hour_Sup;
    }
    public void add_hour(float hour){
        if  (this.Hour_Sup<6){
             this.Hour_Sup =   this.Hour_Sup + hour;
        }
        if (this.Hour_Sup>6) {
            this.Hour_Sup = 6;
        }}
    public void Hour_raiseSalary(){
       for (int i=1 ; i<=6 ; i++){
           if (this.Hour_Sup==i) {
               this.salary+=i*70;
               break;
           }
       }
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //raise salary depending on the bonus
    // ( type : 1   raise 5% ; type : 2  raise 7%  ; type : 3  raise 10%  )
    public void Bonus_raiseSalary(String bonus) {
        if (bonus.equals("type1")){
            salary = salary + salary * 5 / 100;
        } else if (bonus.equals("type2")) {
            salary = salary + salary * 7 / 100;
        } else if (bonus.equals("type3")) {
            salary = salary + salary * 10 / 100;
        }
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Date_Embauche: " + date_embauche);
        System.out.println("Salary: " + salary);

    }

}
