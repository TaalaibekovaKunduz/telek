public class Tovar {
    private String name;

    private int sena;

    private int reiting;

    public Tovar(String name, int sena, int reiting) {
        this.name = name;
        this.sena = sena;
        this.reiting = reiting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", sena=" + sena +
                ", reiting=" + reiting +
                '}';
    }
}
