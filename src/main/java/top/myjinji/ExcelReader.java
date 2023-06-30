package top.myjinji;

import com.alibaba.excel.EasyExcel;
import top.myjinji.bean.Record;
import top.myjinji.listener.RecordListener;

import java.io.File;
import java.util.List;

public class ExcelReader {
    public static void main(String[] args) {
        String filename = "记账.xlsx";
        EasyExcel.read(filename,Record.class, new RecordListener()).sheet().doRead();
    }
}





