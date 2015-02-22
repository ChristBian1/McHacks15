/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Briscola.Board;
import Briscola.Deck;
import Briscola.Player;

/**
 *
 * @author admin2
 */
public class Server {
	private Socket socket;
	private static ServerSocket serversocket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;

	//private String host = "127.0.0.1";
	private static int port = 7685;

	//private ArrayList<Socket> listOfIPs;



	public static void main (String[] args){
		try {
			serversocket = new ServerSocket(port);
			
			System.out.println("Listening on port " + port);

			Server server = new Server();
			server.connect();
			System.out.println("player 1 connected");
			Server server2 = new Server();
			server2.connect();
			System.out.println("player 2 connected");

			Player one= new Player();
			Player two= new Player();
			Deck deck=new Deck();
			deck.shuffle();

			Board game= new Board(deck);

			one.setHand(deck);
			two.setHand(deck);
			one.setFirst(true);


			System.out.println(one.getHand());
			System.out.println(two.getHand());

			try {
				server.oos.writeObject(one); //write the first player to first client
				server.oos.writeObject(two); //write the second player to first client

				server.oos.flush();

				server2.oos.writeObject(two); //write the second player to first client
				server2.oos.writeObject(one); //write the first player to first client

				server2.oos.flush();

				server.oos.writeObject(deck);
				server2.oos.writeObject(deck); //write the deck

				server2.oos.flush();

				server.oos.writeObject(game);
				server2.oos.writeObject(game); //write the deck

				server2.oos.flush();

				while(deck.size() <= 0){
					game.playRound(one.playCard(0), two.playCard(0));///GUI TO CHOOSE CARD HERE
					if (one.isFirst())
					{
						one.addToHand(deck);
						two.addToHand(deck);
					}
					else
					{
						two.addToHand(deck);
						one.addToHand(deck);
					}
					server.oos.writeObject(one); //write the first player to one of the clients
					server2.oos.writeObject(two); //write the second player to one of the clients

				}




			}

			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		//player who connected first will be first to act



	}


	public void connect(){
		try {


			socket  = serversocket.accept();

			System.out.println(socket.getInetAddress().getCanonicalHostName());


			setOos(new ObjectOutputStream(getSocket().getOutputStream()));
			setOis(new ObjectInputStream(getSocket().getInputStream()));


			System.out.println("client connected");



		} catch (IOException ex) {
			ex.printStackTrace();
		} 

	}




	/**
	 * @return the socket
	 */
	public Socket getSocket() {
		return socket;
	}

	/**
	 * @param socket the socket to set
	 */
	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	/**
	 * @return the oos
	 */
	public ObjectOutputStream getOos() {
		return oos;
	}

	/**
	 * @param oos the oos to set
	 */
	public void setOos(ObjectOutputStream oos) {
		this.oos = oos;
	}

	/**
	 * @return the ois
	 */
	public ObjectInputStream getOis() {
		return ois;
	}

	/**
	 * @param ois the ois to set
	 */
	public void setOis(ObjectInputStream ois) {
		this.ois = ois;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the serversocket
	 */
	public ServerSocket getServersocket() {
		return serversocket;
	}

	/**
	 * @param serversocket the serversocket to set
	 */
	public void setServersocket(ServerSocket serversocket) {
		this.serversocket = serversocket;
	}
}
