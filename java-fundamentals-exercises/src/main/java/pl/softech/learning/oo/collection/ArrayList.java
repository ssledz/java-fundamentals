package pl.softech.learning.oo.collection;

public class ArrayList implements List {

  private Object[] array;
  private int currentIndex;

  public ArrayList(int capacity) {
    array = new Object[capacity];
  }

  @Override
  public Object get(int index) {
    return array[index];
  }

  @Override
  public void add(Object obj) {
    array[currentIndex++] = obj;
  }

  private void swap(int i, int j) {
    Object tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  @Override
  public void remove(Object obj) {
    int index = indexOf(obj);

    if (index < 0) {
      return;
    }

    for (int i = index; i < currentIndex; i++) {
      swap(i, i + 1);
    }

    --currentIndex;
    array[currentIndex] = null;
  }

  @Override
  public int size() {
    return currentIndex;
  }

  @Override
  public int indexOf(Object obj) {
    for (int i = 0; i < currentIndex; i++) {
      if (array[i].equals(obj)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    List list = new ArrayList(10);

    list.add(12);
    list.add(1);
    list.add(4);
    list.add(2);
    list.add(111);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(4);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
