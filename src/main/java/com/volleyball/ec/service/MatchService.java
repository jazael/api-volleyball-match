package com.volleyball.ec.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.volleyball.ec.entity.Match;
import com.volleyball.ec.repository.MatchRepository;

@Service("serviceMatch")
public class MatchService {

	@Autowired
	@Qualifier("match")
	private MatchRepository matchRepository;

	private static final Log logger = LogFactory.getLog(MatchService.class);

	public boolean create(Match match) {
		try {
			matchRepository.save(match);
			logger.info("Init Match");
			return true;
		} catch (Exception e) {
			logger.info("Failed" + e.getMessage());
			return false;
		}
	}

	public List<Match> getAll() {
		return matchRepository.findAll();
	}

}
