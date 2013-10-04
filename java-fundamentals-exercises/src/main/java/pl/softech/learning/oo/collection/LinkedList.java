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
public class LinkedList implements List {

  private class Element {

    Object value;
    Element next;

    Element(Object value) {
      this.value = value;
    }
  }
  private Element head;
  private Element tail;
  private int size;

  @Override
  public Object get(int index) {

    if (head == null) {
      return null;
    }

    int i = 0;
    for (Element e = head; e != null; e = e.next, i++) {
      if (i == index) {
        return e.value;
      }
    }

    return null;
  }

  @Override
  public void add(Object obj) {

    size++;
    if (head == null) {
      head = new Element(obj);
      tail = head;
      return;
    }

    Element el = new Element(obj);
    tail.next = el;
    tail = el;
  }

  @Override
  public void remove(Object obj) {

    if (head == null) {
      return;
    }

    if (obj.equals(head.value)) {
      head = head.next;
      size--;
      if (head == null) {
        tail = null;
      }

      return;
    }

    for (Element prev = head, curr = head.next; curr != null; prev = prev.next, curr = curr.next) {
      if (curr.value.equals(obj)) {
        size--;
        prev.next = curr.next;
        if (prev.next == null) {
          tail = prev;
        }
        return;
      }
    }

  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public int indexOf(Object obj) {
    // TODO Auto-generated method stub
    return 0;
  }

  public static void main(String[] args) {
    List list = new LinkedList();

    list.add(12);
    list.add(1);
    list.add(4);
    list.add(2);
    list.add(111);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(4);

    System.out.println("");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(111);

    System.out.println("");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(111);
    list.remove(12);

    System.out.println("");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(1);
    list.remove(2);

    System.out.println("");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
