package ComparatorSorter;

import java.util.Comparator;

public abstract class ComparatorSorter {
    protected Comparator<ComparatorBuilding> buildingComparator;
    public ComparatorSorter(Comparator<ComparatorBuilding> comparator) {
        this.buildingComparator = comparator;
    }
    public abstract void sort(Comparator<ComparatorBuilding>[] listOfBuildings);
}
