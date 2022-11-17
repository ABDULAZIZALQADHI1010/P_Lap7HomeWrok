import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Question q=new Question();
        q.setText("What's your name?");
        q.setAnswer("Ali");


        ChoiceQuestion q2=new ChoiceQuestion();

        q2.setText("Who are you?");
        q2.AddChoices("Ali",false);
        q2.AddChoices("Abd",true);
        q2.AddChoices("Moh",false);

        NumericQuestion n=new NumericQuestion();
        n.setText("what's the result of : 90%8.5");
        n.setAnswer("7.65");

        FillInQuestion f=new FillInQuestion();
        f.setText("The inventor of JAVA was");
        f.setAnswer("James Gosling");
//        presentQuestion(q);
//       presentQuestion(q2);
//        presentQuestion(n);
//        presentQuestion(f);
        System.out.println(q2.toString());
    }
    public static void presentQuestion(Question q)
    {
        q.Display();
        Scanner in=new Scanner(System.in);
        String a =in.nextLine();
        System.out.println(q.CheckAnswer(a));
    }
}