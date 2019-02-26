package com.shl.projectTemplate.datasource;

/**
 * @author songhengliang
 * @date 2019/2/24
 */
public class DataSourceContextHolder {

    // 线程threadlocal
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
    // 写
    private static final String DB_TYPE_W = "WDS";
    // 读
    private static final String DB_TYPE_R = "RDS";

    /**
     * 取数据源句柄
     *
     * @return
     */
    public static String getDataSourceType() {
        String db = contextHolder.get();
        if (db == null) {
            db = DB_TYPE_W;// 默认是读写库
        }
        return db;
    }

    /**
     * 读库
     */
    public static void read() {
        contextHolder.set(DB_TYPE_R);
    }

    /**
     * 写库
     */
    public static void write() {
        contextHolder.set(DB_TYPE_W);
    }

    /**
     * 清理连接类型
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}