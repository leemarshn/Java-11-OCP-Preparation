package topics.collections;

import java.util.Comparator;

public class CompareObjects implements Comparable<CompareObjects>, Comparator<CompareObjects> {
    private String id;
    private String name;
    private String location;

    public CompareObjects() {
    }

    public CompareObjects(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int compare(CompareObjects compareObjects, CompareObjects t1) {
        return compareObjects.getName().compareTo(t1.getName());
    }

    @Override
    public boolean equals(Object obj) {
       // if (this == obj) return  true;
       // if (!(obj instanceof CompareObjects)) return false;

        CompareObjects object = (CompareObjects) obj;
        if (id.equals(object.id)) return true;

        return false;

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public int compareTo(CompareObjects obj) {
        return this.id.compareTo(obj.getId());

    }

    @Override
    public String toString() {
        return getId() +", " + getName() + " , " + getLocation();
    }
}
