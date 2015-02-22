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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin2
 */
public class Network {
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
   
    private String host = "ec2-52-10-202-71.us-west-2.compute.amazonaws.com";
    private int port = 7685;
    
    
    public void connect(){
        try {
            setSocket(new Socket(getHost(), getPort()));
            setOos(new ObjectOutputStream(getSocket().getOutputStream()));
            setOis(new ObjectInputStream(getSocket().getInputStream()));
            
            oos.writeUTF(new String(InetAddress.getLocalHost().toString()));//1
        } catch (IOException ex) {
            Logger.getLogger(Network.class.getName()).log(Level.SEVERE, null, ex);
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
}
