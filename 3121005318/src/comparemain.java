import java.io.*;


public class comparemain {
    public static void main(String[] args) throws IOException {
        float a = repeatrate.rate("D:\\javatest\\test\\orig.txt","D:\\javatest\\test\\orig_0.8_del.txt");
        //float a = repeatrate.rate("D:\\javatest\\test\\orig.txt","D:\\javatest\\test\\orig_0.8_add.txt");
        //float a = repeatrate.rate("D:\\javatest\\test\\orig.txt","D:\\javatest\\test\\orig_0.8_dis_1.txt");
        //float a = repeatrate.rate("D:\\javatest\\test\\orig.txt","D:\\javatest\\test\\orig_0.8_dis_10.txt");
        //float a = repeatrate.rate("D:\\javatest\\test\\orig.txt","D:\\javatest\\test\\orig_0.8_dis_15.txt");
        String atext = "D:\\javatest\\test\\123.txt";
        System.out.println("杈撳嚭缁撴灉鏂囦欢锛�" + atext);
        System.out.println("閲嶅鐜囷細"+ a);
        File f = new File(atext);
        try {
            if(!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f);
            fw.write("");
            fw.flush();
            fw.write(String.valueOf(a));
            fw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}


