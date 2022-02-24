import java.util.Scanner;

abstract class TestQuestion {
  String question;

  abstract void readQuestion(Scanner sc);
}

class ShortAnswer extends TestQuestion {
  int numLines = 1;

  void readQuestion(Scanner sc) {
    sc.nextLine();
    question = sc.nextLine();
  }

  public String toString() {
    return "Sammith S Bharadwaj PES1UG19CS427\n" + "Short Answer Question - " + question + "\nnumLines -" + numLines;
  }
}

class LongAnswer extends TestQuestion {
  int numLines;

  void readQuestion(Scanner sc) {
    sc.nextLine();
    question = sc.nextLine();
    System.out.print("Sammith S Bharadwaj PES1UG19CS427 Enter number of Lines: ");
    numLines = sc.nextInt();
  }

  public String toString() {
    return "Sammith S Bharadwaj PES1UG19CS427\n" + "Long Answer Question - " + question + "\nnumLines -" + numLines;
  }
}

class MCQ extends TestQuestion {
  int numChoices;
  String choices[];

  void readQuestion(Scanner sc) {
    sc.nextLine();
    question = sc.nextLine();
    System.out.print("Sammith S Bharadwaj PES1UG19CS427 Enter number of choices: ");
    numChoices = sc.nextInt();
    choices = new String[numChoices];
    System.out.println("Sammith S Bharadwaj PES1UG19CS427 Enter your choices");
    sc.nextLine();
    for (int i = 0; i < numChoices; i++) {
      System.out.print((i + 1) + ": ");
      choices[i] = sc.nextLine();
    }
  }

  public String toString() {
    String str = "Sammith S Bharadwaj PES1UG19CS427\n" + "MCQ Question - " + question + "\nnumChoices -" + numChoices;
    for (int i = 0; i < numChoices; i++) {
      str = str + "\n" + (i + 1) + ": " + choices[i];
    }
    return str;
  }
}

class TQManager {
  public static void main(String args[]) {
    TestQuestion tq[];
    int choice;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of questions: ");
    int no_of_questions = sc.nextInt();
    tq = new TestQuestion[no_of_questions];
    for (int i = 0; i < no_of_questions; i++) {
      System.out
          .print("\nEnter 1 for Short Answer\nEnter 2 for Long Answer\nEnter 3 for MCQ Answer\n Enter your choice: ");
      choice = sc.nextInt();
      switch (choice) {
        case 1: {
          tq[i] = new ShortAnswer();
          break;
        }
        case 2: {
          tq[i] = new LongAnswer();
          break;
        }
        case 3: {
          tq[i] = new MCQ();
          break;
        }
      }
      System.out.print("Enter your question: ");
      tq[i].readQuestion(sc);
    }
    System.out.println("\n***************Question Paper*****************\n\n");
    for (int i = 0; i < no_of_questions; i++) {
      System.out.println(tq[i].toString());
    }
  }
}
