package ComparableSorter;

public class ComparableBubbleSorter implements ComparableSorter {
    @Override
    public void sort(Comparable<Building>[] list) {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1].compareTo((Building) list[j]) > 0) {
                    // Swap elements
                    Comparable<Building> temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
