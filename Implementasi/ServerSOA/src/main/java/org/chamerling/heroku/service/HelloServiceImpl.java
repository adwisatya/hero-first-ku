/**
 * 
 */
package org.chamerling.heroku.service;

import com.firebase.client.Firebase;
import com.tubes2.Komentar.*;
import com.tubes2.Post.*;
import com.tubes2.User.*;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
/**
 * @author chamerling
 * 
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public boolean addUser(String nama, String username, String password, String email, String status){
		return com.tubes2.User.userPaket.addUser(nama, username, password, email, status);
	}
	public boolean delUser(String Username){
		return com.tubes2.User.userPaket.delUser(Username);
	}
	public boolean addPost(String judul, String konten, String Owner, int Status){
		boolean statusOp = false;
		Paket newPost = new Paket();
		Firebase ref = new Firebase("https://popping-fire-1228.firebaseio.com/");
		/* masukkan input ke atribut user baru */
		newPost.setJudul(judul);
		newPost.setKonten(konten);
		newPost.setOwner(Owner);
		newPost.setStatus(Status);
		
		Firebase postRef = ref.child("posts");
		//Firebase newPostRef = postRef.push();

		postRef.setValue(newPost);

		/* input ke firebase */
		//Map<String, Paket> post1 = new HashMap<String, Paket>();
		//user1.put("nama", newUser);
		//newPostRef.setValue(newPost);
		return statusOp;
	}
	public boolean updateUser(String Nama, String Username,String Password, String Email, String Status){
		return com.tubes2.User.userPaket.updateUser(Username, Nama, Password, Email, Status);
	}
	
	public ArrayList<String> readUser(String Username){
		return com.tubes2.User.userPaket.readUser(Username);
	}
}
