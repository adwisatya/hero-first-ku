/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientsoa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author adwisatya
 */
public class ClientSOA {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{		
		// TODO code application logic here
		//System.out.println(addUser("Aryya Dwisatya Widigdha","3AaBdwisaty4","adwisaty4","a.dwisasadty4@yahoo.com2","32"));
		//System.out.println(addUser("HRM","berbala","berbala","berbala@yahoo.com","3"));
		//System.out.println(updateUser("3AaBdwisaty4","KingAryya Dwisatya Widigdha","adwisaty4","a.dwisasadty4@yahoo.com2","32"));
		//System.out.println(delUser("2AaBdwisaty4"));
		System.out.println(readUser("2AaBdwisaty4").toString());
	}

	private static boolean addUser(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
		org.chamerling.heroku.service.HelloServiceImplService service = new org.chamerling.heroku.service.HelloServiceImplService();
		org.chamerling.heroku.service.HelloService port = service.getHelloServiceImplPort();
		return port.addUser(arg0, arg1, arg2, arg3, arg4);
	}

	private static boolean addPost(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
		org.chamerling.heroku.service.HelloServiceImplService service = new org.chamerling.heroku.service.HelloServiceImplService();
		org.chamerling.heroku.service.HelloService port = service.getHelloServiceImplPort();
		return port.addPost(arg0, arg1, arg2, arg3);
	}

	private static boolean delUser(java.lang.String arg0) {
		org.chamerling.heroku.service.HelloServiceImplService service = new org.chamerling.heroku.service.HelloServiceImplService();
		org.chamerling.heroku.service.HelloService port = service.getHelloServiceImplPort();
		return port.delUser(arg0);
	}

	private static boolean updateUser(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
		org.chamerling.heroku.service.HelloServiceImplService service = new org.chamerling.heroku.service.HelloServiceImplService();
		org.chamerling.heroku.service.HelloService port = service.getHelloServiceImplPort();
		return port.updateUser(arg0, arg1, arg2, arg3, arg4);
	}

	private static java.util.List<java.lang.String> readUser(java.lang.String arg0) {
		org.chamerling.heroku.service.HelloServiceImplService service = new org.chamerling.heroku.service.HelloServiceImplService();
		org.chamerling.heroku.service.HelloService port = service.getHelloServiceImplPort();
		return port.readUser(arg0);
	}


}
