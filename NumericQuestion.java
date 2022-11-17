public class NumericQuestion extends Question{

    public NumericQuestion()
    {

    }
    public boolean CheckAnswer(String Response)//كل شيئ موجود في كلاس الأب فقط نحتاج إضافة تعديل على دالة التحقق من الإجابة
    {
        return ((Double.valueOf(Response)==Double.valueOf(getAnswer()))||(Double.valueOf(Response)<=Double.valueOf(getAnswer())+0.01));

    }
}
