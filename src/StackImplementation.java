class Stack <V> {
    private int max_Size;
    private int top;
    private V arr[];

    public Stack(int max_Size) {
        this.max_Size = max_Size;
        this.top = -1;
        arr = (V[]) new Object[max_Size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max_Size - 1;
    }

    public int getMaxSize() {
        return max_Size;
    }

    public V top() {
        if (isEmpty())
            return null;
        return arr[top];
    }

    public void push(V value) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        }
        arr[++top] = value;
    }

    public V pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        }
        return arr[top--];
    }
}
public class StackImplementation {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>(5);
        System.out.println("Push the elements in a stack");
        for(int i = 0; i< 5; i++){
            stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println("\nIs Stack full? \n" + stack.isFull());
        System.out.print("Elements popped from the Stack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop()+" "); //pops all 5 elements from the stack and prints them
        }
        System.out.println("\nIs Stack empty? \n" + stack.isEmpty());
    }
}
