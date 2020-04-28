package com.neusoft.collection.teach;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: wwb
 * @Date: 2020/4/28 09:11
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int CACHE_SIZE;
    /**
     * ���ݽ�������ܻ���������� *
     * @param cacheSize �����С */
    public LRUCache(int cacheSize) {
        // false���ղ���˳���������true���շ���˳�򣬰ѷ��ʵ�Ԫ�ز��뵽�����
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        CACHE_SIZE = cacheSize;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // �� map �е�����������ָ���Ļ��������ʱ�򣬾��Զ�ɾ�����ϵ����ݡ�
        return this.size() > CACHE_SIZE;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put("1", "a");
        lruCache.put("2", "b");
        lruCache.put("3", "c");
        lruCache.put("4", "c");
        lruCache.get("3");
        System.out.println(lruCache);
    }
}
