public class Question {
    private String Text,Answer;
    public Question() {
        Text = "";
        Answer = "";
    }
    public String getText() {
        return Text;
    }
    public String getAnswer() {
        return Answer;
    }
    public void setText(String Text) {
        this.Text = Text;
    }

    @Override
    public String toString() {
        return "Question{\n" +
                "Text='" + Text + '\'' +
                ", \nAnswer='" + Answer + '\'' +
                "\n}";
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
    public boolean CheckAnswer(String Response){

        //*before modifying
        // return Response.equals(this.Answer);
        //
        // after modifying*//
        return Response.equalsIgnoreCase(this.Answer);//*modified for question 5
        // so that it doesn't take into account different spaces or Upper/Lowercase Characters*//
    }
    public void Display(){
        System.out.println(Text);
    }
}