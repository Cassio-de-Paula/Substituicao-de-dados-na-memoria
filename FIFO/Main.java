package FIFO;

public class Main {
        public static void main(String args[]) {
                Fifo logic = new Fifo();

                String[] values = new String[] { "A", "B", "C", "A", "A", "B", "B", "C", "A", "D", "E", "F", "B", "A",
                                "B", "C",
                                "D" };
                String[] values1 = new String[] { "A", "D", "C", "B", "A", "B", "D", "C", "A", "D", "E", "F", "B", "A",
                                "F",
                                "C", "D" };
                String[] values2 = new String[] { "A", "D", "C", "B", "A", "B", "D", "C", "A", "D", "E", "F", "B", "A",
                                "F",
                                "C", "D", "A", "B", "C", "A", "A", "B", "B", "C", "A", "D", "E", "F", "B", "C", "D",
                                "C", "D" };

                System.out.println("Registro da Cache 1: ");
                logic.fifo_logic(values);
                System.out.println();

                System.out.println("Registro da Cache 2: ");
                logic.fifo_logic(values1);
                System.out.println();

                System.out.println("Registro da Cache 3: ");
                logic.fifo_logic(values2);
                System.out.println();
        }
}
