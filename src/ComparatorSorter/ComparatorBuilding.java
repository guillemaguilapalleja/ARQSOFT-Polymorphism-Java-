package ComparatorSorter;

import java.util.Comparator;

public class ComparatorBuilding implements Comparator<ComparatorBuilding> {
    public int volumeCubeMeters;
    public int heightMeters;

    public ComparatorBuilding(Integer volumeCubeMeters, Integer heightMeters) {
        this.volumeCubeMeters = volumeCubeMeters;
        this.heightMeters = heightMeters;
    }

    public int getVolumeCubeMeters() { return this.volumeCubeMeters; }

    @Override
    public int compare(ComparatorBuilding building1, ComparatorBuilding building2) {
        return building1.volumeCubeMeters - building2.volumeCubeMeters;
    }
}
