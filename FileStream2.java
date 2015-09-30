import java.io.*;
import java.io.IOException;

public class FileStream2 {
	public static void main(String[] args) throws Exception {
		FileWriter out = new FileWriter("hello.txt");
		out.write("www.sina.com.cn"); //在此可以直接写入字符串，不用转化为字节数组
		out.close();

		char[] buf = new char[1024];  //字符数组
		FileReader in = new FileReader("hello.txt");
		int len = in.read(buf); //此时的read方法可以读取一个字符或几个字符,len代表实际读取到的字符的个数。
		System.out.println(new String(buf,0,1024)); //String构造函数把字符数组转化为字符串。
		in.close();
	}
}
