package club.zhanshen.gulimall.product.dao;

import club.zhanshen.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhanyao
 * @email 3119954407@qq.com
 * @date 2022-12-01 19:34:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
