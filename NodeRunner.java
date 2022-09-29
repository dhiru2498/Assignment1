class Node
{
    int data;
        Node next;
        Node( int data)
        {
            this.data = data;
            this.next = null;
        }
}

class Mylinkedlist {
    Node head;

    Mylinkedlist add(Mylinkedlist list, int data) {
        Node n = new Node(data);
        if (list.head == null) {
            list.head = n;
        } else {
            Node lastNode = list.head;
            while (lastNode. next != null) {
                lastNode = lastNode.next;

            }
            lastNode.next = n;
        }
        return list;
    }

    void displsy(Mylinkedlist list) {
        Node presentNode = list.head;
        while (presentNode != null) {
            System.out.println(presentNode.data + "\t");
            presentNode = presentNode.next;
        }
    }
    /*int findlastnodedata(Node n) {
            int b = n.next.next.data;
            return b;
        }
    }*/
}


class NodeRunner
{
    public static void main(String[] args) {
        Mylinkedlist obj = new Mylinkedlist();
       /* Node n1=obj.add(5);
        Node n2=obj.add(6);
        Node n3=obj.add(7);*/
        /*n1.next=n2;
        n2.next=n3;*/
        //System.out.println(obj.findlastnodedata(n1));

        obj.add(obj,15);
        obj.add(obj,25);
        obj.add(obj,35);
        obj.add(obj,45);
        obj.add(obj,55);
        obj.displsy(obj);
    }
}
