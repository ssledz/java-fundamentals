package pl.softech.learning;

public class ZeroOfTheFunctionGenerator {

  private interface Function {

    double calculate(double arg);
  }

  private static double[] linspace(double a, double b, int n) {
    double[] ret = new double[n];
    double dx = (b - a) / (n - 1);
    for (int i = 0; i < n; i++) {
      ret[i] = i * dx;
    }
    return ret;
  }

  private static double[] eval(Function func, double[] args) {
    double[] ret = new double[args.length];
    for (int i = 0; i < args.length; i++) {
      ret[i] = func.calculate(args[i]);
    }
    return ret;
  }

  public static double[] genXEx1() {
    return linspace(0, 6, 100);
  }

  public static double[] genYEx1() {
    return eval(new Function() {
      @Override
      public double calculate(double arg) {
        return (arg - 1) * (arg - 2) * (arg - 3) * (arg - 4);
      }
    }, genXEx1());
  }
}
