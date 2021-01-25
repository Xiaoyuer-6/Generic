package Generic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  泛型是一个在java当中 比较难的语法
 *  了解泛型就OK了 把我上课代码保存着
 *  以后你可以当中字典进行查询
 * User: GaoBo
 * Date: 2021-01-21
 * Time: 9:29
 */

/**
 * 泛型：只存在于编译时期  只是编译时期
 *    意义：
 *    1、自动进行类型的检查
 *    2、自动进行类型转换
 *
 *  泛型 在 编译的时候  并不会进行指定类型的替换 而是拿着指定的类型进行检查
 *     也就是说 在编译的时候 ，拿着你指定的类型 进行 类型检查 ，记住我 并没有说是替换
 *
 *  编译的时候 会进行类型擦除，编译的时候 编译都会把泛型擦除为Object，不是替换为Object
 *
 *  题目：写一个通用的顺序表？
 *     Object是所有类的父类，哪怕这个类没有继承Object
 *
 * 1、class MyArrayList<T> {  <T>：代表占位符  表示当前这个类是一个泛型类
 * 2、简单类型不能做泛型类型的参数
 *       MyArrayList<int> myArrayList1 = new MyArrayList<>();
 * 3.不能new 泛型类型的数组  this.elem = new T[10];
 * 4. 泛型类型的参数 不参与类型的组成-》 泛型就是在编译时期的一种机制
 */
class MyArrayList <T> {
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        //this.elem = new T[10];
        this.elem = (T[])new Object[10];
    }

    public void add(T data) {
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    public T get(int pos) {
        return this.elem[pos];
    }

}
class Person {

}

/**
 * 装包/装箱：把简单类型 包装成 对应的包装类
 *    自动装包：
 *    显示装包：
 * 拆包/拆箱：
 *    自动拆箱：
 *    显示拆箱：
 */
public class TestDemo {

    public static void main(String[] args) {
        int a = 10;
        Integer integer1 = new Integer(a);//显示的装包
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf(a);//显示装包
        System.out.println(integer2);
        Integer integer3 = a;//自动装包
    }



    public static void main4(String[] args) {
        Person person = new Person();
        System.out.println(person);
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        System.out.println(myArrayList1);
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        MyArrayList<Double>  myArrayList3 = new MyArrayList<>();
        System.out.println(myArrayList2);
        System.out.println(myArrayList3);
    }

    public static void main3(String[] args) {
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        MyArrayList<Double>  myArrayList3 = new MyArrayList<>();
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        myArrayList1.add("fsfsa");
        myArrayList1.add("gaobo");
        myArrayList1.add("bit");
        String str = myArrayList1.get(2);
        System.out.println(str);
    }

    public static void main2(String[] args) {
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        myArrayList1.add("fsfsa");
        myArrayList1.add("gaobo");
        myArrayList1.add("bit");

        String str = myArrayList1.get(2);
        System.out.println(str);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();

        myArrayList2.add(1);
        myArrayList2.add(2);

        int val = myArrayList2.get(1);
        System.out.println(val);


        MyArrayList<Double> myArrayList3 = new MyArrayList<>();


        /*MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(19.8);
        myArrayList.add("fsfsa");

        String str = (String) myArrayList.get(2);
        System.out.println(str);*/
    }
}
