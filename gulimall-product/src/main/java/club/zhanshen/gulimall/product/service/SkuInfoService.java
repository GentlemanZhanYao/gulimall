package club.zhanshen.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import club.zhanshen.common.utils.PageUtils;
import club.zhanshen.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zhanyao
 * @email 3119954407@qq.com
 * @date 2022-11-28 20:56:30
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

