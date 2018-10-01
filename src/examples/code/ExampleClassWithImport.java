import static java.lang.Math.min;

public class ExampleClassWithImport {
  public int getValidGrade(int rawGrade) {
    return min(100, rawGrade);
  }
}
