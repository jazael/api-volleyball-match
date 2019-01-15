package com.volleyball.ec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volleyball.ec.entity.Team;
import com.volleyball.ec.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	@Qualifier("serviceTeam")
	TeamService teamService;
	
	@PostMapping("/add")
	public boolean add(@RequestBody @Valid Team team) {
		
		return teamService.create(team);
	}
	
	@GetMapping("/all")
	public List<Team> getFlightRequestsForm() {
		return teamService.getAll();
	}

}
