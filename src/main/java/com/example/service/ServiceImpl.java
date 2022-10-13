package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.CitizenApp;
import com.example.repo.CitizenAppRepo;

@Service
public class ServiceImpl implements ServiceRepo {
	@Autowired
	private CitizenAppRepo repo;

	public Integer saveApplication(CitizenApp capp) {
		RestTemplate restemp = new RestTemplate();
		String url = "https://ssa-web-api.herokuapp.com/ssn/{ssn}";
		String state = restemp.getForObject(url, String.class, capp.getSsn());
		System.out.println(state);
		if ("New Jersey".equals(state)) {
			capp.setState(state);
			CitizenApp newct = repo.save(capp);
			System.out.println("id=" + newct.getId());
			return newct.getId();
		} else
			return 0;
	}

}
