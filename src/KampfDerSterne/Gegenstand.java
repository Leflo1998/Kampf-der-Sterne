package KampfDerSterne;

public class Gegenstand {
    private String name;
    private int kraft;

    public Gegenstand() {
        this.name = "";
        this.kraft = 0;
    }

    public Gegenstand(String name, int kraft) {
        this.name = name;
        if (kraft > 0) {
            this.kraft = kraft;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getKraft() {
        return this.kraft;
    }

    public void setKraft(int kraft) {
        if (kraft > 0) {
            this.kraft = kraft;
        }
    }

    @Override
    public String toString() {
        return "Gegenstand{" +
                "name='" + name + '\'' +
                ", kraft=" + kraft +
                '}';
    }

}
