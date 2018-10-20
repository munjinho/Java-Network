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
			URL url = new URL("https://sites.google.com/site/mylognaegilog/");
			//url으로 부터 입력 스트림 생성! 
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			//경로
			System.out.println(url.getPath());
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
