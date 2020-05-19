package day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����ˣ�
 * 		1.��������˵�socket����ServSocket����������һ���˿ڡ�
 * 		2.��ȡ���ӹ����Ŀͻ��˶���
 * 		3.�ͻ��˷������ݣ�������ö�Ӧ�Ŀͻ��˶��󣬲���ȡ���ÿͻ��˶���Ķ�ȡ������ȡ������������
 * 		4.�رշ����(���Թ�Ҳ���Բ���)
 * @author admin
 *
 */
public class TestServerSocket {
	public static void main(String[] args) throws IOException {
		//1.���������Socket���񣬼���һ���˿ںţ����ֵΪ65535��
		ServerSocket server = new ServerSocket(10086);
		//2.��ȡ���ӹ����Ŀͻ�����
		Socket client = server.accept();
		System.out.println("ip"+client.getInetAddress().getHostAddress());
		//3.ʹ�ÿͻ��˶���Ķ�ȡ������ȡ�ͻ��˷��͵����ݡ�
		InputStream in = client.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		client.close();
		
	}
}
