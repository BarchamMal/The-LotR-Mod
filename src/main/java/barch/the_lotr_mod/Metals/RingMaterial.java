package barch.the_lotr_mod.Metals;

public class RingMaterial {

    private String name;
    private int level;

    public RingMaterial(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
