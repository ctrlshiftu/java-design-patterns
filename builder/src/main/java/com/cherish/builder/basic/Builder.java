package com.cherish.builder.basic;

import java.util.Collection;
import java.util.Map;

/**
 * builder 接口，创建输出文件对象所需的各个部件的操作
 *
 * @author zengjia
 */
public interface Builder {

    /**
     * 构建输出文件的 Header 部分
     * @param ehm 文件头部的内容
     */
    void buildHeader (ExportHeaderModel ehm);

    /**
     * 构建输出文件的Body部分
     * @param mapData 要输出的数据内容
     */
    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 文件尾
     * @param efm 文件尾的内容
     */
    void buildFooter(ExportFooterModel efm);
}
