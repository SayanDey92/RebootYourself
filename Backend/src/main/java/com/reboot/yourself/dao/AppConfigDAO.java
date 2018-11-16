package com.reboot.yourself.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.reboot.yourself.model.ApplicationConfiguration;
import com.reboot.yourself.model.UserModel;

@Transactional
public class AppConfigDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
    private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public List<ApplicationConfiguration> getConfigList() {
		List<ApplicationConfiguration> results = null;
		try {
			DetachedCriteria dCriteria = DetachedCriteria.forClass(ApplicationConfiguration.class);
			dCriteria.addOrder(Order.asc("id"));
			results = (List<ApplicationConfiguration>) this.hibernateTemplate.findByCriteria(dCriteria);
			System.out.println("Result" + results);
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}
	
	
	@SuppressWarnings("unchecked")
	public UserModel findByUserName(String userName) {
		UserModel model = null;
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(UserModel.class);
			criteria.add(Restrictions.eq("emailId", userName));
			criteria.add(Restrictions.eq("isDelete", false));
			List<UserModel> userList = (List<UserModel>) this.hibernateTemplate.findByCriteria(criteria);
			if(!userList.isEmpty()){
				model=(UserModel) userList.get(0);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
}
