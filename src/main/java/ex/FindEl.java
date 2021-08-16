package ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(FindEl.indexOf(new String[]{"One", "Two", "Three"}, "Four"));
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
