import com.sun.org.apache.bcel.internal.generic.LLOAD;

public class Demo02 {
    public static void main(String[] args){
        String a = "hello world";
        int num = 10;
        System.out.println(num);
        System.out.println(a);

        //八大基本数据

        //整数
        int num1 = 9999;//最常用
        byte num2 = 99;
        short num3 = 999;
        long num4 = 999999L;//Long类型要在数字后面加一个L，用来区分Long和其它类型的区别

        //浮点（小数）
        float num5 = 99.9F;//F用于区分float和double
        double num6 = 3.141592653589793238462643;

        //字符
        char name1 = 'L';//只能写一个字符

        //字符串 (String不是关键字，是类)
        //String name2 = “LL”;

        //布尔值：是非
        boolean flag = true;
        //boolean flag = false;

    }
}

