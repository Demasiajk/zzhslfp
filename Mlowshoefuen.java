package com.world.chaip.mapper;

import com.world.chaip.entity.FlowSpeed;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FlowShowMapper {

	List<FlowSpeed> getFlowSpeed01(@Param("beginTime") Date beginTime,
	                         @Param("endTime") Date endTime,
	                         @Param("ly") List<String> ly,
	                         @Param("adcd") List<String> adcd,
	                         @Param("systemTypes") List<String> systemTypes,
	                         @Param("stcdOrStnm") List<String> stcdOrStnm);