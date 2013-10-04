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
public class PiApproximation {

  /**
   * sum_0^inf (-1)^n / (2n + 1) = pi/4
   */
  public static double calculatePi(int n) {

    double pi = 0;
    for(int i = 0; i < n; i++) {
      pi += (double)Math.pow(-1, i) / (2.0 * i + 1);
    }
    return 4 * pi;
  }
  
  public static void main(String[] args) {
    System.out.println(calculatePi(1000000));
  }
  
}
