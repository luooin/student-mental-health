package com.entity.view;

import com.entity.DiscussjianyadabenyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 减压大本营评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
@TableName("discussjianyadabenying")
public class DiscussjianyadabenyingView  extends DiscussjianyadabenyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianyadabenyingView(){
	}
 
 	public DiscussjianyadabenyingView(DiscussjianyadabenyingEntity discussjianyadabenyingEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianyadabenyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
