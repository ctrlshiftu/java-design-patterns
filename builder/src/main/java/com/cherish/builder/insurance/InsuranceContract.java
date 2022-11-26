package com.cherish.builder.insurance;

/**
 * 保险合同对象
 *
 * @author zengjia
 */
public class InsuranceContract {

    // 合同编号
    private final String contractId;
    // 被保险人名称，同一份保险合同，要么跟人员签订，要么跟公司签订
    private final String personName;
    // 被保险公司名称
    private final String companyName;
    // 保险开始生效日期
    private final Long beginDate;
    // 保险失效日期，一定大于保险开始生效日期
    private final Long endDate;
    // 其他数据
    private final String otherData;

    /**
     * default 修饰，不希望外部对象直接 new ,而是通过构造器对象，该对象中包含保险合同需要的数据
     * @param builder 构造器
     */
    private InsuranceContract(ConcreteBuilder builder) {
        this.personName = builder.getPersonName();
        this.contractId = builder.getContractId();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    public void someOperation() {
        System.out.println(" now in Insurance contract someOperation==" + this.contractId);
    }

    /**
     * 保险合同对象 的 Builder构造器,作为保险合同的内部类
     *
     * @author zengjia
     */
    public static class ConcreteBuilder {

        private final String contractId;
        private String personName;
        private String companyName;
        private final long beginDate;
        private final long endDate;
        private String otherData;

        /**
         * 构造方法，必须要有的参数
         * @param contractId 保险合同编号
         * @param beginDate 合同生效日期
         * @param endDate 合同失效日期
         */
        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.beginDate = beginDate;
            this.contractId = contractId;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        public InsuranceContract build() {
            // 省略校验规则
            return new InsuranceContract(this);
        }


        public String getContractId() {
            return contractId;
        }

        public String getPersonName() {
            return personName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public long getBeginDate() {
            return beginDate;
        }

        public long getEndDate() {
            return endDate;
        }

        public String getOtherData() {
            return otherData;
        }
    }
}
