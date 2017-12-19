package com.ibumeng.vcs.model.listener;


import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.ibumeng.vcs.model.entity.UserBaseEntity;

import java.util.Date;

/**
 * 处理时间戳,这个方式不好,应该使用数据库时间,因为服务器间时间同步会造成问题.
 * <br/>
 * 比较残废的是, mysql只能识别一个 CURRENT_TIMESTAMP  ON UPDATE CURRENT_TIMESTAMP , 这个关键的属性只能给ModifyData了...
 */
public class UserEntityListener<T> {
    @PrePersist
    public void prePersist(UserBaseEntity entity) {
        entity.setCreateDate(new Date());
        entity.setModifyDate(new Date());
    }

    @PreUpdate
    public void preUpdate(UserBaseEntity entity) {
    	entity.setModifyDate(new Date());
    }
}
