package q1;

public class Personality extends Person{
    private String devotion;
    private String OG_Percentage;
    private String hoodLevel;

    public Personality(String name, int age, String city, String devotion, String OG_Percentage, String hoodLevel) {
        super(name, age, city);
        this.devotion = devotion;
        this.OG_Percentage = OG_Percentage;
        this.hoodLevel = hoodLevel;
    }

    public Personality(String name, int age, String devotion, String OG_Percentage, String hoodLevel) {
        super(name, age);
        this.devotion = devotion;
        this.OG_Percentage = OG_Percentage;
        this.hoodLevel = hoodLevel;
    }

    public Personality(String devotion, String OG_Percentage, String hoodLevel) {
        this.devotion = devotion;
        this.OG_Percentage = OG_Percentage;
        this.hoodLevel = hoodLevel;
    }

    public String getDevotion() {
        return devotion;
    }

    public void setDevotion(String devotion) {
        this.devotion = devotion;
    }

    public String getOG_Percentage() {
        return OG_Percentage;
    }

    public void setOG_Percentage(String OG_Percentage) {
        this.OG_Percentage = OG_Percentage;
    }

    public String getHoodLevel() {
        return hoodLevel;
    }

    public void setHoodLevel(String hoodLevel) {
        this.hoodLevel = hoodLevel;
    }
}
