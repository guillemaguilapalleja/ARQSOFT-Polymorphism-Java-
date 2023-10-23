package ComparableSorter;

public class Building implements Comparable<Building> {
    public int volumeCubeMeters;
    public int heightMeters;

    public Building(Integer volumeCubeMeters, Integer heightMeters) {
        this.volumeCubeMeters = volumeCubeMeters;
        this.heightMeters = heightMeters;
    }

    public int getVolumeCubeMeters() {
        return volumeCubeMeters;
    }

    @Override
    public int compareTo(Building buildingComparable) {
        return this.volumeCubeMeters - buildingComparable.volumeCubeMeters;
    }
}
