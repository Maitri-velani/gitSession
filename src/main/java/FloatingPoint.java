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

    public static void main(String[] args) {
        FloatingPoint fp = new FloatingPoint();
        fp.add(11.25f,58.289f);
    }
}
