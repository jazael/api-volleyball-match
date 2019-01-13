package com.volleyball.ec.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.volleyball.ec.entity.Team;
import com.volleyball.ec.repository.TeamRepository;

@Service("serviceTeam")
public class TeamService {
	
	@Autowired
	@Qualifier("team")
	private TeamRepository teamRepository;
	
	private static final Log logger = LogFactory.getLog(TeamService.class);
	
	public boolean create(Team team) {
		try {
			teamRepository.save(team);
			logger.info("create Team");
			return true;
		} catch (Exception e) {
			logger.info("Failed" + e.getMessage());
			return false;
		}
	}
	
	public List<Team> getAll() {
		return teamRepository.findAll();
	}
	
}
