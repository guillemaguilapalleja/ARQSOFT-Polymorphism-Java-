package ComparatorSorter;

import java.util.Comparator;
import ComparatorSorter.ComparatorBuilding;
import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // ComparableSorter
        ComparatorBuilding building1 = new ComparatorBuilding(
            ThreadLocalRandom.current().nextInt(1, 5 + 1), ThreadLocalRandom.current().nextInt(2, 2 + 1)
        );
        ComparatorBuilding building2 = new ComparatorBuilding(
            ThreadLocalRandom.current().nextInt(4, 8 + 1), ThreadLocalRandom.current().nextInt(1, 2 + 1)
        );
        ComparatorBuilding building3 = new ComparatorBuilding(
            ThreadLocalRandom.current().nextInt(1, 3 + 1), ThreadLocalRandom.current().nextInt(1, 9 + 1)
        );

        ComparatorBuilding[] listOfBuildings = new ComparatorBuilding[3];

        listOfBuildings[0] = building1;
        listOfBuildings[1] = building2;
        listOfBuildings[2] = building3;

        ComparatorBuilding[] copyListOfBuildings = listOfBuildings.clone();

        Comparator<ComparatorBuilding> comparator =
                (Comparator<ComparatorBuilding>) (building11, building21) ->
                        Integer.compare(building11.volumeCubeMeters, building21.volumeCubeMeters);

        System.out.println(
                "Previous unsorted list: "
                        + "["  + listOfBuildings[0].volumeCubeMeters
                        + ", " + listOfBuildings[1].volumeCubeMeters
                        + ", " + listOfBuildings[2].volumeCubeMeters
                        + "]"
        );
        // Create a ComparatorBubbleSorter and use it to sort the array
        ComparatorBubbleSorter comparatorBubbleSorter = new ComparatorBubbleSorter(comparator);
        comparatorBubbleSorter.sort(listOfBuildings);

        ComparatorDirInsertSorter comparatorDirInsertSorter = new ComparatorDirInsertSorter(comparator);
        comparatorDirInsertSorter.sort(copyListOfBuildings);

        Integer[] sortedListBubbleSorter = new Integer[3];
        Integer[] sortedListDirInsertSorter = new Integer[3];

        // Print the sorted array
        for (int i = 0; i < listOfBuildings.length; i++) {
            sortedListBubbleSorter[i] = listOfBuildings[i].volumeCubeMeters;
            sortedListDirInsertSorter[i] = copyListOfBuildings[i].volumeCubeMeters;
        }

        System.out.println(
                "Sorted list using Bubble Sorter comparator: "
                        + "["  + sortedListBubbleSorter[0]
                        + ", " + sortedListBubbleSorter[1]
                        + ", " + sortedListBubbleSorter[2]
                        + "]"
        );
        System.out.println(
                "Sorted list using Dir Insert comparator: "
                        + "["  + sortedListDirInsertSorter[0]
                        + ", " + sortedListDirInsertSorter[1]
                        + ", " + sortedListDirInsertSorter[2]
                        + "]"
        );
    }
}