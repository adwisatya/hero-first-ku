/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientsoa;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		//System.out.println(addUser("Aryya Dwisatya W2","adwisatya2","adwisatya2","a.dwisaty4@yahoo.com2","2"));
		System.out.println(addPost("jduul","konten","owner","2321",21));
	}

	private static boolean addPost(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4) {
		org.chamerling.heroku.service.HelloServiceImplService service = new org.chamerling.heroku.service.HelloServiceImplService();
		org.chamerling.heroku.service.HelloService port = service.getHelloServiceImplPort();
		return port.addPost(arg0, arg1, arg2, arg3, arg4);
	}


	
}
