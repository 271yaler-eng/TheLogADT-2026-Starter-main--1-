public class LearningLinks {
    public static void main(String[] args) {
        Node one = new Node(1);
        System.out.println(one.data);
        Node two = new Node(2);
        one.setLink(two);

        System.out.println(one.getnext());

        Node three = new Node(3);
        two.setLink(three);

        System.out.println(one.getnext().getnext());

        Node temp = one;

        while(temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getnext();
        }

        Node newnode = new Node(4);
        newnode.setLink(two);

        temp = newnode;

        while(temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getnext();
        }

        System.out.println();

        temp = newnode;

        while(temp.getnext().getnext() != null)
        {
            temp = temp.getnext();
        }
        temp.setLink(null);

        temp = newnode;
        while(temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getnext();
        }

    }

}