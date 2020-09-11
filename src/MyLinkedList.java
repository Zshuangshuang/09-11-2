/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-11
 * Time:6:35
 **/

class Node{
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;

    public MyLinkedList() {
        this.head = null;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        node.setNext(head);
        this.head = node;
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getData()+"  ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }

        cur.setNext(node);
    }
    public int size(){
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    private Node findPrev(int index){
        Node cur = this.head;
        while(index-1 > 0){
            cur = cur.getNext();
            index--;
        }
        return cur;
    }
    private boolean checkPos(int pos){
        if (pos < 0 || pos > size()){
            return true;
        }
        return false;
    }
    public void addIndex(int pos,int data){
        boolean ret = checkPos(pos);
        if (ret){
            throw new ArrayIndexOutOfBoundsException("pos位置不合法");
        }
        if (pos == 0){
            addFirst(data);
            return;
        }
        if (pos == size()){
            addLast(data);
            return;
        }
        Node cur = findPrev(pos);
        Node node = new Node(data);
        node.setNext(cur.getNext());
        cur.setNext(node);

    }
    private Node searchPrev(int key){
        Node cur = this.head;
        while(cur.getNext() != null){
            if (cur.getNext().getData() == key){
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
    public void remove(int key){
        if (this.head == null){
            return;
        }
        if (this.head.getData() == key){
            this.head = this.head.getNext();
            return;
        }
        Node ret = searchPrev(key);
        if (ret == null){
            System.out.println("没有当前要删除的节点");
            return;
        }
        Node del = ret.getNext();
        ret.setNext(del.getNext());
    }
}
