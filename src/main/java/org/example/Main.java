package org.example;

import java.util.*;


class Main {

    public static void main(String[] args) {

        hashSetPractice();
        arrayDequePractice();

    }

    // ===== 1–10 HashSet =====
    public static void hashSetPractice() {

        // 1 Unique Integers
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,4,4,5);
        HashSet<Integer> unique = new HashSet<>(numbers);
        System.out.println("Unique numbers: " + unique);

        // 2 Check Membership
        HashSet<String> users = new HashSet<>();
        users.add("Anna");
        users.add("John");
        users.add("Mike");

        System.out.println(users.contains("John"));
        System.out.println(users.contains("Sara"));

        // 3 Set Size & Emptiness
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());

        // 4 Remove Elements
        HashSet<String> names = new HashSet<>(Arrays.asList("Ali","Sara","Tom","Lina","Mark"));
        boolean removed = names.remove("Tom");

        System.out.println(removed);
        System.out.println(names);

        // 5 addAll
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4));

        set1.addAll(set2);
        System.out.println(set1);

        // 6 removeAll
        HashSet<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(3,4));

        A.removeAll(B);
        System.out.println(A);

        // 7 retainAll
        HashSet<Integer> X = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> Y = new HashSet<>(Arrays.asList(3,4,5));

        X.retainAll(Y);
        System.out.println(X);

        // 8 containsAll
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(2,3));

        System.out.println(setA.containsAll(setB));

        // 9 Deduplicate Words
        String sentence = "java java code code practice";
        String[] words = sentence.split(" ");

        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        System.out.println(wordSet);

        // 10 Case-Insensitive Unique Words
        String[] w = {"Apple","apple","APPLE","Banana"};

        HashSet<String> caseSet = new HashSet<>();

        for(String s : w){
            caseSet.add(s.toLowerCase());
        }

        System.out.println(caseSet);
    }



    // ===== 11–21 ArrayDeque =====
    public static void arrayDequePractice() {

        // 11 Offer / Peek / Poll
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }

        // 12 Stack Behavior
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        // 13 Add First / Last
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);

        System.out.println(deque);

        // 14 Offer First / Last
        deque.offerFirst(5);
        deque.offerLast(10);
        System.out.println(deque);

        // 15 Peek Variants
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // 16 Poll Variants
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        // 17 Remove First / Last Occurrence
        ArrayDeque<String> d = new ArrayDeque<>(Arrays.asList("a","b","c","b","a"));

        d.removeFirstOccurrence("b");
        System.out.println(d);

        d.
                removeLastOccurrence("a");
        System.out.println(d);

        // 18 Size & Empty
        System.out.println(d.size());
        System.out.println(d.isEmpty());

        // 19 Clear
        d.clear();
        System.out.println(d.peek());
        System.out.println(d.isEmpty());

        // 20 Palindrome
        String text = "level";

        ArrayDeque<Character> pal = new ArrayDeque<>();

        for(char c : text.toCharArray()){
            pal.add(c);
        }

        boolean isPalindrome = true;

        while(pal.size() > 1){
            if(pal.pollFirst() != pal.pollLast()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);

        // 21 Task Scheduler
        ArrayDeque<String> tasks = new ArrayDeque<>();

        addTask(tasks,"Homework", false);
        addTask(tasks,"Urgent Project", true);
        addTask(tasks,"Gym", false);

        while(!tasks.isEmpty()){
            processTask(tasks);
        }
    }

    static void addTask(ArrayDeque<String> tasks, String task, boolean highPriority){
        if(highPriority){
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
    }

    static void processTask(ArrayDeque<String> tasks){
        System.out.println("Processing: " + tasks.pollFirst());
    }

}
