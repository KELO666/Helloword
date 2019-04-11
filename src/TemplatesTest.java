import java.awt.*;
import java.util.ArrayList;

/**
 * @author WKELO
 * @date 2019/4/11 - 20:11
 */
public class TemplatesTest {
    //模板六：prsf: private static final
    private static final int K = 0 ;

    //拓展：
    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String NATION = null;


    //模板一：psvm
    public static void main(String[] args) {

        //模板二：
        System.out.println("Hello!");

        //拓展：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");//参数
        System.out.println("TemplatesTest.main");//方法名
        System.out.println("args = " + args);//变量
        int num = 1;
        System.out.println(num);

        //模板三：fori
        String[] arr = {"tom","jack"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展:iter  增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        
        //拓展：itar  普通赋值for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("234");
        list.add("345");
        for (Object o : list) {
            System.out.println(o);
        }
        
        //拓展：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        
        //拓展: list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("234");
        list.add("345");

        //模板五：ifn
        if (list == null) {

        }

        //拓展：inn
        if (list != null) {

        }

        //拓展：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }



    }

}
