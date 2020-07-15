package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import tShirt.Tshirt;

public class Sorting {

	public static void quickSort(int low, int high, List<Tshirt> tList, Comparator<Tshirt> c) {

		if (tList == null || tList.size() == 0)
			return;

		if (low >= high)
			return;

		// pick the pivot
		int middle = low + (high - low) / 2;
		Tshirt pivot = new Tshirt(tList.get(middle));

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (c.compare(tList.get(i), pivot) < 0) {
				i++;

			}

			while (c.compare(tList.get(j), pivot) > 0) {
				j--;

			}

			if (i <= j) {
				Collections.swap(tList, i, j);
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(low, j, tList, c);

		if (high > i)
			quickSort(i, high, tList, c);
	}

	public static void bubbleSort(List<Tshirt> tList, Comparator<Tshirt> c) {

		int n = tList.size();
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (c.compare(tList.get(j), tList.get(j + 1)) > 0) {
					// swap arr[j+1] and arr[j]
					Collections.swap(tList, j + 1, j);
				}

	}

	public static void bucketSort(List<Tshirt> tList, ToIntFunction<Tshirt> f) {

		List<List<Tshirt>> tempList = new ArrayList<>();

		for (int i = 0; i < tList.size(); i++) {

			int dif = f.applyAsInt(tList.get(i)) - tempList.size();

			if (dif >= 0) {

				for (int j = 0; j <= dif; j++) {
					tempList.add(new ArrayList<>());

				}

			}

			tempList.get(f.applyAsInt(tList.get(i))).add(tList.get(i));

		}

		tList.clear();

		for (List<Tshirt> list : tempList) {
			if (!list.isEmpty()) {
				for (Tshirt aShirt : list) {

					tList.add(aShirt);

				}

			}

		}

	}

}
