//package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Task01_MergeUnique.run();
        Task02_MaxElement.run();

    }
}

// 1. Merge Unique Elements
class Task01_MergeUnique {
    public static void run() {
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList("Python", "JavaScript", "Ruby"));
        Set<String> set = new LinkedHashSet<>(books1);
        set.addAll(books2);
        System.out.println("1. Merged: " + new ArrayList<>(set));
    }
}

// 2. Find Maximum Element
class Task02_MaxElement {
    public static void run() {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Inception", "Interstellar", "The Dark Knight"));
        String longest = Collections.max(movies, Comparator.comparingInt(String::length));
        System.out.println("2. Longest movie: " + longest);
    }
}

// 3. Count Occurrences
class Task03_CountPizza {
    public static void run() {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Pizza", "Salad"));
        System.out.println("3. Pizza count: " + Collections.frequency(foods, "Pizza"));
    }
}

// 4. Remove All Matching Elements
class Task04_RemoveBanana {
    public static void run() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Banana"));
        fruits.removeAll(Collections.singleton("Banana"));
        System.out.println("4. No bananas: " + fruits);
    }
}

// 5. Replace All Elements
class Task05_PaintBlack {
    public static void run() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.fill(colors, "Black");
        System.out.println("5. Colors: " + colors);
    }
}

// 6. Check Sublist Presence
class Task06_CheckSublist {
    public static void run() {
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Soccer", "Football", "Tennis", "Golf"));
        boolean hasSub = sports.containsAll(Arrays.asList("Football", "Tennis"));
        System.out.println("6. Contains sublist: " + hasSub);
    }
}

// 7. Find Index of Element
class Task07_FlowerIndex {
    public static void run() {
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Tulip", "Rose", "Daisy"));
        System.out.println("7. First: " + flowers.indexOf("Rose") + ", Last: " + flowers.lastIndexOf("Rose"));
    }
}

// 8. Remove Duplicates
class Task08_UniqueAnimals {
    public static void run() {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Cat", "Bird"));
        ArrayList<String> unique = new ArrayList<>(new LinkedHashSet<>(animals));
        System.out.println("8. Unique animals: " + unique);
    }
}

// 9. Convert ArrayList to Array
class Task09_ToCityArray {
    public static void run() {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York", "London", "Tokyo"));
        String[] arr = cities.toArray(new String[0]);
        System.out.println("9. Array: " + Arrays.toString(arr));
    }
}

// 10. Convert Array to ArrayList
class Task10_ToNumberList {
    public static void run() {
        Integer[] nums = {10, 20, 30, 40};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        System.out.println("10. ArrayList: " + list);
    }
}

// 11. Find Common Elements
class Task11_CommonCountries {
    public static void run() {
        ArrayList<String> c1 = new ArrayList<>(Arrays.asList("USA", "Japan", "France"));
        ArrayList<String> c2 = new ArrayList<>(Arrays.asList("France", "Germany", "USA"));
        c1.retainAll(c2);
        System.out.println("11. Common: " + c1);
    }
}

// 12. Remove Even-Length Strings
class Task12_RemoveEvenNames {
    public static void run() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Bob", "Alice", "John"));
        names.removeIf(s -> s.length() % 2 == 0);
        System.out.println("12. Odd length names: " + names);
    }
}

// 13. Find Smallest Element
class Task13_ShortestSong {
    public static void run() {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Hello", "Hi", "Yesterday"));
        String shortest = Collections.min(songs, Comparator.comparingInt(String::length));
        System.out.println("13. Shortest song: " + shortest);
    }
}

// 14. Replace All Vowels
class Task14_MaskVowels {
    public static void run() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "Programming"));
        words.replaceAll(s -> s.replaceAll("(?i)[aeiou]", "*"));
        System.out.println("14. Masked: " + words);
    }
}

// 15. Partition ArrayList
class Task15_PartitionNums {
    public static void run() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for (int n : nums) { if (n % 2 == 0) even.add(n); else odd.add(n); }
        System.out.println("15. Even: " + even + ", Odd: " + odd);
    }
}

// 16. Rotate Elements
class Task16_RotateDays {
    public static void run() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri"));
        Collections.rotate(days, 2);
        System.out.println("16. Rotated: " + days);
    }
}

// 17. Remove Null Values
class Task17_ClearNulls {
    public static void run() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Mark", null, "Elena", null));
        students.removeAll(Collections.singleton(null));
        System.out.println("17. Valid students: " + students);
    }
}

// 18. Find Second Largest Element
class Task18_SecondLongestMovie {
    public static void run() {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Titanic", "Avatar", "Up", "Gladiator"));
        movies.sort((a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("18. Second longest: " + (movies.size() > 1 ? movies.get(1) : "N/A"));
    }
}

// 19. Replace Elements with Lengths
class Task19_FruitLength {
    public static void run() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Banana"));
        ArrayList<String> lens = new ArrayList<>();
        for (String f : fruits) lens.add(String.valueOf(f.length()));
        System.out.println("19. Lengths: " + lens);
    }
}

// 20. Create Nested ArrayList
class Task20_NestedDepts {
    public static void run() {
        ArrayList<ArrayList<String>> depts = new ArrayList<>();
        depts.add(new ArrayList<>(Arrays.asList("IT", "Max", "Leo")));
        depts.add(new ArrayList<>(Arrays.asList("HR", "Anna")));
        System.out.println("20. Nested: " + depts);
    }
}