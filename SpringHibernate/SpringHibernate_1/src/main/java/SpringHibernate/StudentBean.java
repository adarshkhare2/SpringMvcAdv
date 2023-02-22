package SpringHibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentBean {
	
public HibernateTemplate hibernateTemplate;

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
public void saveStudent(StudentBean studentBean) {
	hibernateTemplate.save(studentBean);
	
}
	

}
