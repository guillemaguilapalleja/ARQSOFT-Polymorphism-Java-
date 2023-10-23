package ComparableSorter;

import ComparableSorter.Building;
import ComparableSorter.ComparableBubbleSorter;
import ComparableSorter.ComparableDirInsertSorter;
import ComparatorSorter.ComparatorBuilding;


import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // ComparableSorter
        Building building1 = new Building(
            ThreadLocalRandom.current().nextInt(1, 3 + 1), ThreadLocalRandom.current().nextInt(1, 9 + 1)
        );
        Building building2 = new Building(
            ThreadLocalRandom.current().nextInt(4, 8 + 1), ThreadLocalRandom.current().nextInt(1, 2 + 1)
        );
        Building building3 = new Building(
            ThreadLocalRandom.current().nextInt(1, 5 + 1), ThreadLocalRandom.current().nextInt(2, 2 + 1)
        );

        Building[] listOfBuildings = new Building[3];

        listOfBuildings[0] = building1;
        listOfBuildings[1] = building2;
        listOfBuildings[2] = building3;

        Building[] copyListOfBuildings = listOfBuildings.clone();

        System.out.println(
                "Previous unsorted list: "
                        + "["  + listOfBuildings[0].volumeCubeMeters
                        + ", " + listOfBuildings[1].volumeCubeMeters
                        + ", " + listOfBuildings[2].volumeCubeMeters
                        + "]"
        );

        ComparableBubbleSorter comparableBubbleSorter = new ComparableBubbleSorter();
        comparableBubbleSorter.sort(listOfBuildings);

        ComparableDirInsertSorter comparableDirInsertSorter = new ComparableDirInsertSorter();
        comparableDirInsertSorter.sort(copyListOfBuildings);

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