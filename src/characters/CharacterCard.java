package characters;

public class CharacterCard {
    public enum Gender {MASCHIO, FEMMINA}

    private final String name;
    private final Gender gender;
    private final String[] traits;
    private boolean exluded = false; //la sbarra caduta


    public CharacterCard(String name, Gender gender, String... traits) {
        if (name == null || gender == null) {
            throw new IllegalArgumentException("personaggio non valido");
        }
        this.name=name;
        this.gender=gender;
        this.traits=traits;

    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String[] getTraits() {
        return traits;
    }

    public boolean isExluded() {
        return exluded;
    }

    public void setExluded(boolean exluded) {
        this.exluded = exluded;
    }
}
