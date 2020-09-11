/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-11
 * Time:6:35
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(10);
        myLinkedList.display();
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(19);
        myLinkedList.display();

        myLinkedList.addIndex(5,99);
        myLinkedList.addIndex(2,30);
        myLinkedList.display();
        myLinkedList.remove(20);
        myLinkedList.display();

    }
}
