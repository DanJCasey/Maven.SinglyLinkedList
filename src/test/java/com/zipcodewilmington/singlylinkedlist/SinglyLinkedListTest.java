package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAdd() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        Integer expected = 3;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addNode("Dog");
        list.addNode("Cat");
        list.addNode("Axolotl");

        Integer expected = 1;
        Integer actual = list.find("Cat");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addNode("Dog");
        list.addNode("Cat");
        list.addNode("Axolotl");

        Boolean actual = list.contains("Cat");

        Assert.assertTrue(actual);
    }

    @Test
    public void testRemove() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addNode("Dog");
        list.addNode("Cat");
        list.addNode("Axolotl");
        list.addNode("Hamster");
        list.addNode("Naked Mole Rat");

        list.remove("Axolotl");
        Integer expected = 4;
        Integer actual = list.size();
        list.display();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGet() {
        SinglyLinkedList<Long> list = new SinglyLinkedList<Long>();
        list.addNode(10l);
        list.addNode(1l);
        list.addNode(103l);
        list.addNode(95l);

        Long expected = 103l;
        Long actual = list.get(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCopy() {
        SinglyLinkedList<Float> list = new SinglyLinkedList<Float>();
        Float expected = 2.3f;
        Float expected2 = 1.8f;


        list.addNode(1.0f);
        list.addNode(1.3f);
        list.addNode(2.3f);
        list.addNode(1.5f);

        SinglyLinkedList<Float> copied = list.copy();
        list.set(2, expected2);

        Float actual = copied.get(2);
        Float actual2 = list.get(2);
        System.out.println(expected);
        System.out.println(expected2);
        System.out.println(actual);
        System.out.println(actual2);


        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testSort() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addNode(12);
        list.addNode(21);
        list.addNode(33);
        list.addNode(1);
        list.addNode(200);
        list.addNode(4);

        list.sort();

        Integer expected = 1;
        Integer actual = list.get(0);

        list.display();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverse() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addNode(12);
        list.addNode(21);
        list.addNode(33);
        list.addNode(4);

        list.reverse();

        Integer expected = 4;
        Integer actual = list.get(0);

        list.display();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSlice(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addNode(12);
        list.addNode(21);
        list.addNode(33);
        list.addNode(4);
        list.addNode(3);
        list.addNode(100);

        SinglyLinkedList<Integer> result = list.slice(1, 4);
        Integer expected = 3;
        Integer actual = result.size();

        result.display();
        Assert.assertEquals(expected, actual);
    }
}
