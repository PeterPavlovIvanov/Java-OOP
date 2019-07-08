package InheritanceLab.StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings extends ArrayList {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (!this.isEmpty()) {
            String result = this.data.get(this.data.size() - 1);
            this.data.remove(this.data.size() - 1);
            return result;
        } else {
            return null;
        }

    }

    public String peek() {
        if (!this.isEmpty()) {
            return this.data.get(this.data.size() - 1);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {

        if (this.data.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
