package Dao.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Dao.DBconnection;
import Model.member;

public class implMember implements MemberDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(member m) {
		SqlSession session=DBconnection.getDB_mybatis();
		session.insert("memberMapper.add", m);
		session.commit();
		session.close();
		
	}

	@Override
	public List<member> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public member queryId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(member m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
