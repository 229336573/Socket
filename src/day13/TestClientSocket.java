package day13;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * �����ͻ��ˣ�
 * 			�����˷���һ���ı����ݡ�
 * 1.����Socket����
 * 2.ָ��Ҫ���ӵ������Ͷ˿�
 * @author admin
 *
 */
public class TestClientSocket {
	public static void main(String[] args) throws IOException, IOException {
		//1�������ͻ��˵�socket����ָ��Ŀ�������Ͷ˿ڡ�
		Socket s = new Socket("127.0.0.1",10086);
		//2.��ȡSocket���е�������������ݡ�
		OutputStream out = s.getOutputStream();
		out.write("hello,world��".getBytes());
		s.close();
	}
}
