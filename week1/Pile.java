import java.util.Scanner;
class Card{
  String suit;
  String value;
  Card(String suit, String value){
    this.suit = suit;
    this.value = value;
  }
  public void display(){
    System.out.print("The card is the ");
    System.out.println(value+" of "+ suit);
  }
}

public class Pile{
  int top;
  int max;
  Card arr[];

  Pile(){
    top = -1;
    max = 10;
    arr = new Card[10];
  }

  public Boolean isEmpty(){
    return top ==-1;
  }

  public Boolean isFull(){
    return top == max-1;
  }

  public void insert(String suit, String value){
    top++;
    arr[top] = new Card(suit, value);
    System.out.println("Successfully Inserted");
  }

  public void draw(){
    System.out.println("The drawed card is:");
    arr[top].display();
    top--;
  }

  public void peek(){
    System.out.println("Top of the pile is:");
    arr[top].display();
  }
  public static void main(String args[]){
    Pile deck = new Pile();
    Scanner sc = new Scanner(System.in);
    System.out.println("Deck of cards\n");
    int choice = 0;
    String suit, value;
    while(choice!=4){
      System.out.println("\nChoose one from the below choices\n1.Insert a Card\n2.Draw a Card\n3.Peek a Card\n4.Exit");
      choice = sc.nextInt();
      switch(choice){
        case 1:
        {
          if(deck.isFull()){
            System.out.println("Overflow");
            break;
          }
          System.out.println("Enter a suit and value");
          suit = sc.next();
          value = sc.next();
          deck.insert(suit, value);
          break;
        }
        case 2:
        {
          if(deck.isEmpty()){
            System.out.println("Underflow");
            break;
          }
          deck.draw();
          break;
        }
        case 3:
        {
          if(deck.isEmpty()){
            System.out.println("Empty Pile");
            break;
          }
          deck.peek();
          break;
        }
        case 4:
        {
          System.exit(1);
        }
      }
    }
  }
}
