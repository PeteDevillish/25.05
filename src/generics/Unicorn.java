package generics;

public class Unicorn {

    private String hornColor;
    private boolean flying;


    public Unicorn(String hornColor, boolean flying) {
        this.hornColor = hornColor;
        this.flying = flying;
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "hornColor='" + hornColor + '\'' +
                ", flying=" + flying +
                '}';
    }

    public String getHornColor() {
        return hornColor;
    }

    public boolean isFlying() {
        return flying;
    }
}
