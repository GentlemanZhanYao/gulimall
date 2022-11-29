package club.zhanshen.gulimall.order.dao;

import club.zhanshen.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhanyao
 * @email 3119954407@qq.com
 * @date 2022-11-29 11:02:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
