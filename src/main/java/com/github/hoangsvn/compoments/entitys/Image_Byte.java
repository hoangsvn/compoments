package com.github.hoangsvn.compoments.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Builder
@Table(name = "imagebyte")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Image_Byte implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String link;

	@Lob
	@Column( columnDefinition = "longblob")
	private byte[] imagebyte;

	private Long userid;

	private Date create_at;

}
