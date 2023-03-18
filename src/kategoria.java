public class kategoria {

    private String name;

    public kategoria(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "kategoria{" +
                "name='" + name + '\'' +
                '}';
    }

}
