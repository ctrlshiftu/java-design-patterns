package com.cherish.builder.basic;

/**
 * @author zengjia
 */
public class ExportHeaderModel {

    /**
     * 分公司或门市点编号
     */
    private String depId;

    /**
     * 导出数据日志
     */
    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public String getExportDate() {
        return exportDate;
    }


    public void setDepId(String depId) {
        this.depId = depId;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
