/**
 * 
 */
package org.chamerling.heroku.service;

import java.util.Date;
import javax.jws.WebService;

/**
 * @author chamerling
 * 
 */
@WebService
public interface HelloService {

	boolean addUser(String nama, String username, String password, String email, String status);
	boolean addPost(String judul, String konten, String Owner, int Status);
	boolean delUser(String username);
	boolean updateUser(String Username,String Nama, String Password, String Email, String Status);

}
