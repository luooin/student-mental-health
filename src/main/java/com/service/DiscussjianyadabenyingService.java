package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianyadabenyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianyadabenyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianyadabenyingView;


/**
 * 减压大本营评论表
 *
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface DiscussjianyadabenyingService extends IService<DiscussjianyadabenyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianyadabenyingVO> selectListVO(Wrapper<DiscussjianyadabenyingEntity> wrapper);
   	
   	DiscussjianyadabenyingVO selectVO(@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);
   	
   	List<DiscussjianyadabenyingView> selectListView(Wrapper<DiscussjianyadabenyingEntity> wrapper);
   	
   	DiscussjianyadabenyingView selectView(@Param("ew") Wrapper<DiscussjianyadabenyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianyadabenyingEntity> wrapper);
   	

}

