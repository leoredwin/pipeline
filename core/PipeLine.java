package com.qianye.zhaimi.pipeline.core;


import com.qianye.zhaimi.pipeline.NormalValve;
import com.qianye.zhaimi.pipeline.entity.FlowResult;
import com.qianye.zhaimi.pipeline.entity.PipeLineContext;

/**
 * Created by leo on 16/1/12.
 */
public interface PipeLine<T> {

    void append(NormalValve valve);

    FlowResult startFlow(PipeLineContext context, T data);
}
