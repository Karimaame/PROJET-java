package models;

public class Enfant {
    private String nom;
    private int age;
    private String contactParent;

    public Enfant(String nom, int age, String contactParent) {
        this.nom = nom;
        this.age = age;
        this.contactParent = contactParent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactParent() {
        return contactParent;
    }

    public void setContactParent(String contactParent) {
        this.contactParent = contactParent;
    }

    @Override
    public String toString() {
        return "Enfant{" +
                "nom='" + nom + ''' +
                ", age=" + age +
                ", contactParent='" + contactParent + ''' +
                '}';
    }
}
