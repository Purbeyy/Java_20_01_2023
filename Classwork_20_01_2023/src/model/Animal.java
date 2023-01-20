package modal;

public class Animal {

    public String breed ="name";
    public String type ="mammal";

    public Boolean vaccination;
    public String habitat;

    public Animal(Boolean vaccination, String habitat) {
        this.vaccination = vaccination;
        this.habitat = habitat;
    }

    public Animal(int id) {

    }

    public Boolean getVaccination() {
        return vaccination;
    }

    public void setVaccination(Boolean vaccination) {
        this.vaccination = vaccination;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
