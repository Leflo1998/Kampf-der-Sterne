package KampfDerSterne;

public class Object {
    // Attribute
    private String name;
    private int powerLevel;

    // Konstruktor
    public Object() {
        this.name = "";
        this.powerLevel = 0;
    }

    public Object(String name, int kraft) {
        this.name = name;
        if (kraft > 0) {
            this.powerLevel = kraft;
        }
    }

    // Methoden
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return this.powerLevel;
    }

    public void setPowerLevel(int kraft) {
        if (kraft > 0) {
            this.powerLevel = kraft;
        }
    }

    @Override
    public String toString() {
        return "Gegenstand{" +
                "name='" + name + '\'' +
                ", kraft=" + powerLevel +
                '}';
    }
}
