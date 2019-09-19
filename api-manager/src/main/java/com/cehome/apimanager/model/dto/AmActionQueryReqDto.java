package com.cehome.apimanager.model.dto;

import com.cehome.apimanager.model.po.AmAction;

public class AmActionQueryReqDto extends AmAction {
    private static final long serialVersionUID = -2793848993488196621L;
    private Integer pageIndex = 1;
    private Integer pageSize = 20;
    private String keywords;
    private String[] keywordArray;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String[] getKeywordArray() {
        return keywordArray;
    }

    public void setKeywordArray(String[] keywordArray) {
        this.keywordArray = keywordArray;
    }
}
