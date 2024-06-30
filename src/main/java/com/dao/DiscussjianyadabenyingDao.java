package com.dao;

import com.entity.DiscussjianyadabenyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianyadabenyingVO;
import com.entity.view.DiscussjianyadabenyingView;


/**
 * 减压大本营评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface DiscussjianyadabenyingDao extends BaseMapper<DiscussjianyadabenyingEntity> {
	
	List<DiscussjianyadabenyingVO> selectListVO(@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);
	
	DiscussjianyadabenyingVO selectVO(@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);
	
	List<DiscussjianyadabenyingView> selectListView(@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);

	List<DiscussjianyadabenyingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);
	
	DiscussjianyadabenyingView selectView(@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);
	

}
