public class student {
    
    private String nom;
    private String prenom;
    private int matricule;

   
    public student(String nom, String prenom, int matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    
    public void insererNotes(float notes) {
        
        System.out.println("Notes insérées pour l'étudiant " + prenom + " " + nom);
    }
    
    
    public void supprimerNotes () {
    	System.out.println("Notes supprimes pour l'etudiant" + prenom + " "+nom);
    }
    
        
       

        
       
}