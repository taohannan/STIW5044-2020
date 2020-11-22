import java.util.ArrayList;
import java.util.List;


/**
 * @author Hannan
 */
public class IntSetOperation extends ArrayList<Integer> {
// overview : IntSetOperation is a Utils to do operation on unbounded set of Integers
//mutable : state of Object can be change
    private List<Integer> intSet;

    public IntSetOperation() {
        intSet = new ArrayList<Integer>();
    }

    public IntSetOperation(List<Integer> intSet) {
        this.intSet = intSet;
    }

    public List<Integer> getIntSet() {
        return intSet;
    }

    public void setIntSet(List<Integer> intSet) {
        this.intSet = intSet;
    }

    @Override
    public int size() {
        return intSet.size();
    }

    @Override
    public boolean isEmpty() {
        return intSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return intSet.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return intSet.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return intSet.lastIndexOf(o);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public Integer get(int index) {
        return super.get(index);
    }

    @Override
    public Integer set(int index, Integer element) {
        //EFFECT: replace an Integer element on intset on specific index
        return super.set(index, element);
    }

    @Override
    public boolean add(Integer integer) {
        //EFFECT: add new element into intSet
        return intSet.add(integer);
    }



    @Override
    public Integer remove(int index) {
        //EFFECT : remove integer on specific index
        return intSet.remove(index);
    }

    @Override
    public void clear() {
        //EFFECT : clear all Integer value
        intSet.clear();
    }

    public Integer sums() throws NullPointerException{
        //EFFECTS: if intSet is not null will iterate all the element and sum it one by one
        return intSet.stream().mapToInt(Integer::intValue).sum();
    }

    public Integer multiply() throws NullPointerException{

       return  intSet.stream().mapToInt(Integer::intValue).reduce(1,Math::multiplyExact);
    }


}
