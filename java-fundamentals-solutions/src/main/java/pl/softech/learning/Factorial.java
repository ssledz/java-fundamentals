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

/**
 *
 * @author Sławomir Śledź <slawomir.sledz@sof-tech.pl>
 */
public class Factorial {

  public static long calculate(int n) {

    if (n == 0) {
      return 1;
    }

    long ret = 1;
    for (int i = 1; i <= n; i++) {
      ret *= i;
    }

    return ret;
  }

  public static long calculateRecursive(int n) {

    if (n == 0) {
      return 1;
    }

    return n * calculateRecursive(n - 1);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("" + i + "! = " + calculate(i));
      System.out.println("" + i + "! = " + calculateRecursive(i));
    }
  }
}
