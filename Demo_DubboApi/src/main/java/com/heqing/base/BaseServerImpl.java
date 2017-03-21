package com.heqing.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseServerImpl<T> implements BaseServer<T> {

	@Autowired
	private BaseDao<T> baseDao;

	public BaseDao<T> getBaseDao() {
		return baseDao;
	}
	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	@CacheEvict(value="data", key="#root.targetClass+#root.methodName", allEntries=true) 
	public void save(T entity) {
		baseDao.save(entity);
	}

	@CachePut(value="data", key="#root.targetClass+#root.methodName")    
	public void update(T entity) {
		baseDao.update(entity);
	}

	@CacheEvict(value="data", key="#root.targetClass+#root.methodName", allEntries=true)    
	public void delete(Long id) {
		baseDao.delete(id);
	}

	@Cacheable(value="data", key="#root.targetClass+#root.methodName") 
	public T getById(Long id) {
		return (T) baseDao.getById(id);
	}

	@Cacheable(value="data", key="#root.targetClass+#root.methodName") 
	public List<T> getByIds(Long[] ids) {
		return baseDao.getByIds(ids);
	}

	@Cacheable(value="data", key="#root.targetClass+#root.methodName") 
	public List<T> findAll(T entity) {
		return baseDao.findAll(entity);
	}

	@Cacheable(value="data", key="#root.targetClass+#root.methodName") 
	public List<T> getPageBean(T entity, int pageNum, int pageSize){
		return baseDao.getPageBean(entity, pageNum, pageSize);
	}
}
