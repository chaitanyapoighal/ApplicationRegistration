package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.CitizenApp;

public interface CitizenAppRepo extends JpaRepository<CitizenApp,Integer> {

}
