package top.myjinji;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import cn.afterturn.easypoi.excel.entity.result.ExcelVerifyHandlerResult;
import cn.afterturn.easypoi.handler.inter.IExcelDataHandler;
import cn.afterturn.easypoi.handler.inter.IExcelVerifyHandler;
import cn.afterturn.easypoi.handler.impl.ExcelDataHandlerDefaultImpl;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

import java.io.File;
import java.util.List;

public class ExcelReader {

    public static class BreakfastLunchDinner {
        @Excel(name = "早餐")
        private String breakfast;

        @Excel(name = "午餐")
        private String lunch;

        @Excel(name = "晚餐")
        private String dinner;

        public String getBreakfast() {
            return breakfast;
        }

        public void setBreakfast(String breakfast) {
            this.breakfast = breakfast;
        }

        public String getLunch() {
            return lunch;
        }

        public void setLunch(String lunch) {
            this.lunch = lunch;
        }

        public String getDinner() {
            return dinner;
        }

        public void setDinner(String dinner) {
            this.dinner = dinner;
        }

        @Override
        public String toString() {
            return "早餐：" + breakfast + "，午餐：" + lunch + "，晚餐：" + dinner;
        }
    }

    public static void main(String[] args) {
        ImportParams params = new ImportParams();

        ExcelImportResult<BreakfastLunchDinner> result = ExcelImportUtil.importExcelMore(
                new File("test.xlsx"),
                BreakfastLunchDinner.class, params);

        List<BreakfastLunchDinner> dataList = result.getList();
        for (BreakfastLunchDinner data : dataList) {
            System.out.println(data);
        }
    }
}





