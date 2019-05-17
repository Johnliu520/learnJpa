package net.ebzh.bootjpa.utils;

import java.util.List;

/**
 * @Author: John Ming
 * @Date: 2019/5/17 15:35
 * @Version 1.0
 * @describe:
 */
public interface DynamicQuery {

    public void save(Object entity);

    public void update(Object entity);

    public <T> void delete(Class<T> entityClass, Object entityid);

    public <T> void delete(Class<T> entityClass, Object[] entityids);

    /**
     * 查询对象列表，返回List
     * @param nativeSql
     * @param params
     * @return  List<T>
     *
     */
    <T> List<T> nativeQueryList(String nativeSql, Object... params);

    /**
     * 查询对象列表，返回List<Map<key,value>>
     * @param nativeSql
     * @param params
     * @return  List<T>
     *
     */
    <T> List<T> nativeQueryListMap(String nativeSql,Object... params);

    /**
     * 查询对象列表，返回List<组合对象>
     * @param resultClass
     * @param nativeSql
     * @param params
     * @return  List<T>
     *
     */
    <T> List<T> nativeQueryListModel(Class<T> resultClass, String nativeSql, Object... params);

}
