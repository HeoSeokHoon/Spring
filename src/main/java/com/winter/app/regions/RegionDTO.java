package com.winter.app.regions;

import java.util.List;

public class RegionDTO {
	// DTO 만들때 규칙
	//1. 모든 멤버변수의 접근지정자는 private
	//2. 모든 멤버변수의 게터세터 생성
	//3. 생성자는 여러개 가능! 단, 기본생성자는 필수
	//4. 멤버변수의 이름과 DATATYPE은 DB의 Table의 컬럼명과 DATATYPE 일치
	private Long region_id;
	private String region_name;
	private List<RegionFileDTO> regionFileDTOs;
	
	
	public List<RegionFileDTO> getRegionFileDTOs() {
		return regionFileDTOs;
	}
	public void setRegionFileDTOs(List<RegionFileDTO> regionFileDTOs) {
		this.regionFileDTOs = regionFileDTOs;
	}
	public Long getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Long region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	
}
