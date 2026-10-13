public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setLink(Node<T> next) {
        this.next = next;
    }

    public Node<T> getnext()
    {
        return next;
    }

    public T getData() {
        return data;
    }

    public String toString() {
        return data.toString();
    }
}
