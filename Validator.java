package com.qianye.zhaimi.pipeline;

import com.qianye.zhaimi.pipeline.entity.FlowResult;
import com.qianye.zhaimi.pipeline.entity.PipeLineContext;

/**
 * Created by wanglong on 16/1/15.
 */
public interface Validator<T> extends NormalValve<T> {

    FlowResult valve(PipeLineContext context, T data);
}
