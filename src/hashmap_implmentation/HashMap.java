package hashmap_implmentation;

public class HashMap {
    private Entry[] buckets;
    private static int size = 16;

    public HashMap() {
        buckets = new Entry[size];
    }

    private int getBucketIndex(Object key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(Object key, Object value) {
        int index = getBucketIndex(key);
        Entry head = buckets[index];

        Entry current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                System.out.println("Updated key " + key + " with value " + value);
                return;
            }
            current = current.next;
        }

        Entry newNode = new Entry(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        System.out.println("Inserted key " + key + " with value " + value);
    }

    public Object get(Object key) {
        int index = getBucketIndex(key);
        Entry current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(Object key) {
        int index = getBucketIndex(key);
        Entry current = buckets[index];
        Entry prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Removed key " + key);
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Key " + key + " not found.");
    }

    public void display() {
        System.out.println("HashMap contents:");
        for (int i = 0; i < size; i++) {
            Entry current = buckets[i];
            System.out.print("Bucket " + i + ": ");
            while (current != null) {
                System.out.print("[" + current.key + "=" + current.value + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
