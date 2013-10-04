package pl.softech.learning.oo.collection;

/*
 * Copyright 2013 Sławomir Śledź <slawomir.sledz@sof-tech.pl>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
