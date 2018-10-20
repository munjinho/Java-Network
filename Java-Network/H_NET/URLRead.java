package H_NET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;

public class URLRead {

	public static void main(String[] args) {
		String inputline = null;
		try {
			//URL 객체 생성! 
			//url 주소를 넣는다. 
			URL url = new URL("https://sites.google.com/site/mylognaegilog/");
			//url(주소)로 부터 바이트 단위로 읽어드린다.
			InputStreamReader isr = new InputStreamReader(url.openStream());
			//바이트 스트림을 BufferedReader를 이용해 문자로 변경해 읽어 온다.
			BufferedReader br = new BufferedReader(isr);
			//옆으로 읽어서 출력한다.
			while((inputline=br.readLine())!=null) {
				System.out.println(inputline);
			}br.close();
			
		}catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

}

