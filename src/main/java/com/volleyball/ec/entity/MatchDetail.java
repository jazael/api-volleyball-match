package com.volleyball.ec.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "matchdetail")
@Getter
@Setter
public class MatchDetail {

	@GeneratedValue
	@Id
	@Column(name = "id")
	private long id;
	
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn(name="match_id")
    private Match match;
	
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn(name="team_id")
    private Team team;

	@Column(name = "set")
	private String set;
	
	@Column(name = "puntaje")
	private Integer puntaje;
	
	@Column(name = "status")
	private String status;

	@Column(name = "fechacreacion")
	@CreationTimestamp
	private Timestamp fechacreacion;
	
}
