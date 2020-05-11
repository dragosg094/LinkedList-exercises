package LinkListEX;
import java.util.Objects;

public class Town {
    private String townsName;
    private int distance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return distance == town.distance && Objects.equals(townsName, town.townsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(townsName, distance);
    }


    public Town(String name, int distance){
        this.townsName=name;
        this.distance=distance;
    }
    public int getDistance(){
        return this.distance;
    }
    public String getTownsName(){
        return this.townsName;
    }




}