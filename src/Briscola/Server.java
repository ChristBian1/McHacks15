/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Briscola;

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

/**
 *
 * @author admin2
 */
public class Server {
    private Socket socket;
    private ServerSocket serversocket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
   
    private String host = "127.0.0.1";
    private int port = 7685;
    
    private ArrayList<Socket> listOfIPs;
    
    public Server() {
        this.listOfIPs = new ArrayList<Socket>();
    }
    
    
    public void connect(){
        try {
            serversocket = new ServerSocket(port);
                      
            setOos(new ObjectOutputStream(getSocket().getOutputStream()));
            setOis(new ObjectInputStream(getSocket().getInputStream()));
            
            new Thread(new GetClientIP()).start();
            new Thread(new GetClientIP()).start();
            
            while(!twoPlayersConnected()){
                Thread.sleep(1000);//Wait for two players to connect
            }
            //both players connected to server
            System.out.println("both clients connected");
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Network.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    
    private class GetClientIP implements Runnable {

        @Override
        public void run() {
            try {
                socket  = serversocket.accept();
                listOfIPs.add(socket);
                System.out.println(socket.getInetAddress().getCanonicalHostName());
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
     private boolean twoPlayersConnected(){
            boolean result =true;
            for (Socket i: listOfIPs){
                if (i.equals(null))
                    result= false;                  
            }
            return result;
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
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
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
