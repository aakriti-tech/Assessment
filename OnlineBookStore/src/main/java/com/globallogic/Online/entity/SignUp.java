package com.globallogic.Online.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "sign")
public class SignUp {
	
	
		@Column
		String email;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		long id;
		@Column
		String pass;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public SignUp() {
			super();
			// TODO Auto-generated constructor stub
		}

		public SignUp(String email, long id, String pass) {
			super();
			this.email = email;
			this.id = id;
			this.pass = pass;
		}

		@Override
		public String toString() {
			return "Signup [email=" + email + ", id=" + id + ", pass=" + pass + "]";
		}


}
