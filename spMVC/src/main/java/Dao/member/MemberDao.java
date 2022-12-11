package Dao.member;

import java.util.List;

import Model.member;

public interface MemberDao {
	//Create
	void add(member m);
	//Read
	List<member> queryAll();
	member queryId(int id);
	//Update
	void update(member m);
	//Delete
	void delete(int id);
}
