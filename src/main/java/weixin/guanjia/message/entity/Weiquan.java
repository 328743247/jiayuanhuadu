package weixin.guanjia.message.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.jeecgframework.core.common.entity.IdEntity;

/**
 * 维权实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="weiquan")
public class Weiquan extends IdEntity {
	//姓名
	private String name;
    //创建时间
    private Date createTime;
    //修改时间
    private Date modifyTime;
    //微信号
    private String wx_num;
    //内容
    private String content;
    //楼栋号
    private String lou;
    //房号
    private String houseNum;
    //手机号
    private String mobile;
    
    @Column(name="create_time")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Column(name="modify_time")
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Column(name="wx_num")
	public String getWx_num() {
		return wx_num;
	}
	public void setWx_num(String wxNum) {
		wx_num = wxNum;
	}
	@Column(name="content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Column(name="lou")
	public String getLou() {
		return lou;
	}
	public void setLou(String lou) {
		this.lou = lou;
	}
	@Column(name="house_num")
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	@Column(name="mobile")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
