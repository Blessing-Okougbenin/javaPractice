package Chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        // add elements in color array to list
        String[] colors = {"Magenta","Red","White","Blue","Cyan"};
        List<String> list = new ArrayList<String>();

        for (String color:colors) {
            list.add(color); //adds color to end of list
        }

        String[] removeColors = {"Red","White","Blue"};
        List<String> removeList = new ArrayList<String>();

        for (String color:removeColors) {
            removeList.add(color);
        }

//        output list contents
        System.out.println("Arraylist: ");

        for (int index = 0; index < list.size(); index++) {
            System.out.printf("%s ",list.get(index));
        }

        removeTheColors(list,removeList);

        System.out.printf("%n%nArraylist after calling removeColors: %n");

        for (String color: list) {
            System.out.printf("%s ", color);

        }
//        for (int index = 0; index < list.size(); index++) {
//            System.out.printf("%s ",list.get(index));
//        }
    }

    private static void removeTheColors(Collection<String> collection1, Collection<String> collection2) {
//        get iterator
        Iterator<String> iterator = collection1.iterator();
//        loop while collection has items
        while(iterator.hasNext()) {
            if(collection2.contains(iterator.next())){
                iterator.remove(); // remove current value
            }
        }
    }
}
