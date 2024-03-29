package cn.wang.yin.utils;

public class PersonConstant {
	public static final String DB_NAME = "persinal";
	public static final String SQL_GPS_INFO = "create table  if not exists gps_info (  "
			+ " t_id integer primary key   autoincrement ,  "
			+ " t_time varchar(30) ,"
			+ " t_loctype varchar(30),"
			+ " t_latitude varchar(30),"
			+ " t_lontitude  varchar(30),"
			+ " t_address varchar(50),"
			+ " t_writetime  varchar(30),t_radius varchar(30));";

	// 表一：etong_user
	public static final String SQL_ETONG_USER = "create table if not exists personal_users("
			+ " u_id integer primary key autoincrement,"
			+ " u_username varchar(30),"
			+ "	u_phonenumber varchar(30),"
			+ " u_odbnumber varchar(30),"
			+ " u_password varchar(30),"
			+ " u_image varchar(30), "
			+ " u_sinaweibo int,"
			+ " u_tencentweibo int,"
			+ " u_tencentqq int,"
			+ " u_carnumber varchar(30),"
			+ " u_vehicleType varchar(30),"
			+ " u_remark text ," + "u_deviceid  varchar(30) );";
	public static final String SQL_LOGIN_OUT = "update  personal_users  set [u_password]=null  where [u_phonenumber]=?;";
	public static final String CHECK_FAIL = "请检查用户名密码！";
	public static final String CHECK_SUCCESS = "登录成功";
	/**
	 * 测试数据
	 */
	public static final String DROP_SQL_ETONG_TRAVELMANAGEMENT = "drop table if exists etong_travelmanagement";
	public static final String DROP_SQL_ETONG_USER = "drop table if exists etong_users";

	/**
	 * 接口地址
	 */
	public static final String REMOTE_URL = "http://10.851008988.duapp.com/hapi";
	// public static final String REMOTE_URL
	// ="http://192.168.2.185:8080/th/hapi";
	public static final long WAIT_TIMS = 1000 * 60 * 3;

	public static final String PREFERENCES_FILE_NAME = "personal_preferences";

	public static final String USER_NAME = "username";
	public static final String PASS_WORD = "password";

	public static final String SQL_PERSON_COLLECT = "create table  if not exists person_collect (  "
			+ " id integer primary key   autoincrement ,  "
			+ " message varchar(100) ,"
			+ " exceptiontype varchar(200),"
			+ " exlocation varchar(100),"
			+ " phonenum varchar(20),"
			+ " pruducttime varchar(30));";

	public static final String BAIDU_MAP_KEY = "E0D1BCE3141B89DB8A7629D0FF60B9D97495A23D";

}
