public class Demo05 {

    public static void main(String[] args) {
        //操作比较的数的时候，注意溢出问题
        //JDK7新特性：数字之间可以用下划线分割
        int money = 1_000_000_000;

        System.out.println(money);

        System.out.println("==================================");

        int years = 20;
        int total = money*years;    //-1474836480  计算的时候溢出了
        long total2 = money*years;  //-1474836480  默认是int，转换之前已经溢出了
        long total3 = money*((long)years);//20000000000  先把一个数据替换为long，就能解决精度问题

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);


    }

}
