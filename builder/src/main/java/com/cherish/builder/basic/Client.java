package com.cherish.builder.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * 场景1：导出数据的应用框架。通常对于具体的导出内容和格式是有要求的，假如有如下要求：
 *      1）导出的文件，不管什么格式，都分成3部分，分别是文件头、文件体和文件尾；
 *      2）文件头部分，需要描述：分公司或门市点编号，导出数据日期
 *      3）文件体部分，表名称，让后分条描述数据。
 *      4）文件尾部分，需要描述：输出人
 *
 * builder 模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *      分析：1）构建每种格式的数据文件的处理过程，就是构建过程，
 *           2）每种格式具体的步骤实现，就相当于表示。因为不同的步骤实现，据欸的那个了最终的表现也不同。
 *
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2022-11-26");

        HashMap<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        ArrayList<ExportDataModel> col = new ArrayList<>();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm1.setProductId("产品002号");
        edm1.setPrice(90);
        edm1.setAmount(55);

        // 组装数据
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        // 测试输出文件到文本文件
        TextBuilder textBuilder = new TextBuilder();
        // 创建指导者对象
        Director director = new Director(textBuilder);
        director.construct(ehm, mapData, efm);

        // 输出控制台
        System.out.println("输出到文本文件的内容：\n" + textBuilder.getResult());

        // 输出到 XML 文件
        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director1 = new Director(xmlBuilder);
        director1.construct(ehm, mapData, efm);
        // 输出到xml
        System.out.println("输出到xml的内容：\n" + textBuilder.getResult());

    }
}
