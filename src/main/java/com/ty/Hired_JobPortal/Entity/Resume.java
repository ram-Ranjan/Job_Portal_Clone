package com.ty.Hired_JobPortal.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resumeId;
	@NotBlank(message = "filePath shouldn't be blank")
	@NotNull(message = "filePath shouldn't be null")
	private String filePath;
	@DateTimeFormat
	private LocalDateTime uploadDateTime;

	@OneToMany(mappedBy = "resume")
	@JsonIgnore
	private List<JobApplication> jobApplication;

}
