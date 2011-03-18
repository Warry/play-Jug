package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Member extends Model {

	public String fullName;

	public String activity;

	public String company;

	public String url;

	public String photoUrl;

}
