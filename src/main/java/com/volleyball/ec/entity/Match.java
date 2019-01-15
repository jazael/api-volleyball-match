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
@Table(name = "match")
@Getter
@Setter
public class Match {

	@GeneratedValue
	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "versus")
	private String versus;

	@Column(name = "status")
	private String status;

	@Column(name = "fechacreacion")
	@CreationTimestamp
	private Timestamp fechacreacion;

}
