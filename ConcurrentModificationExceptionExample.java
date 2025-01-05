public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (String item : list) {
            if (item.equals("b")) {
                list.remove(item);
            }
        }
    }
}