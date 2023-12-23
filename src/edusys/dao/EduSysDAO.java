package edusys.dao;

import java.util.List;

abstract public class EduSysDAO<E, K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K id);
    abstract public E selectById(K id);
    abstract public List<E> selectAll();
    abstract protected List<E> selectBySql(String sql, Object...args);
}