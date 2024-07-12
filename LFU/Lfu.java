package LFU;

public class Lfu {
    Data[] cache;
    int smallestFrequencyPos;

    public Lfu() {
        this.cache = new Data[4];
        this.smallestFrequencyPos = 0;
    }

    public void lfu_logic(Data[] memory_values) {
        resetCache();

        for (int i = 0; i < memory_values.length; i++) {

            int smallestFrequency = memory_values.length;
            boolean contains = false;
            int j = 0;

            while (j < this.cache.length && contains == false) {
                if (this.cache[j] == null) {
                    this.cache[j] = memory_values[i];
                    contains = true;
                } else if (this.cache[j].value == memory_values[i].value) {
                    this.cache[j].frequency++;
                    contains = true;
                } else if (this.cache[j] != null && this.cache[j].value != memory_values[i].value
                        && j == this.cache.length - 1) {
                    int cont = 0;
                    while (cont < this.cache.length) {
                        if (this.cache[cont].frequency < smallestFrequency) {
                            smallestFrequency = this.cache[cont].frequency;
                            smallestFrequencyPos = cont;
                        }
                        cont++;
                    }

                    this.cache[smallestFrequencyPos] = memory_values[i];
                    contains = true;
                }
                j++;
            }

            for (int k = 0; k < this.cache.length; k++) {
                if (this.cache[k] != null) {
                    System.out.print(this.cache[k].value + "(" + this.cache[k].frequency + ")" + " ");
                } else {
                    System.out.print(this.cache[k] + " ");
                }
            }

            System.out.println();

        }
    }

    public void resetCache() {
        for (int i = 0; i < this.cache.length; i++) {
            this.cache[i] = null;
        }
    }
}
