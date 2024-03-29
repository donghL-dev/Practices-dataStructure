package summercamp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MyArrayListTest {

    @Test
    public void testMyArrayListTest() {
        List<String> myArrayList = new MyArrayList();
        assertThat(myArrayList).isInstanceOf(MyArrayList.class);
        assertThat(myArrayList).isInstanceOf(List.class);
    }

    @Test
    public void testAdd() {
        List<String> list = new MyArrayList<>();
        for(int i=0; i<10; i++) {
            list.add("String" + i);
        }
        assertThat(list.size()).isEqualTo(10);
    }

    @Test
    public void testAddAllCollection() {
        List<String> list = new MyArrayList<>();

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("world");
        list2.add("java 12");

        list.addAll(list2);

        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    public void testAddAllCollectionIndex() {
        List<String> list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        List<String> list2 = new ArrayList<>();
        list2.add("5");
        list2.add("6");
        list2.add("7");

        list.addAll(1 ,list2);

        assertThat(list.get(1)).isEqualTo("5");
        assertThat(list.get(4)).isEqualTo("2");
    }

    
}