import java.util.EmptyStackException;
import java.util.List;

public class IntSet {

    List<Integer> element;
    Integer item;


    public IntSet() {
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer x) {
        this.item = x;
    }

    public List<Integer> getElement() {
        return element;
    }

    public void setElement(List<Integer> element) {
        this.element = element;
    }



    // methods
    public void insert (int x){
        // MODIFIES: this
        // EFFECTS: Adds x to the elements of this, i.e., this_post =
        // this +{x}
        item =x;
       this.element.add(item);


    }

    public void remove (int x){
        // MODIFIES: this
        // EFFECTS: Removes x from this i.e., this_post = this – {x}
        item = x;
        this.element.remove(item);
    }

    public boolean isIn (int x){
        // EFFECTS: if x is in this return true else false
        return this.element.contains(x);
    }

    public int size (){
        // EFFECTS: Returns the cardinality of this
        return this.element.size();
    }


    public int choose () throws EmptyException {
        // EFFECTS: if this is empty, throw EmptyException else
        // 	returns an arbitrary element of this.
        if(this.element.isEmpty()){
            throw new EmptyException();
        }
        return this.element.stream().findAny().get();
    }

}
