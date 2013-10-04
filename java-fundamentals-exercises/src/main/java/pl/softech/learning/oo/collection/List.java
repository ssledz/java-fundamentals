package pl.softech.learning.oo.collection;

public interface List {

  Object get(int index);

  void add(Object obj);

  void remove(Object obj);

  int size();

  int indexOf(Object obj);
}
