package model;

public class Dog extends modal.Animal {
    private int id;

    public Dog(int id,Boolean vaccination,String habitat) {
        super(vaccination, habitat);
        this.id = id;
    }

    public Dog(int id) {
        super(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
