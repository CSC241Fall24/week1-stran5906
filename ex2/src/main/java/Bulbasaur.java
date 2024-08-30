public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // Update the level
        level = lv;

        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        if (level >= 16 && level < 32){
            id = 2;
        }

        // If the new level is 32 or higher, evolve to Venusaur
        else if (level >= 32){
            id = 3;
        }
    }

    // getLevel method
    public int getLevel() {
        return level;
    }

    // getName method
    public String getName() {
        // Return the name based on the current id
        switch (id){
            case 1 : 
                return "Bulbasaur";
            case 2 : 
                return "Ivysaur";
            case 3 : 
                return "Venusaur";
            default:
                return "";
        }
    }

    // getID method
    public int getID() {
        return id;
    }

    // toString method
    @Override
    public String toString() {
        // Return a string representation of the Bulbasaur object
        return "Level: " + level + ", ID: " + id ; // Placeholder return value
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // Compare this Bulbasaur object with another object
        if (obj instanceof Bulbasaur){
            Bulbasaur cast = (Bulbasaur) obj;
            if (cast.level == level && cast.id == id){
                return true;
            }
            return false;
        }
        else{
            return false;
        }

    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur copy = new Bulbasaur();
        copy.id = id;
        copy.level = level;
        return copy;
    }
}