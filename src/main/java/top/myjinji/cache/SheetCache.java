package top.myjinji.cache;

import top.myjinji.bean.Record;

import java.util.HashMap;
import java.util.List;

public class SheetCache {

    static HashMap<String, List<Record>> sheetMap = new HashMap<>();

    public static void putSheet(String sheetName, List<Record> data) {
        // 检测是否有重名
        sheetMap.put(sheetName, data);
    }

    public static void deleteSheet(String sheetName) {
        sheetMap.remove(sheetName);
    }
}
