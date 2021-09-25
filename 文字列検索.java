public class Main {
  public static void main(String[] args) {
    String sl = "Java and JavaScript";
    if (sl.contains("Java")) {
      System.out.println("文字列slは、Javaを含んでいます");
    }
    if (sl.endWith("Java")) {
      System.out.println("文字列slは、Javaが末尾にあります");
    }
    System.out.println("文字列slで最初にJavaが登場する位置は" + sl.indexOf("Java"));
    System.out.println("文字列slで最後にJavaが登場する位置は" + sl.lastIndexOf("Java"));
  }
}