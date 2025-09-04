import java.util.ArrayList;

public class StackArrayList {

    public static class stack {
        static ArrayList<Integer> stackList = new ArrayList<>();

        public static boolean isEmpty() {
            return (stackList.size() == 0);
        }

        public static void push(int data) {
            stackList.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow !!");
                return Integer.MIN_VALUE;
            }
            int value = stackList.getLast();
            stackList.removeLast();
            return value;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack Underflow !!");
                return Integer.MIN_VALUE;
            }
            return stackList.getLast();
        }

    }


    public static void main(String[] args) {
        stack.push(10);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
