package com.jsxlmed.ui.tab1.bean.bean;

import com.jsxlmed.framework.base.BaseResponse;

import java.util.List;

public class FreeCourseEntity extends BaseResponse {


	/**
	 * message : 查询成功
	 * freecourses : [{"id":32909,"name":"2018临床执业医师实践技能操作E班","currentPrice":540,"createTime":1503989589000,"status":0,"sourcePrice":600,"lessionNum":80,"logoFileId":null,"updateTime":1523353770000,"losetype":0,"loseTime":1535644800000,"loseDaynum":0,"userId":1,"pageBuycount":null,"pageViewcount":null,"freeurl":"","sellType":0,"mobileLogoFileId":14826,"courseLogoFileId":14825,"courseYear":2018,"integral":null,"courseInfoUrl":"","isDel":0,"isShow":0,"isFree":0,"context":"<p>\t\t\t\t\t\t\t\t\t&nbsp; &nbsp;\t <\/p><p>\t\t\t\t\t\t\t\t\t&nbsp; &nbsp;\t <\/p><p>\t\t\t\t\t\t\t\t\t&nbsp; &nbsp;\t <\/p><p>\t\t\t\t\t\t\t\t\t&nbsp; &nbsp;\t <\/p><p>\t\t\t\t\t\t\t\t\t&nbsp; &nbsp;\t <\/p><p>\t\t\t\t\t\t\t\t\t&nbsp; &nbsp;\t <\/p><table border=\"2\" style=\"width: 610px;\"><tbody><tr class=\"firstRow\"><td style=\"width:100px;border:2px solid #000000;background-color:#00D5FF;\"><strong>实践技能必过班E<\/strong><br/><\/td><td style=\"border:2px solid #000000;\"><br/><\/td><\/tr><tr><td rowspan=\"2\" colspan=\"2\" style=\"height:100px;border:2px solid #000000;\"><span style=\"font-size:14px;\">【课程内容】剖析三站高频考点，实战模拟演练，贴近实际考试；面授课程赠送同期网课。<br/>（需要报面授的学员请直接拨打客服热线010-62384662/4000-3000-96或者咨询在线客服。）<\/span><br/><\/td><\/tr><tr><\/tr><tr><td style=\"width: 100px; border: 2px solid rgb(0, 0, 0); word-break: break-all;\"><span style=\"color:#FFFFFF;background-color:#E53333;\">网课价格：600元<\/span><br/><\/td><td style=\"width: 298px; border: 2px solid rgb(0, 0, 0); word-break: break-all;\"><span style=\"color:#FFFFFF;background-color:#E53333;\">面授价格：1500元(不过重修)/2000元(不过退费1800元)<\/span><br/><\/td><\/tr><\/tbody><\/table>","liveBeginTime":315504000000,"subject":null,"subjectId":null,"teacherIds":"","teacherNames":"","teachers":null,"ordernum":22,"packageLogo":null,"mobileLogo":"http://testjxjy.jscaishui.com/upload/image/temp/null","fabric":null,"presentBook":null}]
	 * hotsales : []
	 * success : true
	 */

	private String message;
	private boolean success;
	private List<FreecoursesBean> freecourses;
	private List<?> hotsales;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<FreecoursesBean> getFreecourses() {
		return freecourses;
	}

	public void setFreecourses(List<FreecoursesBean> freecourses) {
		this.freecourses = freecourses;
	}

	public List<?> getHotsales() {
		return hotsales;
	}

	public void setHotsales(List<?> hotsales) {
		this.hotsales = hotsales;
	}

