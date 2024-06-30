package com.entity.vo;

import com.entity.XueshengxinlijiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生心理健康
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
public class XueshengxinlijiankangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 健康状态
	 */
	
	private String jiankangzhuangtai;
		
	/**
	 * 心里疾病
	 */
	
	private String xinlijibing;
		
	/**
	 * 健康评价
	 */
	
	private String jiankangpingjia;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：健康状态
	 */
	 
	public void setJiankangzhuangtai(String jiankangzhuangtai) {
		this.jiankangzhuangtai = jiankangzhuangtai;
	}
	
	/**
	 * 获取：健康状态
	 */
	public String getJiankangzhuangtai() {
		return jiankangzhuangtai;
	}
				
	
	/**
	 * 设置：心里疾病
	 */
	 
	public void setXinlijibing(String xinlijibing) {
		this.xinlijibing = xinlijibing;
	}
	
	/**
	 * 获取：心里疾病
	 */
	public String getXinlijibing() {
		return xinlijibing;
	}
				
	
	/**
	 * 设置：健康评价
	 */
	 
	public void setJiankangpingjia(String jiankangpingjia) {
		this.jiankangpingjia = jiankangpingjia;
	}
	
	/**
	 * 获取：健康评价
	 */
	public String getJiankangpingjia() {
		return jiankangpingjia;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
