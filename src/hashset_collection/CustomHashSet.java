package hashset_collection;

import java.util.LinkedList;

public class CustomHashSet {
    private static final int SIZE = 16;
    private LinkedList<Object>[] buckets;

    public CustomHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getIndex(Object key) {
        return (key == null) ? 0 : Math.abs(key.hashCode()) % SIZE;
    }

    public boolean add(Object key) {
        int index = getIndex(key);
        LinkedList<Object> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
            return true;
        }
        return false;
    }

    public boolean contains(Object key) {
        int index = getIndex(key);
        return buckets[index].contains(key);
    }

    public boolean remove(Object key) {
        int index = getIndex(key);
        return buckets[index].remove(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (LinkedList<Object> bucket : buckets) {
            for (Object obj : bucket) {
                sb.append(obj).append(", ");
            }
        }
        if (sb.length() > 1)
            sb.setLength(sb.length() - 2); // remove trailing comma
        sb.append("]");
        return sb.toString();
    }
}
