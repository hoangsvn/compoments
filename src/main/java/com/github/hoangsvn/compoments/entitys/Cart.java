package com.github.hoangsvn.compoments.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart_sanpham")
public class Cart implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long user_id;

	private Long sanphamid;

}
