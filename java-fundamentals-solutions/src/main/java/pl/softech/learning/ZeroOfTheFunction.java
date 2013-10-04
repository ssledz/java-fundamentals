package pl.softech.learning;

public class ZeroOfTheFunction {

  private static double[] x = ZeroOfTheFunctionGenerator.genXEx1();
  private static double[] y = ZeroOfTheFunctionGenerator.genYEx1();

  public static void main(String[] args) {

    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i] + ", " + y[i]);
    }

    double[] r = new double[100];
    int cnt = 0;
    for (int i = 0; i < x.length - 1; i++) {
      double tmp = y[i] * y[i + 1];
      if (tmp < 0) {
        r[cnt++] = (x[i] + x[i + 1]) / 2;
      } else if (tmp == 0) {
        if (y[i] == 0) {
          r[cnt++] = x[i];
        } else {
          r[cnt++] = x[i + 1];
        }
        i++;

      }
    }

    for (int i = 0; i < cnt; i++) {
      System.out.println("r[" + i + "]=" + r[i]);
    }
  }
}
