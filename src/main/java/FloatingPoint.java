public class FloatingPoint {
    private float num1,num2;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public  float add(float num1,float num2)
    {
        float add=num1+num2;
        return add;
    }


    public  float sub(float num1,float num2)
    {
        float sub=num1-num2;
        return sub;
    }


    public  float mul(float num1,float num2)
    {
        float mul=num1*num2;
        return mul;
    }

    public static void main(String[] args) {
        FloatingPoint fp = new FloatingPoint();
        fp.add(11.25f,58.289f);
        fp.sub(91.25f,58.289f);
        fp.div(90.25f,45.289f);
        fp.mul(25*035f,12.12f);
    }



    public  float div(float num1,float num2)
    {
        float div=num1/num2;
        return div;
    }



}
