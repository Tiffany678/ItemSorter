package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item>{
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
