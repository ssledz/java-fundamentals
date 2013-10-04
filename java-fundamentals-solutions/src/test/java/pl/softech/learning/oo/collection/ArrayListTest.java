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
package pl.softech.learning.oo.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Sławomir Śledź <slawomir.sledz@sof-tech.pl>
 */
public class ArrayListTest {
  
  List list;
  
  @Before
  public void setUp() {
    list = new ArrayList(100);
    list.add(12);
    list.add(1);
    list.add(4);
    list.add(2);
    list.add(111);
  }

  @Test
  public void testGet() {
    System.out.println("get");
    assertEquals(12, list.get(0));
    assertEquals(2, list.get(3));
    assertEquals(111, list.get(4));
  }

  @Test
  public void testAdd() {
    System.out.println("add");
    assertEquals(5, list.size());
    list.add(123);
    list.add(1234);
    list.add(12345);
    assertEquals(8, list.size());
    assertEquals(123, list.get(5));
    assertEquals(1234, list.get(6));
    assertEquals(12345, list.get(7));
  }

  @Test
  public void testRemove() {
    System.out.println("remove");
    assertEquals(5, list.size());
    list.remove(1234);
    assertEquals(5, list.size());
    assertEquals(4, list.get(2));
    list.remove(4);
    assertEquals(4, list.size());
    assertEquals(2, list.get(2));
  }

  @Test
  public void testSize() {
    System.out.println("size");
    assertEquals(5, list.size());
    list.add(1234);
    assertEquals(6, list.size());
    list.remove(12);
    assertEquals(5, list.size());
  }

  @Test
  public void testIndexOf() {
    System.out.println("indexOf");
    assertEquals(0, list.indexOf(12));
    assertEquals(3, list.indexOf(2));
  }
}