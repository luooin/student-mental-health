package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianyadabenyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianyadabenyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianyadabenyingView;


/**
 * 减压大本营
 *
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public interface JianyadabenyingService extends IService<JianyadabenyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianyadabenyingVO> selectListVO(Wrapper<JianyadabenyingEntity> wrapper);
   	
   	JianyadabenyingVO selectVO(@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);
   	
   	List<JianyadabenyingView> selectListView(Wrapper<JianyadabenyingEntity> wrapper);
   	
   	JianyadabenyingView selectView(@Param("ew") Wrapper<JianyadabenyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianyadabenyingEntity> wrapper);
   	

}

