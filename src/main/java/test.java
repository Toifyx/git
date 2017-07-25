import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by fuyux on 2017/7/4.
 */
public class test {
    public static void main(String[] args){
        System.out.println("!");
        File file =new File("C:\\Users\\Public\\Desktop\\Google Chrome.lnk");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    @Test
    public void t(){

        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.remove(5);
        for(String str:list){
            System.out.println(str);
        }

    }

    public void main(){
        int a=0;
    }
}
