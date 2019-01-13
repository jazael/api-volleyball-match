package com.volleyball.ec.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "team")
@Getter
@Setter
public class Team {

	@GeneratedValue
	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="fechacreacion")
	@CreationTimestamp
	private Timestamp fechacreacion;

}
