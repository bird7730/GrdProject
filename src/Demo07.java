public class Demo07 {

    //属性：变量

    //实例变量：从属于对象（在类中，在方法外）如果不自行初始化，这个变量会表示默认值 0  0.0
    //布尔值：默认是false
    //除了基本类型，其余的默认值都是null
    String name;
    int age;

    //类变量：static
    static double salary = 2500;

    //main方法
    public static void main(String[] args) {

        //局部变量：在方法中的变量，必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //实例变量（对象）：
        //变量类型 变量名字 = new Demo07();
        Demo07 demo07 = new Demo07();
        System.out.println(demo07.age);
        System.out.println(demo07.name);

        //类变量：static
        System.out.println(salary); //带static为类变量，可以直接用，不需要new

    }

    //其他方法
    public void add(){



    }



}
