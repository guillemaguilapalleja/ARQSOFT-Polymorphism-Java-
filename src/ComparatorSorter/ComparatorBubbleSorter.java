package ComparatorSorter;

import ComparatorSorter.ComparatorBuilding;

import java.util.Comparator;

public class ComparatorBubbleSorter extends ComparatorSorter {

    private Comparator<ComparatorBuilding> buildingComparator;

    public ComparatorBubbleSorter(Comparator<ComparatorBuilding> comparator) {
        super(comparator);
        this.buildingComparator = comparator;
    }

    @Override
    public void sort(Comparator<ComparatorBuilding>[] list) {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (buildingComparator.compare((ComparatorBuilding) list[j-1], (ComparatorBuilding) list[j]) > 0) { // Compare the comparators themselves
                    // Swap elements
                    Comparator<ComparatorBuilding> temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
