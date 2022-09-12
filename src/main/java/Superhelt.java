public class Superhelt {

    //superhelte objekter
    private String citizenName;
    private String superheroName;
    private String superPower;
    private String creationYear;
    private double strength;
    private boolean isHuman = true;

    //this metode, så man kan bruge objekterne uden for klassen
    public Superhelt(String citizenName, String superheroName, String superPower, String creationYear, double strength, boolean isHuman) {
        this.citizenName = citizenName;
        this.superheroName = superheroName;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
        this.isHuman = isHuman;
    }
        public String getCitizenName() {
            return citizenName;
        }
        public String getSuperheroName() {
            return superheroName;
        }
        public String getSuperPower() {
            return superPower;
        }
        public String getCreationYear() {
            return creationYear;
        }
        public double getStrength() {
            return strength;
        }
        public boolean isHuman() {
            return isHuman;
        }




}
