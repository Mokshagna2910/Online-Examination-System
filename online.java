import java.util.*;

class Question {
  String question;
  String option1;
  String option2;
  String option3;
  String option4;
  int answer;

  public Question(String question, String option1, String option2, String option3, String option4, int answer) {
    this.question = question;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.answer = answer;
  }
}

class Exam {
  List<Question> questions;
  int score;

  public Exam() {
    questions = new ArrayList<Question>();
    score = 0;
  }

  public void addQuestion(Question question) {
    questions.add(question);
  }

  public void takeExam() {
    Scanner scanner = new Scanner(System.in);
    for (Question question : questions) {
      System.out.println(question.question);
      System.out.println("A. " + question.option1);
      System.out.println("B. " + question.option2);
      System.out.println("C. " + question.option3);
      System.out.println("D. " + question.option4);
      System.out.print("Enter your answer: ");
      int answer = scanner.nextInt();
      if (answer == question.answer) {
        score++;
      }
    }
  }

  public int getScore() {
    return score;
  }
}

class OnlineExam {
  public static void main(String[] args) {
    Exam exam = new Exam();
    exam.addQuestion(new Question("What is Java?", "A language", "A city", "A drink", "A dog", 1));
    exam.addQuestion(new Question("What is the capital of France?", "Paris", "London", "Berlin", "Rome", 1));
    exam.addQuestion(new Question("What is the number of primitive datatypes in java?", "6", "7", "8", "9", 3));
    exam.addQuestion(new Question("What is the size of double and float in java?", "32 and 64", "32 and 32", "64 and 64", "64 and 32", 1));
    exam.addQuestion(new Question(Automatic" type conversion is possible in which of the following cases?", "Byte to int", "int to long", "long to int", "short to int", 2));
    exam.takeExam();
    System.out.println("Your score is: " + exam.getScore());
  }
}
