package lv.javaguru.lessons.lesson12.publicinnerclass;

public class DataStuctureMain {

    public static void main(String[] args) {
        DataStructure ds = new DataStructure(5);
        ds.put(0, 1);
        ds.put(1, 2);
        ds.put(2, 4);
        DataStructure.DataIterator it = ds.new DataIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("loop for");
        for (Integer d : ds) {
            System.out.println(d);
        }
    }

}
