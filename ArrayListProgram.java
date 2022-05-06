import java.util.ArrayList;

class ArrayListProgram {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(3);
    numbers.add(5);
    System.out.println("ArrayList: " + numbers);

    // remove element at index 2
    int removedElement = numbers.remove(2);

    System.out.println("Removed Element: " + removedElement);
    System.out.println("After removing the element: " + numbers);
  }
}