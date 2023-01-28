package com.ccb.test;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WebServer {
	public String getResult(String name) {
		return "欢迎你" + name;
	}

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:7001/innservice", new WebServer());
		System.out.println("端口发布成功");
	}
}
