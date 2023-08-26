

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertAtBeginning(9);
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.insertAtBeginning(7);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtPos(3,1);
        list.deleteAtPos(1);
        list.display();
        System.out.println();
        list.deleteAtPos(0);
        list.display();
        System.out.println();
        list.update(0,8);
        list.display();
        System.out.println();
        list.insertAtEnd(2);
        list.display();







    }
}