package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student1 {
	@Id
private int stdid;
private String stdname;
private String bloodgrp;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public String getBloodgrp() {
	return bloodgrp;
}
public void setBloodgrp(String bloodgrp) {
	this.bloodgrp = bloodgrp;
}

}
