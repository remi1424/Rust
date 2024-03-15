package org.example;

public class personneDTO {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String profession;
    private int code_postal;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getCode_postal() {
        return code_postal;
    }
    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }
}
