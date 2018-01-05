public class Calculation {
    private int number1,number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int add(int number1, int number2)
    {
        int add=number1+number2;
        System.out.println("Addition is: "+add);
        return add;
    }

    public void sub(int number1,int number2)
    {
        int sub=number1-number2;
        System.out.println("Substraction is: "+sub);
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        int ans = calc.add(20,10);

        Hello h= new Hello();
        h.diplayArithmatic(ans);

        calc.add(20,10);
        calc.sub(20,10);
    }
}
