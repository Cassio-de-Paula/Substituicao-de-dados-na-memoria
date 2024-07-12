package LRU;

public class Lru {
    Data[] cache;

    public Lru() {
        this.cache = new Data[4];
    }

    public void Lru_logic(Data memory_values[]) {
        resetCache();
        int lastRecentlyUsedPos = 0;

        for (int i = 0; i < memory_values.length; i++) {

            boolean contains = false;
            int lastRecentlyUsedLine = memory_values.length;
            int j = 0;

            while (j < this.cache.length && contains == false) {
                if (this.cache[j] == null) {
                    this.cache[j] = memory_values[i];
                    this.cache[j].lastRef = i;
                    contains = true;
                } else if (this.cache[j].value == memory_values[i].value) {
                    this.cache[j].lastRef = i;
                    contains = true;
                } else if (this.cache[j] != null && this.cache[j].value != memory_values[i].value
                        && j == this.cache.length - 1) {
                    int cont = 0;
                    while (cont < this.cache.length) {
                        if (this.cache[cont].lastRef < lastRecentlyUsedLine) {
                            lastRecentlyUsedLine = this.cache[cont].lastRef;
                            lastRecentlyUsedPos = cont;
                        }
                        cont++;
                    }

                    this.cache[lastRecentlyUsedPos] = memory_values[i];
                    this.cache[lastRecentlyUsedPos].lastRef = i;
                    contains = true;
                }
                j++;
            }

            for (int k = 0; k < this.cache.length; k++) {
                if (this.cache[k] != null) {
                    System.out.print(this.cache[k].value + "(" + this.cache[k].lastRef + ")" + " ");
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
