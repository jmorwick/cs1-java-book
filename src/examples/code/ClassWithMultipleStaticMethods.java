public class ClassWithMultipleStaticMethods {
  static String greeting = "Hello!";

  static void sayHello() {
    System.out.println(greeting);
  }

  static void sayHelloEmphatically() {
    System.out.println(greeting + "!!!!!!!!");
  }
}