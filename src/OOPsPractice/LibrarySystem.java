package OOPsPractice;

import java.util.ArrayList;
class Book2{
    String book;
    String author;
    int price;
    public void setValue(String book,String author,int price){
        this.book = book;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Book: "+book+", Author: "+author+", Price: "+price;
    }
}
class Library2{
    ArrayList<Book2> arr = new ArrayList<>();
    public void addBooks(Book2 b){
        arr.add(b);
    }
    public void removeBooks(Book2 b){
        arr.remove(b);
    }
    public void searchBooks(Book2 b){
        boolean flag = false;
        for(Book2 ele :arr){
            if(ele == b){
                System.out.println("Found: "+ele);
                System.out.println("Index number: "+arr.indexOf(ele));
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("This Book is not available");
        }
    }
    public void display(){
        for(Book2 ele: arr){
            System.out.println(ele);
        }
        System.out.println("Number of Books: "+arr.size());
    }

}
public class LibrarySystem {
    public static void main(String[] args) {
        Book2 b = new Book2();
        b.setValue("Tofaan","Tofaani",199);
        Book2 b1 = new Book2();
        b1.setValue("Banker","Ban",299);
        Book2 b2 = new Book2();
        b2.setValue("Kaala rang","Kaalu",399);
        Library2 l = new Library2();
        l.addBooks(b);
        l.addBooks(b1);
        l.addBooks(b2);
        l.display();
        System.out.println();
        l.removeBooks(b);
        l.display();
        System.out.println();
        l.searchBooks(b1);
    }
}
