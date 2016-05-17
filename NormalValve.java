package com.qianye.zhaimi.pipeline;


import com.qianye.zhaimi.pipeline.entity.FlowResult;
import com.qianye.zhaimi.pipeline.entity.PipeLineContext;

/**
 * Created by leo on 16/1/12.
 */
public interface NormalValve<T> {

    FlowResult valve(PipeLineContext context, T data);
}
