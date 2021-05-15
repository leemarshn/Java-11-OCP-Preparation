package topics.collections;

public class DuckTreeSet implements Comparable<DuckTreeSet>{
    private int id;
    private String name;
    private String type;

    public DuckTreeSet(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(DuckTreeSet duckTreeSet) {
        return duckTreeSet.name.compareTo(this.name);
    }
}
