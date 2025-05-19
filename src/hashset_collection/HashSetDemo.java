package hashset_collection;

public class HashSetDemo {
    public static void main(String[] args) {
        CustomHashSet set = new CustomHashSet();
        set.add(null);
        set.add("Kacha Aam");
        set.add("Pedophile");
        set.add("Kacha Aam"); // duplicate

        System.out.println(set); // Should not contain duplicates
    }
}
