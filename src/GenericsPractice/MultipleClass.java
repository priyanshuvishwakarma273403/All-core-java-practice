package GenericsPractice;

import java.io.Serializable;

interface Printable{
    void print();
}

interface Saveable{
    void save();
}
 class Document implements Printable, Saveable, Serializable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing "+ content);

    }

    @Override
    public void save() {
        System.out.println("Saving "+ content);

    }
    public String getContent() {
        return content;
    }
}

class DocumentProcessor <T extends Printable & Saveable>{
    private T document;
    public DocumentProcessor(T document) {
        this.document = document;
    }

    public void process() {
        document.print();
        document.save();
        System.out.println("Processing Completed");
    }
}

class NumberProcessor <T extends Number & Comparable>{
    public T findMax(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    public double Average(T a, T b) {
        return (a.doubleValue() + b.doubleValue())/2;
    }
}

public class MultipleClass {
    public static void main(String[] args) {
        System.out.println("=== Document Processor Demo ===");
        Document doc = new Document("Important Report");
        DocumentProcessor<Document> dp = new DocumentProcessor<>(doc);
        dp.process();

        System.out.println("\n=== Number Processor Demo ===");
        NumberProcessor<Integer> intProcessor = new NumberProcessor<>();
        System.out.println("Max of 10 and 20 :"+intProcessor.findMax(10,20));
        System.out.println("Average of 10 and 20 :"+intProcessor.Average(10,20));

        NumberProcessor<Double> doubleProcessor = new NumberProcessor<>();
        System.out.println("Max of 3.14 and 2.17 :"+doubleProcessor.findMax(3.14,2.17));
        System.out.println("Average of 3.14 and 2.17 :"+doubleProcessor.Average(3.14,2.17));

    }
}
