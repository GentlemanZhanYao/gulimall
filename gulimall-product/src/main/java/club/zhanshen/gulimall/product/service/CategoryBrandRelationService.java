package club.zhanshen.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import club.zhanshen.common.utils.PageUtils;
import club.zhanshen.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zhanyao
 * @email 3119954407@qq.com
 * @date 2022-11-28 20:56:31
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

