package iut.bad;

public class Humain {
    
    private String nom;
    private String prenom;
    private int age;

    public Humain() {}
    
    public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	@Override
    public String toString() {
        return "Nom: " + nom + "\nPrénom: " + prenom + "\nÂge: " + age;
    }
}