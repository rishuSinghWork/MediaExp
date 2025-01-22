package com.reeshu.MediaExp.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class ServerMain {
	public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.setContextPath("/");
        handler.addServlet(StreamingServlet.class, "/stream");
        handler.addServlet(PlaylistServlet.class, "/playlist");

        server.setHandler(handler);
        server.start();
        System.out.println("Server started at http://localhost:8080");
        server.join();
    }
}