	public static class FreecoursesBean {
		/**
		 * id : 32909
		 * name : 2018临床执业医师实践技能操作E班
		 * currentPrice : 540
		 * createTime : 1503989589000
		 * status : 0
		 * sourcePrice : 600
		 * lessionNum : 80
		 * logoFileId : null
		 * updateTime : 1523353770000
		 * losetype : 0
		 * loseTime : 1535644800000
		 * loseDaynum : 0
		 * userId : 1
		 * pageBuycount : null
		 * pageViewcount : null
		 * freeurl :
		 * sellType : 0
		 * mobileLogoFileId : 14826
		 * courseLogoFileId : 14825
		 * courseYear : 2018
		 * integral : null
		 * courseInfoUrl :
		 * isDel : 0
		 * isShow : 0
		 * isFree : 0
		 * context : <p>									&nbsp; &nbsp;</p><p>									&nbsp; &nbsp;</p><p>									&nbsp; &nbsp;</p><p>									&nbsp; &nbsp;</p><p>									&nbsp; &nbsp;</p><p>									&nbsp; &nbsp;</p><table border="2" style="width: 610px;"><tbody><tr class="firstRow"><td style="width:100px;border:2px solid #000000;background-color:#00D5FF;"><strong>实践技能必过班E</strong><br/></td><td style="border:2px solid #000000;"><br/></td></tr><tr><td rowspan="2" colspan="2" style="height:100px;border:2px solid #000000;"><span style="font-size:14px;">【课程内容】剖析三站高频考点，实战模拟演练，贴近实际考试；面授课程赠送同期网课。<br/>（需要报面授的学员请直接拨打客服热线010-62384662/4000-3000-96或者咨询在线客服。）</span><br/></td></tr><tr></tr><tr><td style="width: 100px; border: 2px solid rgb(0, 0, 0); word-break: break-all;"><span style="color:#FFFFFF;background-color:#E53333;">网课价格：600元</span><br/></td><td style="width: 298px; border: 2px solid rgb(0, 0, 0); word-break: break-all;"><span style="color:#FFFFFF;background-color:#E53333;">面授价格：1500元(不过重修)/2000元(不过退费1800元)</span><br/></td></tr></tbody></table>
		 * liveBeginTime : 315504000000
		 * subject : null
		 * subjectId : null
		 * teacherIds :
		 * teacherNames :
		 * teachers : null
		 * ordernum : 22
		 * packageLogo : null
		 * mobileLogo : http://testjxjy.jscaishui.com/upload/image/temp/null
		 * fabric : null
		 * presentBook : null
		 */

		private int id;
		private String name;
		private int currentPrice;
		private long createTime;
		private int status;
		private int sourcePrice;
		private int lessionNum;
		private Object logoFileId;
		private long updateTime;
		private int losetype;
		private long loseTime;
		private int loseDaynum;
		private int userId;
		private Object pageBuycount;
		private Object pageViewcount;
		private String freeurl;
		private int sellType;
		private int mobileLogoFileId;
		private int courseLogoFileId;
		private int courseYear;
		private Object integral;
		private String courseInfoUrl;
		private int isDel;
		private int isShow;
		private int isFree;
		private String context;
		private long liveBeginTime;
		private Object subject;
		private Object subjectId;
		private String teacherIds;
		private String teacherNames;
		private Object teachers;
		private int ordernum;
		private Object packageLogo;
		private String mobileLogo;
		private Object fabric;
		private Object presentBook;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCurrentPrice() {
			return currentPrice;
		}

		public void setCurrentPrice(int currentPrice) {
			this.currentPrice = currentPrice;
		}

		public long getCreateTime() {
			return createTime;
		}

