package com.volleyball.ec.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volleyball.ec.entity.Match;
import com.volleyball.ec.entity.Team;
import com.volleyball.ec.service.MatchDetailService;
import com.volleyball.ec.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	@Qualifier("serviceMatch")
	MatchService matchService;

	@Autowired
	@Qualifier("serviceMatchDetail")
	MatchDetailService matchDetailService;

	@PostMapping("/add")
	public boolean add(@RequestBody @Valid Match match) {
		return matchService.create(match);
	}
	
	

}
