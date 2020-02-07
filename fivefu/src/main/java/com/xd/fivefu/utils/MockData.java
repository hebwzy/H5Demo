package com.xd.fivefu.utils;


import com.xd.fivefu.bean.CatInfo;

/**
 * Desc:
 * <p> @Author: ZhouTao
 * <p>Date: 2020/1/18
 * <p>Copyright: Copyright (c) 2016-2020
 * <p>Company: @小牛科技
 * <p>Email:zhoutao@xiaoniuhy.com
 * <p>Update Comments:
 */
public class MockData {
    CatInfo[] catList = new CatInfo[12];
    private static final MockData ourInstance = new MockData();

    public static MockData getInstance() {
        return ourInstance;
    }

    private MockData() {
    }

    private void mockData() {
        catList[0] = new CatInfo(1);
        catList[1] = new CatInfo(1);
        catList[2] = new CatInfo(2);
        catList[3] = new CatInfo(3);
        catList[4] = new CatInfo(3);
        catList[5] = new CatInfo(3);
        catList[6] = new CatInfo(4);
        catList[7] = new CatInfo(4);
        catList[8] = new CatInfo(4);
        catList[9] = new CatInfo(4);

    }

    public CatInfo[] getCatList() {
        return catList;
    }

    public boolean addData() {
        for (int i = 0; i < catList.length; i++) {
            CatInfo catInfo = catList[i];
            if (catInfo==null) {
                CatInfo catInfo1 = new CatInfo(1);
                catInfo1.newCat = true;
                catList[i] = catInfo1;
                return true;
            }
        }
        return false;
    }
}
