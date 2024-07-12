package FIFO;

public class Fifo {

    String[] cache;
    int pos;

    public Fifo() {
        this.cache = new String[4];
        this.pos = 0;
    }

    public void fifo_logic(String memory_values[]) {

        resetCache();

        for (int i = 0; i < memory_values.length; i++) {
            boolean contains = false;
            int j = 0;

            while (j < this.cache.length && contains == false) {
                if (this.cache[j] == memory_values[i]) {
                    contains = true;
                } else if (this.cache[j] == null) {
                    this.cache[j] = memory_values[i];
                    contains = true;
                } else if (this.cache[j] != null && this.cache[j] != memory_values[i] && j == this.cache.length - 1) {
                    if (this.pos == this.cache.length) {
                        this.pos = 0;
                    }
                    this.cache[this.pos] = memory_values[i];
                    this.pos++;
                    contains = true;
                }

                j++;
            }

            for (int k = 0; k < this.cache.length; k++) {
                System.out.print(this.cache[k] + " ");
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
