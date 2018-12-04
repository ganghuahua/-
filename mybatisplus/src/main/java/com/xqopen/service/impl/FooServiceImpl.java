package com.xqopen.service.impl;

import com.xqopen.entity.Foo;
import com.xqopen.mapper.FooMapper;
import com.xqopen.service.IFooService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2017-08-16
 */
@Service
public class FooServiceImpl extends ServiceImpl<FooMapper, Foo> implements IFooService {
	
}
