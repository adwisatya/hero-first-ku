/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tubes2.User;
import com.firebase.client.Firebase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author adwisatya
 */
public class userPaket {
	public String nama;
	public String username;
	public String password;
	public String email;
	public String status;
	//public Date created;
	
	public String getNama(){
		return nama;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return email;
	}
	public String getStatus(){
		return status;
	}
	public String getTanggal(){
		//return new SimpleDateFormat("y-MMM-d").format(created);
		return null;
	}
	public void setNama(String input){
		this.nama = input;
	}
	public void setUsername(String input){
		this.username = input;
	}
	public void setPassword(String input){
		this.password = input;
	}
	public void setEmail(String input){
		this.email = input;
	}
	public void setStatus(String input){
		this.status = input;
	}
	public static boolean addUser(String nama, String username, String password, String email, String status){
		boolean statusOp = false;
		userPaket newUser = new userPaket();
		Firebase ref = new Firebase("https://popping-fire-1228.firebaseio.com/");
		
		/* masukkan input ke atribut user baru */
		newUser.setNama(nama);
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setEmail(email);
		newUser.setStatus(status);
		
		/* input ke firebase */
		Firebase userRef = ref.child("users").child(username);
		Firebase newUserRef = userRef.push();
		Map<String, userPaket> user1 = new HashMap<String, userPaket>();
		//user1.put(username, newUser);
		user1.put(username, newUser);
		userRef.setValue(newUser);
		return statusOp;
	}
	public static boolean delUser(String Username){
		boolean statusOp = false;
		userPaket newUser = new userPaket();
		Firebase ref = new Firebase("https://popping-fire-1228.firebaseio.com/");
		
		/* input ke firebase */
		Firebase userRef = ref.child("users");
		userRef.child(Username).removeValue();
		return statusOp;
	}
	public static boolean updateUser(String Nama, String Username,String Password, String Email, String Status){
		boolean statusOp = false;
		userPaket newUser = new userPaket();
		Firebase ref = new Firebase("https://popping-fire-1228.firebaseio.com/");
		
		/* masukkan input ke atribut user baru */
		newUser.setNama(Nama);
		newUser.setUsername(Username);
		newUser.setPassword(Password);
		newUser.setEmail(Email);
		newUser.setStatus(Status);
		
		/* input ke firebase */
		Firebase userRef = ref.child("users").child(Username);
		Firebase newUserRef = userRef.push();
		Map<String, userPaket> user1 = new HashMap<String, userPaket>();
		//user1.put(username, newUser);
		user1.put(Username, newUser);
		userRef.setValue(newUser);
		return statusOp;	
	}
}
