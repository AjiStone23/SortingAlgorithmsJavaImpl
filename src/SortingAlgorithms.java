import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import randomDataGenerator.RandomTshirtFactory;
import sorting.Sorting;
import tShirt.Tshirt;

public class SortingAlgorithms {

	public static void main(String[] args) {

		List<Tshirt> tList = new ArrayList<>();

		for (int i = 0; i < 40; i++) {

			tList.add(RandomTshirtFactory.getRandomTshirt());

		}

		Comparator<Tshirt> c = Comparator.comparing(Tshirt::getSize);
		long sT = System.currentTimeMillis();

		Sorting.quickSort(0, tList.size() - 1, tList, c);

		long eT = System.currentTimeMillis();

		System.out.println("***************************************************QUICK SORT BY SIZE ASC    Time= "
				+ (eT - sT) + " millisecs**********************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getSize).reversed();

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"****************************************************************QUICK SORT BY SIZE DESC  Time = "
						+ (eT - sT) + " millisecs  **************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getFabric);

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"***************************************************************QUICK SORT BY FABRIC ASC  Time =  "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getFabric).reversed();

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"**************************************************************QUICK SORT BY FABRIC DESC Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getColor);

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"*****************************************************************QUICK SORT BY COLOR ASC   Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getColor).reversed();

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"*******************************************************************QUICK SORT BY COLOR DESC   Time ="
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getSize).thenComparing(Tshirt::getColor).thenComparing(Tshirt::getFabric);

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"*********************************************************************QUICK SORT BY SIZE-COLOR-FABRIC  ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getSize).thenComparing(Tshirt::getColor).thenComparing(Tshirt::getFabric)
				.reversed();

		sT = System.currentTimeMillis();
		Sorting.quickSort(0, tList.size() - 1, tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"*******************************************************************QUICK SORT BY SIZE-COLOR-FABRIC DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		// *****************************BUBBLESORT******************************************************************************

		c = Comparator.comparing(Tshirt::getSize);

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"*******************************************************************BUBBLE SORT BY SIZE ASC  Time = "
						+ (eT - sT) + " millisecs***************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getSize).reversed();

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"********************************************************************BUBBLE SORT BY SIZE DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getFabric);

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"******************************************************************BUBBLE SORT BY FABRIC ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getFabric).reversed();

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"******************************************************************BUBBLE SORT BY FABRIC DESC   Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getColor);

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"**********************************************************************BUBBLE SORT BY COLOR ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getColor).reversed();

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"*********************************************************************BUBBLE SORT BY COLOR DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getSize).thenComparing(Tshirt::getColor).thenComparing(Tshirt::getFabric);

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"********************************************************************BUBBLE SORT BY SIZE-COLOR-FABRIC  ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		c = Comparator.comparing(Tshirt::getSize).thenComparing(Tshirt::getColor).thenComparing(Tshirt::getFabric)
				.reversed();

		sT = System.currentTimeMillis();
		Sorting.bubbleSort(tList, c);
		eT = System.currentTimeMillis();

		System.out.println(
				"********************************************************************BUBBLE SORT BY SIZE-COLOR-FABRIC DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return t.getSize().ordinal();
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"***********************************************************************BUCKET SORT BY SIZE ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return Math.abs(t.getSize().ordinal() - 6);
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"***********************************************************************BUCKET SORT BY SIZE DESC Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return t.getFabric().ordinal();
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"******************************************************************BUCKET SORT BY FABRIC ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return Math.abs(t.getFabric().ordinal() - 6);
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"*******************************************************************BUCKET SORT BY FABRIC DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return t.getColor().ordinal();
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"*********************************************************************BUCKET SORT BY COLOR ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return Math.abs(t.getColor().ordinal() - 6);
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"*********************************************************************BUCKET SORT BY COLOR DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return t.getSize().ordinal() * 49 + t.getColor().ordinal() * 7 + t.getFabric().ordinal();
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"********************************************************************BUCKET SORT BY SIZE-COLOR-FABRIC  ASC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

		sT = System.currentTimeMillis();
		Sorting.bucketSort(tList, t -> {
			return Math.abs((t.getSize().ordinal() * 49 + t.getColor().ordinal() * 7 + t.getFabric().ordinal()) - 342);
		});
		eT = System.currentTimeMillis();

		System.out.println(
				"********************************************************************BUCKET SORT BY SIZE-COLOR-FABRIC DESC  Time = "
						+ (eT - sT) + " millisecs**************************************");
		for (Tshirt t : tList) {

			System.out.println(t);
		}

	}

}
