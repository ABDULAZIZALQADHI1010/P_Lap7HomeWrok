import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
    private ArrayList<String> Choices;

    public ChoiceQuestion()
    {
        Choices=new ArrayList<>();
    }
    public void AddChoices(String Ch,boolean correct)
    {
        Choices.add(Ch);
        if (correct) {
            setAnswer(Choices.size()+"");
        }
    }
    public void Display()
    {
        super.Display();
        for (int i = 0; i < Choices.size(); i++) {
            System.out.println(i+1+"- "+Choices.get(i));
        }
    }

    @Override
    public String toString() {
        return "ChoiceQuestion{\n" +
                "Choices=" + Choices +
                "\n}";
    }
}