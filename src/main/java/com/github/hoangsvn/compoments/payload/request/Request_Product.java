package com.github.hoangsvn.compoments.payload.request;

import com.github.hoangsvn.compoments.entitys.DanhMuc;
import com.github.hoangsvn.compoments.entitys.HinhAnh;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Request_Product implements Serializable {
	
	private Long id;

	private Long listimgsize;

	private Long danhmucid;

	private Long user_id;

	private Long price;

	private String name;

	private String desiption;

	private List<HinhAnh> listhinhanh  ;

	private List<DanhMuc> listdanhmuc  ;

}
