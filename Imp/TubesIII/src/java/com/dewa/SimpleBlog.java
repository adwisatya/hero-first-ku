/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dewa;

import com.firebase.client.Firebase;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author adwisatya
 */
@WebService(serviceName = "SimpleBlog")
public class SimpleBlog {

	/**
	 * This is a sample web service operation
	 */
	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") String txt) {
		return "Hello " + txt + " !";
	}

	/**
	 * Web service operation
	 */
	@WebMethod(operationName = "sayHi")
	public String sayHi() {
		//TODO write your implementation code here:
		return "say Hi";
	}

	/**
	 * Web service operation
	 */
	@WebMethod(operationName = "addPost")
	public String addPost(@WebParam(name = "postId") int postId, @WebParam(name = "judul") String judul, @WebParam(name = "konten") String konten, @WebParam(name = "owner") String owner, @WebParam(name = "status") int status) {
		//TODO write your implementation code here:
		//Firebase fb = new Firebase("https://popping-fire-1228.firebaseio.com");
		//fb.setValue("Alex");
		return null;
	}
}
