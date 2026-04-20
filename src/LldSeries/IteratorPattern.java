package LldSeries;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T>{
    boolean hasNext();
    T next();
}

interface Iterable<T>{
    Iterator<T> getIterator();
}

class LinkedList implements Iterable<Integer>{

    public int data;
    public LinkedList next;

    public LinkedList(int value){
        data = value;
        next = null;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new LinkedListIterator(this);
    }
}

class BinaryTree implements Iterable<Integer>{

    public int data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value){
        data = value;
        left = null;
        right = null;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new BinaryTreeInorderIterator(this);
    }
}

class Song{
    public String title;
    public String artist;

    public Song(String t, String a){
        title = t;
        artist = a;
    }
}

class Playlist implements Iterable<Song>{

    public List<Song> songs = new ArrayList<>();

    public void addSong(Song s){
        songs.add(s);
    }

    @Override
    public Iterator<Song> getIterator() {
        return new PlaylistIterator(songs);
    }
}

class LinkedListIterator implements Iterator<Integer>{

    private LinkedList current;
    public LinkedListIterator(LinkedList head){
        current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        int val = current.data;
        current = current.next;
        return val;
    }
}



public class IteratorPattern {
    public static void main(String[] args) {

    }

}
