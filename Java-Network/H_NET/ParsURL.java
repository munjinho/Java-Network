package H_NET;

import java.io.IOException;
import java.net.*;

public class ParsURL {
	public static void main(String[] args) {
		//URL 객체 초기화
		URL opinion = null;
		URL homePage = null;
		
		try {
			//URL  절대경로 
			homePage  =new URL("https://sites.google.com/site/mylognaegilog:8080");
			//URL 상대경로
			//jalyosil는 자료실 주소입니다.
			//sites.google.com/site/mylognaegilog + jalyosil
			opinion = new URL(homePage,"jalyosil");
					
			
		}catch (MalformedURLException e) {
			System.out.println("에러:"+e.getMessage());
			e.printStackTrace();
		}
		/*=========================================*/
		System.out.println("프로토콜:"+opinion.getProtocol());
		System.out.println("호스트:"+opinion.getHost());
		/*=========================================*/
		System.out.println("파일:"+opinion.getFile());
		System.out.println("경로:"+opinion.getPath());
		/*=========================================*/
		System.out.println("포트:"+opinion.getPort());
		/*=========================================*/
	}
}
