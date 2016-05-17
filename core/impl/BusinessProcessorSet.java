package com.qianye.zhaimi.pipeline.core.impl;

import com.qianye.zhaimi.pipeline.BusinessProcessor;
import com.qianye.zhaimi.pipeline.NormalValve;
import com.qianye.zhaimi.pipeline.entity.FlowResult;
import com.qianye.zhaimi.pipeline.entity.PipeLineContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglong on 16/1/15.
 */
@Service
public class BusinessProcessorSet<T> extends NormalPipeLine<T> {


    public void addBusinessProcessor(BusinessProcessor businessProcessor) {
        super.append(businessProcessor);
    }

    public FlowResult process(PipeLineContext pipeLineContext, T data) {
        return super.startFlow(pipeLineContext, data);
    }
}
