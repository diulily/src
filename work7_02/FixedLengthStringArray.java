package work7_02;
public class FixedLengthStringArray {
    private String[] array;
    private int length;

    public FixedLengthStringArray(int length) {
        this.length = length;
        array = new String[length];
    }

    public void set(int index, String value) {
        if (index >= 0 && index < length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String get(int index) {
        if (index >= 0 && index < length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String[] toArray() {
        return array.clone();
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }

    public FixedLengthStringArray concatenate(FixedLengthStringArray other) {
        FixedLengthStringArray result = new FixedLengthStringArray(length + other.length);
        for (int i = 0; i < length; i++) {
            result.set(i, array[i]);
        }
        for (int i = 0; i < other.length; i++) {
            result.set(length + i, other.get(i));
        }
        return result;
    }

    public FixedLengthStringArray merge(FixedLengthStringArray other) {
        FixedLengthStringArray result = new FixedLengthStringArray(length + other.length);
        for (int i = 0; i < length; i++) {
            result.set(i, array[i]);
        }
        for (int i = 0; i < other.length; i++) {
            String value = other.get(i);
            if (!contains(value)) {
                result.set(length + i, value);
            }
        }
        return result;
    }

    private boolean contains(String value) {
        for (int i = 0; i < length; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}

