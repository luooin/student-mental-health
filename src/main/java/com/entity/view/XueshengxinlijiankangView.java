package com.entity.view;

import com.entity.XueshengxinlijiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生心理健康
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
@TableName("xueshengxinlijiankang")
public class XueshengxinlijiankangView  extends XueshengxinlijiankangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxinlijiankangView(){
	}
 
 	public XueshengxinlijiankangView(XueshengxinlijiankangEntity xueshengxinlijiankangEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxinlijiankangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
