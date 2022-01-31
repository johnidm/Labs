package br.com.johnidouglasmarangon;

class InsertionSortResult {
    public Integer[] arr;
    public Integer shifts;

    public InsertionSortResult(Integer[] arr, Integer shifts) {
        this.arr = arr;
        this.shifts = shifts;
    }

}

class InsertionSort {

    public InsertionSortResult exce(Integer arr[]) {

        Integer shifts = 0;
        Integer size = arr.length;

        boolean unChangeDescendingOrder = true;

        for (Integer step = 1; step < size; step++) {
            Integer key = arr[step];
            Integer j = step - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;

                unChangeDescendingOrder = false;
            }

            arr[j + 1] = key;
            shifts++;

        }

        if (unChangeDescendingOrder) {
            return new InsertionSortResult(arr, 0);
        }

        return new InsertionSortResult(arr, shifts);
    }
}