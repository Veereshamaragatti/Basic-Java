class Calculator{
    public int add(int num1,int num2){
        int result =  num1 + num2;
        return result;
    }
}
class SimpleDemo{
    public static void main(String args[])
    {
        Calculator Calc = new Calculator();
        int result = Calc.add(10,20);
        System.out.println(result);
    }
}