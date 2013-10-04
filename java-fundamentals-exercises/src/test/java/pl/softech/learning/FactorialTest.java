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
package pl.softech.learning;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sławomir Śledź <slawomir.sledz@sof-tech.pl>
 */
public class FactorialTest {

  @Test
  public void testCalculate() {
    System.out.println("calculate");

    long[] expected = {
      1, 1, 2, 6, 24, 120, 720, 5040
    };

    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], Factorial.calculate(i));
    }

  }

  @Test
  public void testCalculateRecursive() {
    System.out.println("calculateRecursive");

    long[] expected = {
      1, 1, 2, 6, 24, 120, 720, 5040
    };

    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], Factorial.calculateRecursive(i));
    }
  }
}