package cn.com.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.entity.AccountBook;
import cn.com.service.IEditService;
import cn.com.dao.IEditDao;
import cn.com.dao.imp.EditDao;



@Service
public class EditService implements IEditService{

	@Autowired
    public IEditDao iEditDao = null;
    public int flag = 0;


	/**
	 * �������Ѽ�¼
	 */
	@Override
	public int addConsume(AccountBook accountBook) {
		

//		iEditDao = new EditDao();
		flag = iEditDao.addConsume(accountBook);
		if(flag >0)
			return flag;
		
		return flag;
	}


	/**
	 * ɾ�����Ѽ�¼
	 */
	@Override
	public void deleteConsume(int accountBookNum) {
//		iEditDao = new EditDao();
		iEditDao.deleteConsume(accountBookNum);

	}

   /**
    * �޸����Ѽ�¼
    */
	@Override
	public int editConsume(AccountBook accountBook) {
//		iEditDao = new EditDao();
		flag = iEditDao.editConsume(accountBook);
		if(flag >0)
			return flag;
		return 0;
	}

}