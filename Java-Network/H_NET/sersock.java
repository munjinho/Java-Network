package H_NET;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class sersock {
	static int Port=2222; // 접속 포트 
	String message ="접 속!";

	
	
	public void error(){// 접속 실패, 송수신 접속 불량
		System.out.println("클라이언트 접속 분량!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(Port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
