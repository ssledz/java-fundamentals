package pl.softech.learning;

public class ReversString {

  public static String revers(String arg) {
    String ret = "";
    for (int i = arg.length() - 1; i >= 0; i--) {
      ret += arg.charAt(i);
    }
    return ret;
  }

  public static String recursiveRevers(String arg) {

    if (arg.length() == 1) {
      return arg;
    }

    return recursiveRevers(arg.substring(1)) + arg.charAt(0);
  }

  public static void main(String[] args) {
    System.out.println(revers("Foo bar"));
    System.out.println(recursiveRevers("Foo bar"));
  }
}
