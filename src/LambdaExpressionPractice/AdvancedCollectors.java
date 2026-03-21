package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

class Book{
    private String title;
    private String author;
    private String category;
    private  double price;

    public Book(String title, String author, String category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

}

public class AdvancedCollectors {
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(  new Book("Java Basics", "John Smith", "Programming", 45.99),
                new Book("Python Guide", "Alice Johnson", "Programming", 39.99),
                new Book("Mystery Novel", "Bob Wilson", "Fiction", 25.00),
                new Book("Data Science", "Charlie Brown", "Programming", 55.00),
                new Book("Romance Story", "Diana Prince", "Fiction", 20.00),
                new Book("Web Development", "Eve Davis", "Programming", 49.99));

        // === mapping() - Transform before collecting ===
        System.out.println("=== BOOK TITLES BY CATEGORY ===");
        Map<String , List<String>> titlesByCategory = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.mapping(Book::getTitle, Collectors.toList())
                ));
        titlesByCategory.forEach((cat, titles) ->
                System.out.println(cat + ": " + titles));

        // === Authors by category ===
        System.out.println("\n=== AUTHORS BY CATEGORY ===");
        Map<String , Set<String>> authorsByCategory = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.mapping(Book::getAuthor, Collectors.toSet())
                ));
        authorsByCategory.forEach((cat , authors) -> {
            System.out.println(cat + ": " + authors);
        });

        // === collectingAndThen() - Transform final result ===
        System.out.println("\n=== UNMODIFIABLE LISTS ===");
        Map<String , List<String>> unModifiableMap = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Book::getTitle , Collectors.toList()),
                                Collections::unmodifiableList
                        )
                ));
        System.out.println(unModifiableMap);

        // === Count as Integer instead of Long ===
        System.out.println("\n=== COUNT AS INTEGER ===");
        Map<String, Integer> countByCategory = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue
                        )
                ));
        countByCategory.forEach((cat, count) ->
                System.out.println(cat + ": " + count + " books"));

        // === Get first book of each category ===
        System.out.println("\n=== FIRST BOOK OF EACH CATEGORY ===");
        Map<String, String> firstBooks = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Book::getTitle, Collectors.toList()),
                                list -> list.isEmpty() ? "None" : list.get(0)
                        )
                ));
        firstBooks.forEach((cat, title) ->
                System.out.println(cat + ": " + title));

        // === Comma-separated titles by category ===
        System.out.println("\n=== COMMA-SEPARATED TITLES ===");
        Map<String ,String> joinedTitles = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.mapping(
                                Book::getTitle , Collectors.joining(", ")
                        )
                ));
        joinedTitles.forEach((cat, titles) ->
                System.out.println(cat + ": " + titles));

        // === Average price formatted ===
        System.out.println("\n=== AVERAGE PRICE (FORMATTED) ===");
        Map<String, String> avgPriceFormatted = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.averagingDouble(Book::getPrice),
                                avg -> String.format("$%.2f", avg)
                        )
                ));
        avgPriceFormatted.forEach((cat, avg) ->
                System.out.println(cat + ": " + avg));

    }
}
