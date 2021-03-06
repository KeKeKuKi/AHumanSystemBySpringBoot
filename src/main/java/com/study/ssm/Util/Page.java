package com.study.ssm.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page <T>{
    int curentPage;
    int totalCount;
    List <T> datas;
    List <T> pageDatas;
    String url;

    public Page() {
    }


    public Page(int curentPage, int totalCount, List<T> datas,String url) {
        this.curentPage = curentPage;
        this.totalCount = totalCount;
        this.datas = datas;
        this.url = url;
    }

    public List<T> getPage(int pageNumber){
        pageDatas = new ArrayList<>();
        if(pageNumber>datas.size()/totalCount+1){
            pageNumber = datas.size()/totalCount+1;
        }
        if(pageNumber<1){
            pageNumber = 1;
        }
        for(int i=0;i<totalCount;i++){
            if((pageNumber-1)*totalCount+i>=datas.size()){
                break;
            }
            pageDatas.add(datas.get((pageNumber-1)*totalCount+i));
        }
        return pageDatas;
    }

    public Map getPageBuffer(int pageNumber){
        Map <String,String> pageBuffer = new HashMap();

        if(pageNumber>=2) {
            int before = pageNumber-1;
            pageBuffer.put("上一页",url+before);
        }
        if(datas.size()>totalCount){
            for(int i=1;i<=datas.size()/totalCount+1;i++){
                pageBuffer.put(i+"",url+i);
            }
        }
        if(pageNumber<=datas.size()/totalCount) {
            int next = pageNumber+1;
            pageBuffer.put("下一页",url+next);
        }
        return pageBuffer;
    }



    public int getCurentPage() {
        return curentPage;
    }

    public void setCurentPage(int curentPage) {
        this.curentPage = curentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
