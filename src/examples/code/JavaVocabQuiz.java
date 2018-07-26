public class JavaVocabQuiz {
  public static void main(String[] args) {
    String question = "What do you call a variable that holds an argument value for a method?";
    String answer = System.console().readLine(question + " ");
    if(answer.equals("parameter")) {
      System.console().printf("Correct!\n");
    } else {
      System.console().printf("Wrong!\n");
    }
  }
}