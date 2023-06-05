package com.amrita.jpl.21030.practice


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234); // Create a server socket on port 1234

            System.out.println("Server started. Waiting for client...");

            Socket clientSocket = serverSocket.accept(); // Wait for a client to connect

            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message = in.readLine(); // Read message from client
            System.out.println("Received from client: " + message);

            out.println("Server received your message: " + message); // Send response to client

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
