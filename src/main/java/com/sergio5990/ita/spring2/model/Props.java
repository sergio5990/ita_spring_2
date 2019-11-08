package com.sergio5990.ita.spring2.model;

import java.util.*;

public class Props {
    private Collection<String> itemCollection;
    private List<String> itemList;
    private Set<String> itemSet;
    private Map<String, String> itemMap;
    private Properties itemProps;

    public Props() {
    }

    public Props(Collection<String> itemCollection, List<String> itemList, Set<String> itemSet, Map<String, String> itemMap, Properties itemProps) {
        this.itemCollection = itemCollection;
        this.itemList = itemList;
        this.itemSet = itemSet;
        this.itemMap = itemMap;
        this.itemProps = itemProps;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public Set<String> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<String> itemSet) {
        this.itemSet = itemSet;
    }

    public Map<String, String> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, String> itemMap) {
        this.itemMap = itemMap;
    }

    public Properties getItemProps() {
        return itemProps;
    }

    public void setItemProps(Properties itemProps) {
        this.itemProps = itemProps;
    }

    public Collection<String> getItemCollection() {
        return itemCollection;
    }

    public void setItemCollection(Collection<String> itemCollection) {
        this.itemCollection = itemCollection;
    }

    @Override
    public String toString() {
        return "Props{" +
                "itemCollection=" + itemCollection +
                "\n, itemList=" + itemList +
                "\n, itemSet=" + itemSet +
                "\n, itemMap=" + itemMap +
                "\n, itemProps=" + itemProps +
                '}';
    }
}
