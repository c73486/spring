package Dao.porder;

import java.util.List;

import Model.porder;

public interface PorderDao {
	//Creat
	void add(porder p);
	//Read
	List<porder> queryAll();
	porder queryId(int id);
	List<porder> querySum(int start,int end);
	//Update
	void update(porder p);
	//Delete
	void delete(int id);
}
