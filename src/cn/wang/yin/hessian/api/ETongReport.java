package cn.wang.yin.hessian.api;

public interface ETongReport {
	/**
	 * OBD�ն�ע��
	 * @param mobile	�ֻ���
	 * @param obdno		OBD�����
	 * @param pwd		��¼����
	 * @param licenseplate		���ƺ���
	 * @param vehicletype		��������
	 * @param recentMileage		��ǰ���
	 * @param beforeMaitainMileage		�´α������
	 * @return			�ɹ����ء�OK����ʧ�ܷ��ء�FAIL��
	 */
	public String registerOBDDevice(String mobile, String obdno, String pwd, String licenseplate, String vehicletype, int recentMileage, 
			int beforeMaitainMileage);
	/**
	 * ��¼
	 * @param mobile	�ֻ���
	 * @param pwd		����
	 * @return			�ն�ID
	 */
	public String login(String mobile, String pwd);
	
	/**
	 * ��¼
	 * @param mobile	�ֻ���
	 * @param pwd		����
	 * @return			�ն�ID�����ƺš��������͡�OBD��š���������
	 */
	public String loginForVehicleInfo(String mobile, String pwd);
	
	/**
	 * ��������
	 * @param mobile	�ֻ���
	 * @return			�ɹ����ء�OK����ʧ�ܷ��ء�FAIL��
	 */
	public String forgetPassword(String mobile);
	
	/**
	 * �޸�����
	 * @param mobile	�ֻ���
	 * @param oldPwd	������
	 * @param newPwd	������
	 * 					�޸ĳɹ�
	 * @return			�ɹ����ء�OK����ʧ�ܷ��ء�FAIL��
	 */
	public String modifyPassword(String mobile, String oldPwd, String newPwd);
	
	/**
	 * ��ȡ�������ָ��
	 * @param deviceid	�ն˱��
	 * @return
	 */
	public String getHealthIndex(String deviceid);
	
	/**
	 * ��ȡʵʱ����״̬��Ϣ
	 * @param deviceid	�ն˱��
	 * @return			����״̬��Ϣ
	 */
	public String getRealtimeOBDData(String deviceid);
	
	/**
	 * ��ȡ�����г̵�ͳ����Ϣ
	 * @param deviceid	�ն˱��
	 * @return			���г�ʱ�������г���̡����г̴��������ͺ���
	 */
	public String getAllRouteStatistics(String deviceid);
	
	/**
	 * ��ȡ��ʷ�г���Ϣ
	 * @param deviceid	�ն˱��
	 * @param startTime	��ʼʱ��
	 * @param endTime	����ʱ��
	 * @return			�г̿�ʼʱ�䡢�г̽���ʱ�䡢��̡����ͺġ�����ٶȡ����ˮ�¡����������ת�١���ѹ��ƽ���ͺġ�
	 * 					ƽ���ٶ�
	 */
	public String getRouteByTime(String deviceid, String startTime, String endTime);
	
	/**
	 * ��ȡ�г�·����Ϣ
	 * @param deviceid	�ն˱��
	 * @param startTime	��ʼʱ��
	 * @param endTime	����ʱ��
	 * @return			���ȡ�γ�ȡ�λ��
	 */
	public String getRouteLine(String deviceid, String startTime, String endTime);
	
	/**
	 * �������
	 * @param mobile	�ֻ���
	 * @param content	��������
	 * @return
	 */
	public String feedback(String mobile, String content);
	
	/**
	 * ��ȡ���������ϸ��Ϣ
	 * @param deviceid	�ն˱��
	 * @return
	 */
	public String getHealthDetail(String deviceid);

	/**
	 * �ռ�������Ϣ�Ľӿ�
	 * 
	 * @param message
	 *            Exception.getMessage()
	 * @param exceptiontype
	 *            Exception.getClass()
	 * @param exlocation
	 *            ������ֵ���λ�� com.etgps.etong.*
	 * @param phonenum
	 *            ��¼���ֻ���
	 * @param pruducttime
	 *            �����ɽʱ��
	 * @param writetime
	 *            �����ύʱ��
	 * @param type
	 *    	�������� 0 ����׿<br>
	 *            1:IOS
	 * @return �Ƿ��ύ�ɹ�
	 */
	public boolean CelectionDebug(String message,String exceptiontype,String exlocation,String phonenum,String pruducttime,String writetime,int type);
}
