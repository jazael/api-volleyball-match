package com.volleyball.ec.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.volleyball.ec.entity.MatchDetail;

@Repository("matchdetail")
public interface MatchDetailRepository extends JpaRepository<MatchDetail, Serializable> {

}
