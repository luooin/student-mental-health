package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianyadabenyingEntity;
import com.entity.view.JianyadabenyingView;

import com.service.JianyadabenyingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 减压大本营
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 19:10:05
 */
@RestController
@RequestMapping("/jianyadabenying")
public class JianyadabenyingController {
    @Autowired
    private JianyadabenyingService jianyadabenyingService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,
                  JianyadabenyingEntity jianyadabenying,
		HttpServletRequest request){
        EntityWrapper<JianyadabenyingEntity> ew = new EntityWrapper<JianyadabenyingEntity>();
		PageUtils page = jianyadabenyingService.queryPage(params,
                MPUtil.sort(MPUtil.between(MPUtil.likeOrEq
                        (ew, jianyadabenying), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,
                  JianyadabenyingEntity jianyadabenying,
		HttpServletRequest request){
        EntityWrapper<JianyadabenyingEntity> ew = new EntityWrapper<JianyadabenyingEntity>();
		PageUtils page = jianyadabenyingService.queryPage(params,
                MPUtil.sort(MPUtil.between(MPUtil.likeOrEq
                        (ew, jianyadabenying), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianyadabenyingEntity jianyadabenying){
       	EntityWrapper<JianyadabenyingEntity> ew = new EntityWrapper<JianyadabenyingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianyadabenying, "jianyadabenying")); 
        return R.ok().put("data", jianyadabenyingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianyadabenyingEntity jianyadabenying){
        EntityWrapper< JianyadabenyingEntity> ew = new EntityWrapper< JianyadabenyingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianyadabenying, "jianyadabenying")); 
		JianyadabenyingView jianyadabenyingView =  jianyadabenyingService.selectView(ew);
		return R.ok("查询减压大本营成功").put("data", jianyadabenyingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianyadabenyingEntity jianyadabenying = jianyadabenyingService.selectById(id);
		jianyadabenying.setClicknum(jianyadabenying.getClicknum()+1);
		jianyadabenying.setClicktime(new Date());
		jianyadabenyingService.updateById(jianyadabenying);
        return R.ok().put("data", jianyadabenying);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianyadabenyingEntity jianyadabenying = jianyadabenyingService.selectById(id);
		jianyadabenying.setClicknum(jianyadabenying.getClicknum()+1);
		jianyadabenying.setClicktime(new Date());
		jianyadabenyingService.updateById(jianyadabenying);
        return R.ok().put("data", jianyadabenying);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JianyadabenyingEntity jianyadabenying = jianyadabenyingService.selectById(id);
        if(type.equals("1")) {
        	jianyadabenying.setThumbsupnum(jianyadabenying.getThumbsupnum()+1);
        } else {
        	jianyadabenying.setCrazilynum(jianyadabenying.getCrazilynum()+1);
        }
        jianyadabenyingService.updateById(jianyadabenying);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    /**
     * 保存 Jianyadabenying 实体信息
     *
     * @param jianyadabenyingEntity 包含Jianyadabenying信息的实体对象，通过RequestBody接收前端传来的JSON数据
     * @param request HttpServletRequest对象，用于接收请求信息，本方法未使用该参数
     * @return 返回操作结果，如果操作成功，返回一个包含成功标记的R对象
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianyadabenyingEntity jianyadabenying, HttpServletRequest request){
        // 为JianyadabenyingEntity生成一个唯一的ID
        jianyadabenying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
        // 下面的注释代码表示该行原意为对jianyadabenying实体进行验证，但当前已被注释
        // ValidatorUtils.validateEntity(jianyadabenying);
        // 将Jianyadabenying实体插入到数据库
        jianyadabenyingService.insert(jianyadabenying);
        // 返回操作成功的标记
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianyadabenyingEntity jianyadabenying, HttpServletRequest request){
    	jianyadabenying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianyadabenying);
        jianyadabenyingService.insert(jianyadabenying);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JianyadabenyingEntity jianyadabenying, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianyadabenying);
        jianyadabenyingService.updateById(jianyadabenying);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianyadabenyingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
    @RequestMapping("/remind/{columnName}/{type}")
    public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
        map.put("column", columnName);
        map.put("type", type);
        if (type.equals("2")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            Date remindStartDate = null;
            Date remindEndDate = null;
            if (map.get("remindstart") != null) {
                Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindStart);
                remindStartDate = c.getTime();
                map.put("remindstart", sdf.format(remindStartDate));
            }
            if (map.get("remindend") != null) {
                Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindEnd);
                remindEndDate = c.getTime();
                map.put("remindend", sdf.format(remindEndDate));
            }
        }
        Wrapper<JianyadabenyingEntity> wrapper = new EntityWrapper<JianyadabenyingEntity>();
        if (map.get("remindstart") != null) {
            wrapper.ge(columnName, map.get("remindstart"));
        }
        if (map.get("remindend") != null) {
            wrapper.le(columnName, map.get("remindend"));
        }
        int count = jianyadabenyingService.selectCount(wrapper);
        return R.ok().put("count", count);
    }
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JianyadabenyingEntity jianyadabenying, HttpServletRequest request,String pre){
        EntityWrapper<JianyadabenyingEntity> ew = new EntityWrapper<JianyadabenyingEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jianyadabenyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianyadabenying), params), params));
        return R.ok().put("data", page);
    }







}
