package K;

public enum R {

    Osh("Ош",45,123455),

    Talas("Талас",2345,23456),

    Naryn("Нарын",12345,23456),

    Chyi("Чуй",132,123456),

    Jalalabad("джалал-абад",123,1234),

    Ysykkol("исык-куль",123,123456),

    Batken("Баткен",123,234);

    private String name;

    private int km;

    private int naselenie;

    R(String name, int km, int naselenie) {
        this.name = name;
        this.km = km;
        this.naselenie = naselenie;
    }

    R() {
    }

    @Override
    public String toString() {
        return "R{" +
                "name='" + name + '\'' +
                ", km=" + km +
                ", naselenie=" + naselenie +
                '}';
    }
}
