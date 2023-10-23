package ComparatorSorter;
import ComparatorSorter.ComparatorBuilding;

import java.util.Comparator;

public class ComparatorDirInsertSorter extends ComparatorSorter {
    private Comparator<ComparatorBuilding> buildingComparator;

    public ComparatorDirInsertSorter(Comparator<ComparatorBuilding> comparator) {
        super(comparator);
        this.buildingComparator = comparator;
    }

    @Override
    public void sort(Comparator<ComparatorBuilding>[] list) {
        int j;
        Comparator<ComparatorBuilding> pivot;

        for (int i = 1; i < list.length; i++) {
            j = i - 1;
            pivot = list[i];

            while (j >= 0 && buildingComparator.compare((ComparatorBuilding) pivot, (ComparatorBuilding) list[j]) < 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = pivot;
        }
    }
}
