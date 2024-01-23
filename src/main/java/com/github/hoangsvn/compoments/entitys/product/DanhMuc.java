package com.github.hoangsvn.compoments.entitys.product;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "danhmuc")
public class DanhMuc implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

}
