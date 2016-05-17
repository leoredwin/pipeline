package com.qianye.zhaimi.pipeline.core.impl;

import com.qianye.zhaimi.pipeline.NormalValve;
import com.qianye.zhaimi.pipeline.Validator;
import com.qianye.zhaimi.pipeline.entity.FlowResult;
import com.qianye.zhaimi.pipeline.entity.PipeLineContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglong on 16/1/15.
 */
@Service
public class ValidatorSet<T> extends NormalPipeLine<T> {

    public void addValidator(Validator validator) {
        super.append(validator);
    }

    public FlowResult validate(PipeLineContext pipeLineContext, T data) {
        return super.startFlow(pipeLineContext, data);
    }
}
