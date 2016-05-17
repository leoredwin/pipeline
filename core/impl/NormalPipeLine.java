package com.qianye.zhaimi.pipeline.core.impl;


import com.qianye.zhaimi.pipeline.NormalValve;
import com.qianye.zhaimi.pipeline.core.PipeLine;
import com.qianye.zhaimi.pipeline.entity.FlowResult;
import com.qianye.zhaimi.pipeline.entity.PipeLineContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 16/1/12.
 */
public class NormalPipeLine<T> implements PipeLine<T> {

    private List<NormalValve> valves = new ArrayList<NormalValve>();

    public void append(NormalValve normalValve) {
        valves.add(normalValve);
    }

    public FlowResult startFlow(PipeLineContext context, T data) {
        FlowResult result = new FlowResult();
        if (valves.size() == 0) {
            result.setStatus(false);
            result.setMessage("no taps in pipeline!");
            return result;
        }
        for (NormalValve valve : valves) {
            result = valve.valve(context, data);
            if (!result.isStatus()) {
                return result;
            }
        }
        return result;
    }
}
