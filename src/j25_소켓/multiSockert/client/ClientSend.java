package j25_소켓.multiSockert.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientSend extends Thread {
	private final Socket socket;
	
	
	@Override
	public void run() {
		try {
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter Writer = new PrintWriter(outputStream, true);
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				Writer.println(scanner.nextLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
