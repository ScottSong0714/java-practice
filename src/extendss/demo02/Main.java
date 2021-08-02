package extendss.demo02;

public class Main {

    public static void main(String[] args) {

        Son son = new Son();

        //直接调用：若子类和父类均存在同一个名称的变量，则优先调用子类的变量
        System.out.println(son.str);
        //间接调用：调用儿子方法，调用父亲方法
        son.sunMethod();
        son.dadMethod();

    }

}
