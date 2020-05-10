public class Toy {

    private String name;
    private char genderType;
    private int ageLowerBound;
    private int ageHigherBound;

    public Toy(String name, String genderType, String ageLowerBound, String ageHigherBound) {
        this.name = name;
        this.genderType = genderType.charAt(0);
        this.ageLowerBound = Integer.parseInt(ageLowerBound);
        this.ageHigherBound = Integer.parseInt(ageHigherBound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGenderType() {
        return genderType;
    }

    public void setGenderType(char genderType) {
        this.genderType = genderType;
    }

    public int getAgeLowerBound() {
        return ageLowerBound;
    }

    public void setAgeLowerBound(int ageLowerBound) {
        this.ageLowerBound = ageLowerBound;
    }

    public int getAgeHigherBound() {
        return ageHigherBound;
    }

    public void setAgeHigherBound(int ageHigherBound) {
        this.ageHigherBound = ageHigherBound;
    }

    @Override
    public String toString() {
        return name + ' ' + genderType +  " " + ageLowerBound + " " + ageHigherBound;
    }
}
