package com.xplmc.learning.hbase.region;

import org.apache.hadoop.hbase.HRegionInfo;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * demo for learning RegionInfo
 *
 * @author luke
 * @date 2018/9/4
 */
public class RegionInfoDemo {

    public static void main(String[] args) {
        TableName tableName = TableName.valueOf("test_serial");
        byte[] regionName = HRegionInfo.createRegionName(tableName, null,
                "1535202011867", true);
        System.out.println(Bytes.toString(regionName));
    }

}
