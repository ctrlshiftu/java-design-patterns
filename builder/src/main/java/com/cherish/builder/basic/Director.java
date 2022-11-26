package com.cherish.builder.basic;

import java.util.Collection;
import java.util.Map;

/**
 * 指导者，指导使用生尘器的接口来构建输出的文件的对象
 *
 * @author zengjia
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
        // 先构建 Header
        builder.buildHeader(ehm);
        // 构建 body
        builder.buildBody(mapData);
        // 再构建 Footer
        builder.buildFooter(efm);
    }
}
