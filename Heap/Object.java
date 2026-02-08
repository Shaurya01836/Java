package Heap;


import java.util.PriorityQueue;

public class Object {

    static class Student implements Comparable<Student> {
        String name;
        int rank;


        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Shaurya", 100));
        pq.add(new Student("Gaurav", 200));
        pq.add(new Student("Nitin", 3));
        pq.add(new Student("Harsh", 4));
        pq.add(new Student("Siddhant", 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }


    }

}
