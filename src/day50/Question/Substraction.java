package day50.Question;

public class Substraction extends Question {


    public Substraction(int num1, int num2) {
        super("-", "subtraction");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {
        if (num1<num2){
            answer=num2-num1;
        }else {
            answer = num1 - num2;
        }
        calculated=true;
    }

    public String toString(){
        if (calculated==true){
            return super.toString()+" : "+num1+operator+num2+" = "+answer;
        }else
        {
            return super.toString()+" : "+ num1 + operator + num2;
        }
    }


}
