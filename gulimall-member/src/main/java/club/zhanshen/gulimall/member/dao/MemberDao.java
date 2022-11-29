package club.zhanshen.gulimall.member.dao;

import club.zhanshen.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhanyao
 * @email 3119954407@qq.com
 * @date 2022-11-29 10:44:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
