package xml;

import org.dom4j.DocumentException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Contrast {
    public static void contrastXML(File xmlFile1, File xmlFile2) throws IOException {
        ErgodicXML xml = new ErgodicXML();
        StringBuilder sb = new StringBuilder();

        HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        try {
            hashMap1 = xml.analysisXML(xmlFile1, hashMap1);
            hashMap2 = xml.analysisXML(xmlFile2, hashMap2);
        } catch (Exception e) {
            e.printStackTrace();
            sb.append("出错原因： " + e.getMessage() + "\r\n");
        }
        //输出xmlFile2的键值对不正确的，并打印
        Iterator<String> iter = hashMap1.keySet().iterator();
        while (iter.hasNext()) {
            String m1Key = iter.next();
            if (!hashMap1.get(m1Key).equals(hashMap2.get(m1Key))) {//若两个map中相同key对应的value不相等
                sb.append("文件二缺少相关节点以及数据为："+hashMap1.get(m1Key)+"\r\n");
                //System.out.println("差异节点以及值："+hashMap2.get(m1Key)+"\r\n");
            }
        }
        Iterator<String> iter2 = hashMap2.keySet().iterator();
        while (iter2.hasNext()) {
            String m2Key = iter2.next();
            if (hashMap1.get(m2Key) == null && hashMap2.get(m2Key) != null) {
                sb.append("文件二多余或者错误节点为：" + hashMap2.get(m2Key) + "\r\n");
            }
        }
        IsSameFile isSameFile = new IsSameFile();
        FileInputStream fileInputStream1 = new FileInputStream(xmlFile1);
        FileInputStream fileInputStream2 = new FileInputStream(xmlFile2);
        boolean sameFile = isSameFile.isSameFile(fileInputStream1, fileInputStream2);
        if (sameFile) {
            sb.append("结果一致！");
        }
        System.out.println(sb);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String filePath = simpleDateFormat.format(date) + ".txt";
        FileOutputStream fos = new FileOutputStream(filePath);
        fos.write(sb.toString().getBytes());
        fos.close();

    }

    public static void main(String[] args) throws DocumentException, IOException {
        String fileName1 = "D:/test/old1.xml";
        FormatXML format1 = new FormatXML();
        File xmlFile1 = format1.formatXML(fileName1);
        String fileName2 = "D:/test/new1.xml";
        FormatXML formatXML2 = new FormatXML();
        File xmlFile2 = formatXML2.formatXML(fileName2);
        contrastXML(xmlFile1, xmlFile2);
    }
}
