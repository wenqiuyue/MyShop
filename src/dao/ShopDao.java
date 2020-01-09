package dao;

import java.util.List;

import model.*;


public interface ShopDao {
	//����ע�᷽���Ľӿ�
	public int RegisterDao(User u);
	
	//�����¼�����ӿ�
	public User loginDao(String name,String password);
	
	//����������Ʒ�ӿ�
	public List<Goods> searchDao(String key);
	
	//���������Ʒ�ӿ�
	public int AddGoodsDao(Goods g);
	
	//�����޸��û���Ϣ�ӿ�
	public int UpdateUserDao(User u);
	
	//��ѯ�û���Ϣ
	public User QueryUserDao(int id);
	
	//��ѯ�����û���Ϣ
	public List<User> AllUserDao();
	
	//ɾ���û�
	public int DeleteUserDao(int id);
	
	//��Ӷ���
	public int DingDanDao(Order o);
	
	//��ѯ����
	public List<Order> QueryDingDan(int id);
	
	//ɾ������
	public int DeleteDingDanDao(int id);
	
	//�鿴������Ʒ��Ϣ
	public List<Goods> AllGoodsDao();
	
	//ɾ����Ʒ
	public int DeleteGoodsDao(int id);
	
	//�޸���Ʒ��Ϣ
	public int UpdateGoodsDao(Goods g);
	
	//��ѯ���ж���
	public List<Order> AllOrderDao();

}
