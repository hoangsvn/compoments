package com.github.hoangsvn.compoments.entitys.product;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sanpham")
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;

	private Long user_id;
	private Long price;
	private String name;
	private Date create_at;
	private String desiption;
	
	@Column(columnDefinition = "BOOLEAN DEFAULT true")
	private boolean state;
	@OneToMany( targetEntity = HinhAnh.class ,cascade = CascadeType.ALL ,mappedBy = "sanpham_id")
	private List<HinhAnh> listhinhanh ;
	
	@ManyToMany(targetEntity = DanhMuc.class , cascade =CascadeType.DETACH )
	@JoinTable(name = "sanpham_danhmuc")
	private List<DanhMuc> listdanhmuc ;


}


