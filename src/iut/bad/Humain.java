package iut.bad;

public class Humain {
    
    private String nom;
    private String prenom;
    private int age;

    
    @Override
    public String toString() {
        return "Nom: " + nom + "\nPrénom: " + prenom + "\nÂge: " + age;
    }
}