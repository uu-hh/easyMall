package com.hh.easymall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hh.common.utils.PageUtils;
import com.hh.common.utils.Query;

import com.hh.easymall.product.dao.CategoryDao;
import com.hh.easymall.product.entity.CategoryEntity;
import com.hh.easymall.product.service.CategoryService;


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
        //1 查出所有分类
        //组织树形结构
        List<CategoryEntity> entities = baseMapper.selectList(null);

        List<CategoryEntity> level1Menus = entities.stream().filter(entitie -> {
            return entitie.getParentCid() == 0;
        }).map((menu) -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            Integer sort1 = menu1.getSort();
            Integer sort2 = menu2.getSort();
            sort1 = sort1 == null ? 0 : sort1;
            sort2 = sort2 == null ? 0 : sort2;
            return sort1 - sort2;
        }).collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1 检查当前删除的菜单，是否被别的地方引用
        //逻辑删除
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> collect = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(menu -> {
            menu.setChildren(getChildrens(menu, all));
            return menu;
        }).sorted((menu1, menu2) -> {
            Integer sort1 = menu1.getSort();
            Integer sort2 = menu2.getSort();
            sort1 = sort1 == null ? 0 : sort1;
            sort2 = sort2 == null ? 0 : sort2;
            return sort1 - sort2;
        }).collect(Collectors.toList());
        return collect;
    }
}