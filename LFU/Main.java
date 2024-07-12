package LFU;

public class Main {
    public static void main(String args[]) {
        String[] values = new String[] { "A", "B", "C", "A", "A", "B", "B", "C", "A", "D", "E", "F", "B", "A", "B", "C",
                "D" };
        String[] values1 = new String[] { "A", "D", "C", "B", "A", "B", "D", "C", "A", "D", "E", "F", "B", "A", "F",
                "C", "D" };
        String[] values2 = new String[] { "A", "D", "C", "B", "A", "B", "D", "C", "A", "D", "E", "F", "B", "A", "F",
                "C", "D", "A", "B", "C", "A", "A", "B", "B", "C", "A", "D", "E", "F", "B", "C", "D", "C", "D" };

        Data[] myData = new Data[values.length];
        Data[] myData1 = new Data[values1.length];
        Data[] myData2 = new Data[values2.length];

        for (int i = 0; i < myData.length; i++) {
            Data value = new Data(values[i]);
            myData[i] = value;
        }

        for (int i = 0; i < myData1.length; i++) {
            Data value_1 = new Data(values1[i]);
            myData1[i] = value_1;
        }

        for (int i = 0; i < myData2.length; i++) {
            Data value_2 = new Data(values2[i]);
            myData2[i] = value_2;
        }

        Lfu myLfu = new Lfu();

        System.out.println("Registro da Cache 1");
        myLfu.lfu_logic(myData);
        System.out.println();

        System.out.println("Registro da Cache 2");
        myLfu.lfu_logic(myData1);
        System.out.println();

        System.out.println("Registro da Cache 3");
        myLfu.lfu_logic(myData2);
        System.out.println();
    }
}
