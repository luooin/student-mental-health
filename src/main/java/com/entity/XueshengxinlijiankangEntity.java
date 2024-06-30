package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学生心理健康
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
@TableName("xueshengxinlijiankang")
public class XueshengxinlijiankangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengxinlijiankangEntity() {
		
	}
	
	public XueshengxinlijiankangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
