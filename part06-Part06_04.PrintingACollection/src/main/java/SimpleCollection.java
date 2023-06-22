
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String value = "";
        if (this.elements.size() == 1) {
            value = value + this.elements.get(0);
            return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + value;
            //The collection alphabet has 1 element:
        } else {
            for (String element : elements) {
                value = value + element + "\n";
            }
            return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + value;
        }

    }

}
