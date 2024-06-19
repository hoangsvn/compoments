package com.github.hoangsvn.compoments.entitys.storage;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StorageFile implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userid;

	private String location;

	private String originalname;

	private String type;

	private String format;


	private String description;

	private Long size;
	private Date create_at;
	private boolean share=false;

	@Lob
	@Column( columnDefinition = "longblob")
	private byte[] data;







}
