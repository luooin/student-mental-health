package com.entity.view;

import com.entity.XinlijiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 心理教师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
@TableName("xinlijiaoshi")
public class XinlijiaoshiView  extends XinlijiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinlijiaoshiView(){
	}
 
 	public XinlijiaoshiView(XinlijiaoshiEntity xinlijiaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, xinlijiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
