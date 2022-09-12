package nju.edu.gulimall.order.dao;

import nju.edu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-12 09:59:18
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