		public void setCreateTime(long createTime) {
			this.createTime = createTime;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getSourcePrice() {
			return sourcePrice;
		}

		public void setSourcePrice(int sourcePrice) {
			this.sourcePrice = sourcePrice;
		}

		public int getLessionNum() {
			return lessionNum;
		}

		public void setLessionNum(int lessionNum) {
			this.lessionNum = lessionNum;
		}

		public Object getLogoFileId() {
			return logoFileId;
		}

		public void setLogoFileId(Object logoFileId) {
			this.logoFileId = logoFileId;
		}

		public long getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(long updateTime) {
			this.updateTime = updateTime;
		}

		public int getLosetype() {
			return losetype;
		}

		public void setLosetype(int losetype) {
			this.losetype = losetype;
		}

		public long getLoseTime() {
			return loseTime;
		}

		public void setLoseTime(long loseTime) {
			this.loseTime = loseTime;
		}

		public int getLoseDaynum() {
			return loseDaynum;
		}

		public void setLoseDaynum(int loseDaynum) {
			this.loseDaynum = loseDaynum;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public Object getPageBuycount() {
			return pageBuycount;
		}

		public void setPageBuycount(Object pageBuycount) {
			this.pageBuycount = pageBuycount;
		}

		public Object getPageViewcount() {
			return pageViewcount;
		}

		public void setPageViewcount(Object pageViewcount) {
			this.pageViewcount = pageViewcount;
		}

		public String getFreeurl() {
			return freeurl;
		}

		public void setFreeurl(String freeurl) {
			this.freeurl = freeurl;
		}

		public int getSellType() {
			return sellType;
		}

		public void setSellType(int sellType) {
			this.sellType = sellType;
		}

		public int getMobileLogoFileId() {
			return mobileLogoFileId;
		}

		public void setMobileLogoFileId(int mobileLogoFileId) {
			this.mobileLogoFileId = mobileLogoFileId;
		}

		public int getCourseLogoFileId() {
			return courseLogoFileId;
		}

		public void setCourseLogoFileId(int courseLogoFileId) {
			this.courseLogoFileId = courseLogoFileId;
		}

		public int getCourseYear() {
			return courseYear;
		}

		public void setCourseYear(int courseYear) {
			this.courseYear = courseYear;
		}

		public Object getIntegral() {
			return integral;
		}

		public void setIntegral(Object integral) {
			this.integral = integral;
		}

		public String getCourseInfoUrl() {
			return courseInfoUrl;
		}

		public void setCourseInfoUrl(String courseInfoUrl) {
			this.courseInfoUrl = courseInfoUrl;
		}

		public int getIsDel() {
			return isDel;
		}

		public void setIsDel(int isDel) {
			this.isDel = isDel;
		}

		public int getIsShow() {
			return isShow;
		}

		public void setIsShow(int isShow) {
			this.isShow = isShow;
		}

		public int getIsFree() {
			return isFree;
		}

		public void setIsFree(int isFree) {
			this.isFree = isFree;
		}

		public String getContext() {
			return context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public long getLiveBeginTime() {
			return liveBeginTime;
		}

		public void setLiveBeginTime(long liveBeginTime) {
			this.liveBeginTime = liveBeginTime;
		}

		public Object getSubject() {
			return subject;
		}

		public void setSubject(Object subject) {
			this.subject = subject;
		}

		public Object getSubjectId() {
			return subjectId;
		}

		public void setSubjectId(Object subjectId) {
			this.subjectId = subjectId;
		}

		public String getTeacherIds() {
			return teacherIds;
		}

		public void setTeacherIds(String teacherIds) {
			this.teacherIds = teacherIds;
		}

		public String getTeacherNames() {
			return teacherNames;
		}

		public void setTeacherNames(String teacherNames) {
			this.teacherNames = teacherNames;
		}

		public Object getTeachers() {
			return teachers;
		}

		public void setTeachers(Object teachers) {
			this.teachers = teachers;
		}

		public int getOrdernum() {
			return ordernum;
		}

		public void setOrdernum(int ordernum) {
			this.ordernum = ordernum;
		}

		public Object getPackageLogo() {
			return packageLogo;
		}

		public void setPackageLogo(Object packageLogo) {
			this.packageLogo = packageLogo;
		}

		public String getMobileLogo() {
			return mobileLogo;
		}

		public void setMobileLogo(String mobileLogo) {
			this.mobileLogo = mobileLogo;
		}

		public Object getFabric() {
			return fabric;
		}

		public void setFabric(Object fabric) {
			this.fabric = fabric;
		}

		public Object getPresentBook() {
			return presentBook;
		}

		public void setPresentBook(Object presentBook) {
			this.presentBook = presentBook;
		}
	}
}
