package controllers;

import models.Brand;

public class BrandController {

    public Brand[] sortSelectionAsc(Brand[] brands) {
        if (brands == null) return null;

        int n = brands.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (brands[j].getTotalValidYears() < brands[minIndex].getTotalValidYears()) {
                    minIndex = j;
                }
            }

            Brand temp = brands[i];
            brands[i] = brands[minIndex];
            brands[minIndex] = temp;
        }

        return brands;
    }

    public Brand binarySearchByValidYears(Brand[] brands, int validYears) {
        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = brands[mid].getTotalValidYears();

            if (midValue == validYears) {
                return brands[mid];
            }

            // Como está en ASCENDENTE → lógica normal
            if (validYears < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }
}
