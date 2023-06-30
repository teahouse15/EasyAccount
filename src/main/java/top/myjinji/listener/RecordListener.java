package top.myjinji.listener;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import top.myjinji.bean.Record;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RecordListener extends AnalysisEventListener<Record> {

    private List<Record> dataList = new ArrayList<>(); // 用于保存数据

    @Override
    public void invoke(Record data, AnalysisContext context) {
        dataList.add(data); // 将数据保存到列表中
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
    }
}
