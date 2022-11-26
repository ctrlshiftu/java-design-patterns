package com.cherish.builder.basic;

import java.util.Collection;
import java.util.Map;

/**
 * 实现导出数据到文本文件的生成器对象
 * @author zengjia
 */
public class TextBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId()).append(",").append(ehm.getExportDate()).append("\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tbName : mapData.keySet()) {
            // 先拼接表名称
            buffer.append(tbName).append("\n");
            // 再循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tbName)) {
                buffer.append(edm.getProductId()).append(",").append(edm.getPrice()).append(",").append(edm.getAmount()).append("\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
