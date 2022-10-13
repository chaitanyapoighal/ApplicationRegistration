package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CitizenApplication")
public class CitizenApp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String emailId;

	private String fullName;

	private Long phoneNumber;

	private LocalDate dob;

	private String gender;

	private Long ssn;

	private String state;

	private String status;

	private LocalDate createdOn;

	private LocalDate upadatedOn;

	private String createdBy;

	private String upadatedBy;
}
