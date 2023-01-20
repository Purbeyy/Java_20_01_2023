package model;

public class Cat extends modal.Animal {
    public String name;

    public Cat(String name,Boolean vaccination,String habitat) {
        super(vaccination, habitat);
        this.name = name;
    }

    public Cat(String billi) {
        super(Integer.parseInt(billi));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}