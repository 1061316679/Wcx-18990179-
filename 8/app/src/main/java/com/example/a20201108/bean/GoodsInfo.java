package com.example.a20201108.bean;

import com.example.a20201108.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "T34", "狮-式", "IS-6", "88毫米-猎虎", "T26E4", "FCM 50t","111","222"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "T34重型坦克为美国二战时期研制的重型试验坦克",
            "二战纳粹德国研发的一款超重型坦克。",
            "苏联在第二次世界大战期间研制的一型重型坦克",
            "是纳粹德国生产设计的一种重型坦克歼击车",
            "T26E4 超级潘兴是改造的一种潘兴坦克",
            "计划用于取代AMX-50t，集合了二战前法国坦克工业和德国坦克的优点设计而成",
            "111",
            "222"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6888, 3999, 2999, 2899, 2698, 2098,111,222};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.t34, R.drawable.sizi, R.drawable.is6,
            R.drawable.liehu, R.drawable.t264, R.drawable.fcm50t,R.drawable.t34,R.drawable.t34,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.t34, R.drawable.sizi, R.drawable.is6,
            R.drawable.liehu, R.drawable.t264, R.drawable.fcm50t,R.drawable.t34,R.drawable.t34,
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
