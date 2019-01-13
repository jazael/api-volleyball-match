package com.volleyball.ec.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.volleyball.ec.entity.MatchDetail;
import com.volleyball.ec.repository.MatchDetailRepository;

@Service("serviceMatchDetail")
public class MatchDetailService {

	@Autowired
	@Qualifier("matchdetail")
	private MatchDetailRepository matchDetailRepository;

	private static final Log logger = LogFactory.getLog(MatchDetailService.class);

	public boolean create(MatchDetail matchDetail) {
		try {
			matchDetailRepository.save(matchDetail);
			logger.info("Add Match Detail");
			return true;
		} catch (Exception e) {
			logger.info("Failed" + e.getMessage());
			return false;
		}
	}

	public List<MatchDetail> getAll() {
		return matchDetailRepository.findAll();
	}

}
