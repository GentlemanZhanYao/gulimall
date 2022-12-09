package club.zhanshen.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import club.zhanshen.common.utils.PageUtils;
import club.zhanshen.common.utils.Query;

import club.zhanshen.gulimall.product.dao.CategoryDao;
import club.zhanshen.gulimall.product.entity.CategoryEntity;
import club.zhanshen.gulimall.product.service.CategoryService;


/**
 * @author zhanyao
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> collect = entities.stream()
                .filter((CategoryEntity) -> CategoryEntity.getParentCid() == 0)
                .map((menu)->{
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                }).sorted((menu1,menu2)->{
                    return (menu1.getSort()==null?0: menu1.getSort())- (menu2.getSort()==null?0: menu2.getSort());
                }).collect(Collectors.toList());
        return collect;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }

    /**
     *
     * @param root
     * @param all
     * @return
     * 获取该菜单的子菜单
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream()
                .filter((categoryEntity) -> categoryEntity.getParentCid().equals(root.getCatId()))
                .map((menu)->{
                    menu.setChildren(getChildrens(menu,all));
                    return menu;
                }).sorted((menu1,menu2)->{
                    return (menu1.getSort()==null?0: menu1.getSort())- (menu2.getSort()==null?0: menu2.getSort());
                }).collect(Collectors.toList());

        return collect;
    }

}