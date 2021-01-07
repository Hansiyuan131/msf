package com.tiaotiao.msf.commons.tree;

import java.util.List;

public interface DataTree<T, ID> {
    /**
     * 维护树形关系：元素一
     */
    ID getId();

    /**
     * 维护树形关系：元素二
     */
    ID getParentId();

    /**
     * 子节点数组
     */
    void setChildren(List<T> children);

    List<T> getChildren();
}
