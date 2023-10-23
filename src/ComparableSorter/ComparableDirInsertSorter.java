package ComparableSorter;

public class ComparableDirInsertSorter implements ComparableSorter {
    @Override
    public void sort(Comparable<Building>[] list) {
        int j;
        Comparable<Building> pivot;

        for (int i = 1; i < list.length; i++) {
            j = i - 1;
            pivot = list[i];

            while (j >= 0 && pivot.compareTo((Building) list[j]) < 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = pivot;
        }
    }
}
