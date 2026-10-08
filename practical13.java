import java.util.Scanner;

public class practical13{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your paragraph below:");
    String paragraph = sc.nextLine();

    int sentenceCount = 0;
    int wordCount = 0;

    // Loop through charachter
    for (int i = 0; i < paragraph.length(); i++){
      char ch = paragraph.charAt(i);

      if(ch == '.' || ch == '!' || ch == '?') {
        sentenceCount++;
      }
      if (ch == ' ' && paragraph.charAt(i -1) != ' '){
        wordCount++;
      }
    }

    if (paragraph.length() > 0 && paragraph.trim().length() > 0) {
      wordCount++;
    }

    System.out.println("\n--- Analysis Results ---");
    System.out.println("Total Sentences: " + sentenceCount);
    
  }
}
