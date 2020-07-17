/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sqltoy.quickstart.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_device_order,Remark:硬件购销定单表(演示有规则单号)  
 */
@Entity(tableName="sqltoy_device_order",pk_constraint="PRIMARY")
public abstract class AbstractDeviceOrderVO implements Serializable,
	java.lang.Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5912077678038173577L;
	
	/**
	 * jdbcType:VARCHAR
	 * 订单ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="ORDER_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String orderId;
	
	/**
	 * jdbcType:VARCHAR
	 * 设备类型
	 */
	@Column(name="DEVICE_TYPE",length=10L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String deviceType;
	
	/**
	 * jdbcType:VARCHAR
	 * 购销标志
	 */
	@Column(name="PS_TYPE",length=10L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String psType;
	
	/**
	 * jdbcType:DECIMAL
	 * 商品总量
	 */
	@Column(name="TOTAL_CNT",length=12L,type=java.sql.Types.DECIMAL,nullable=true)
	protected BigDecimal totalCnt;
	
	/**
	 * jdbcType:DECIMAL
	 * 总金额
	 */
	@Column(name="TOTAL_AMT",length=12L,type=java.sql.Types.DECIMAL,nullable=true)
	protected BigDecimal totalAmt;
	
	/**
	 * jdbcType:VARCHAR
	 * 购买方
	 */
	@Column(name="BUYER",length=22L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String buyer;
	
	/**
	 * jdbcType:VARCHAR
	 * 销售方
	 */
	@Column(name="SALER",length=22L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String saler;
	
	/**
	 * jdbcType:DATE
	 * 成交日期
	 */
	@Column(name="TRANS_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDate transDate;
	
	/**
	 * jdbcType:DATE
	 * 交货期限
	 */
	@Column(name="DELIVERY_TERM",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected LocalDate deliveryTerm;
	
	/**
	 * jdbcType:VARCHAR
	 * 业务员
	 */
	@Column(name="STAFF_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String staffId;
	
	/**
	 * jdbcType:VARCHAR
	 * 业务机构
	 */
	@Column(name="ORGAN_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String organId;
	
	/**
	 * jdbcType:INT
	 * 状态
	 */
	@Column(name="STATUS",length=10L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	
	/**
	 * jdbcType:VARCHAR
	 * 创建人
	 */
	@Column(name="CREATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String createBy;
	
	/**
	 * jdbcType:DATETIME
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime createTime;
	
	/**
	 * jdbcType:VARCHAR
	 * 最后修改人
	 */
	@Column(name="UPDATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String updateBy;
	
	/**
	 * jdbcType:DATETIME
	 * 最后修改时间
	 */
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime updateTime;
	

	/** default constructor */
	public AbstractDeviceOrderVO() {
	}
	
	/** pk constructor */
	public AbstractDeviceOrderVO(String orderId)
	{
		this.orderId=orderId;
	}

	/** minimal constructor */
	public AbstractDeviceOrderVO(String orderId,String deviceType,String psType,LocalDate transDate,Integer status,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime)
	{
		this.orderId=orderId;
		this.deviceType=deviceType;
		this.psType=psType;
		this.transDate=transDate;
		this.status=status;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
	}

	/** full constructor */
	public AbstractDeviceOrderVO(String orderId,String deviceType,String psType,BigDecimal totalCnt,BigDecimal totalAmt,String buyer,String saler,LocalDate transDate,LocalDate deliveryTerm,String staffId,String organId,Integer status,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime)
	{
		this.orderId=orderId;
		this.deviceType=deviceType;
		this.psType=psType;
		this.totalCnt=totalCnt;
		this.totalAmt=totalAmt;
		this.buyer=buyer;
		this.saler=saler;
		this.transDate=transDate;
		this.deliveryTerm=deliveryTerm;
		this.staffId=staffId;
		this.organId=organId;
		this.status=status;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
	}
	
	/**
	 *@param orderId the orderId to set
	 */
	public AbstractDeviceOrderVO setOrderId(String orderId) {
		this.orderId=orderId;
		return this;
	}
		
	/**
	 *@return the OrderId
	 */
	public String getOrderId() {
	    return this.orderId;
	}
	
	/**
	 *@param deviceType the deviceType to set
	 */
	public AbstractDeviceOrderVO setDeviceType(String deviceType) {
		this.deviceType=deviceType;
		return this;
	}
		
	/**
	 *@return the DeviceType
	 */
	public String getDeviceType() {
	    return this.deviceType;
	}
	
	/**
	 *@param psType the psType to set
	 */
	public AbstractDeviceOrderVO setPsType(String psType) {
		this.psType=psType;
		return this;
	}
		
	/**
	 *@return the PsType
	 */
	public String getPsType() {
	    return this.psType;
	}
	
	/**
	 *@param totalCnt the totalCnt to set
	 */
	public AbstractDeviceOrderVO setTotalCnt(BigDecimal totalCnt) {
		this.totalCnt=totalCnt;
		return this;
	}
		
	/**
	 *@return the TotalCnt
	 */
	public BigDecimal getTotalCnt() {
	    return this.totalCnt;
	}
	
	/**
	 *@param totalAmt the totalAmt to set
	 */
	public AbstractDeviceOrderVO setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt=totalAmt;
		return this;
	}
		
	/**
	 *@return the TotalAmt
	 */
	public BigDecimal getTotalAmt() {
	    return this.totalAmt;
	}
	
	/**
	 *@param buyer the buyer to set
	 */
	public AbstractDeviceOrderVO setBuyer(String buyer) {
		this.buyer=buyer;
		return this;
	}
		
	/**
	 *@return the Buyer
	 */
	public String getBuyer() {
	    return this.buyer;
	}
	
	/**
	 *@param saler the saler to set
	 */
	public AbstractDeviceOrderVO setSaler(String saler) {
		this.saler=saler;
		return this;
	}
		
	/**
	 *@return the Saler
	 */
	public String getSaler() {
	    return this.saler;
	}
	
	/**
	 *@param transDate the transDate to set
	 */
	public AbstractDeviceOrderVO setTransDate(LocalDate transDate) {
		this.transDate=transDate;
		return this;
	}
		
	/**
	 *@return the TransDate
	 */
	public LocalDate getTransDate() {
	    return this.transDate;
	}
	
	/**
	 *@param deliveryTerm the deliveryTerm to set
	 */
	public AbstractDeviceOrderVO setDeliveryTerm(LocalDate deliveryTerm) {
		this.deliveryTerm=deliveryTerm;
		return this;
	}
		
	/**
	 *@return the DeliveryTerm
	 */
	public LocalDate getDeliveryTerm() {
	    return this.deliveryTerm;
	}
	
	/**
	 *@param staffId the staffId to set
	 */
	public AbstractDeviceOrderVO setStaffId(String staffId) {
		this.staffId=staffId;
		return this;
	}
		
	/**
	 *@return the StaffId
	 */
	public String getStaffId() {
	    return this.staffId;
	}
	
	/**
	 *@param organId the organId to set
	 */
	public AbstractDeviceOrderVO setOrganId(String organId) {
		this.organId=organId;
		return this;
	}
		
	/**
	 *@return the OrganId
	 */
	public String getOrganId() {
	    return this.organId;
	}
	
	/**
	 *@param status the status to set
	 */
	public AbstractDeviceOrderVO setStatus(Integer status) {
		this.status=status;
		return this;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public AbstractDeviceOrderVO setCreateBy(String createBy) {
		this.createBy=createBy;
		return this;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public AbstractDeviceOrderVO setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
		return this;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public AbstractDeviceOrderVO setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
		return this;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public AbstractDeviceOrderVO setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
		return this;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("orderId=").append(getOrderId()).append("\n");
		columnsBuffer.append("deviceType=").append(getDeviceType()).append("\n");
		columnsBuffer.append("psType=").append(getPsType()).append("\n");
		columnsBuffer.append("totalCnt=").append(getTotalCnt()).append("\n");
		columnsBuffer.append("totalAmt=").append(getTotalAmt()).append("\n");
		columnsBuffer.append("buyer=").append(getBuyer()).append("\n");
		columnsBuffer.append("saler=").append(getSaler()).append("\n");
		columnsBuffer.append("transDate=").append(getTransDate()).append("\n");
		columnsBuffer.append("deliveryTerm=").append(getDeliveryTerm()).append("\n");
		columnsBuffer.append("staffId=").append(getStaffId()).append("\n");
		columnsBuffer.append("organId=").append(getOrganId()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		return columnsBuffer.toString();
	}
}
