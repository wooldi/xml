package xml;

import org.dom4j.Document;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class XmlMethod {
    public HashMap fun1(Element houseMonitor, String str, HashMap<String, Object> hashMap) {
        Element element = (Element) houseMonitor.selectSingleNode(str);
        if (element == null) {
            String strMap = "标签" + houseMonitor.getName() + "/" + str + "不存在";
            hashMap.put(strMap, strMap);
        } else {
            Iterator<Element> elementIteratorEC01 = element.elementIterator();
            while (elementIteratorEC01.hasNext()) {
                Element temporary = elementIteratorEC01.next();
                if (temporary.getName() != "") {
                    String strMap = element.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                    hashMap.put(strMap, strMap);
                }
            }
        }
        return hashMap;
    }

    public HashMap fun2(Document document, String xpath, String str, HashMap<String, Object> hashMap) {
        List<Element> documentList = document.selectNodes(xpath);
        if (documentList.isEmpty()) {
            String strMap = "标签" + xpath + "不存在";
            hashMap.put(strMap, strMap);
        }
        for (int i = 0; i < documentList.size(); i++) {
            Element houseMonitor = documentList.get(i);
            Element element = (Element) houseMonitor.selectSingleNode(str);
            if (element == null) {
                String strMap = "标签" + xpath + "/" + str + "不存在";
                hashMap.put(strMap, strMap);
            } else {
                Iterator<Element> eB03BIterator = element.elementIterator();
                while (eB03BIterator.hasNext()) {
                    Element temporary = eB03BIterator.next();
                    String strMap = element.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                    hashMap.put(strMap, strMap);
                }
            }
        }
        return hashMap;
    }

    public HashMap fun3(Document document, String xpath, String str1, String str2, String str3, String str4, HashMap<String, Object> hashMap) {
        List<Element> documentList = document.selectNodes(xpath);

        for (int i = 0; i < documentList.size(); i++) {
            Element houseMonitor = documentList.get(i);
            Element eB03B = (Element) houseMonitor.selectSingleNode(str1);
            List<Element> eB03BH = eB03B.elements(str2);
            if (eB03BH.isEmpty()) {
                String strMap = "标签" + xpath + "/" + str1 + "/" + str2 + "不存在";
                hashMap.put(strMap, strMap);
            }
            for (int j = 0; j < eB03BH.size(); j++) {
                Iterator<Element> eB03BHiterator = eB03BH.get(j).elementIterator();
                StringBuffer sb =new StringBuffer();
                sb.append( eB03B.getName() + "/" + eB03BH.get(i).getName() + "/" +"\t\n");
                while (eB03BHiterator.hasNext()) {
                    Element eB03BHnext = eB03BHiterator.next();
                    sb.append(eB03BHnext.getName() + ":" + eB03BHnext.getTextTrim()+"\t\n") ;
                }
                hashMap.put(sb.toString(), sb.toString());
            }
            Element eB03A = (Element) houseMonitor.selectSingleNode(str3);
            if (eB03A == null) {
                String strMap = "标签" + xpath + "/" + str3 + "不存在";
                hashMap.put(strMap, strMap);
            } else {
                Iterator<Element> eB03AIterator = eB03A.elementIterator();
                while (eB03AIterator.hasNext()) {
                    Element temporary = eB03AIterator.next();
                    if (temporary.getName() != str4) {
                        String strMap = eB03A.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                        hashMap.put(strMap, strMap);
                    }
                }
            }
            List<Element> eB03AH = eB03A.elements(str4);
            if (eB03AH.isEmpty()) {
                String strMap = "标签" + xpath + "/" + str3 + "/" + str4 + "不存在";
                hashMap.put(strMap, strMap);
            }
            for (int j = 0; j < eB03AH.size(); j++) {
                Iterator<Element> iterator = eB03AH.get(j).elementIterator();
                StringBuffer sb =new StringBuffer();
                sb.append(eB03B.getName() + "/" + eB03BH.get(i).getName() + "/" +"\t\n");
                while (iterator.hasNext()) {
                    Element eB03BHnext = iterator.next();
                    sb.append(eB03BHnext.getName() + ":" + eB03BHnext.getTextTrim()+"\t\n") ;
                }
                hashMap.put(sb.toString(), sb.toString());
            }
        }
        return hashMap;
    }

    public HashMap fun5(Document document, String str, String str1, HashMap<String, Object> hashMap) {
        List<Element> documentEDA = document.selectNodes(str);
        if (documentEDA.isEmpty()) {
            String strMap = "标签" + str + "不存在";
            hashMap.put(strMap, strMap);
        }
        for (int i = 0; i < documentEDA.size(); i++) {
            Element houseMonitor = documentEDA.get(i);
            Element eD01 = (Element) houseMonitor.selectSingleNode(str1);//获得houseMonitor节点下的id值
            if (documentEDA.isEmpty()) {
                String strMap = "标签" + str + "/" + str1 + "不存在";
                hashMap.put(strMap, strMap);
            } else {
                Iterator<Element> eA01AIterator = eD01.elementIterator();
                while (eA01AIterator.hasNext()) {
                    Element temporary = eA01AIterator.next();
                    String strMap = eD01.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                    hashMap.put(strMap, strMap);
                    // System.out.println();
                }
            }
        }
        return hashMap;
    }

    public HashMap fun6(Document document, String str, HashMap<String, Object> hashMap) {
        List<Element> houseMonitorListEDB = document.selectNodes(str);
        if (houseMonitorListEDB.isEmpty()) {
            String strMap = "标签" + str + "不存在";
            hashMap.put(strMap, strMap);
        }
        for (int i = 0; i < houseMonitorListEDB.size(); i++) {
            Element houseMonitor = houseMonitorListEDB.get(i);
            String strMap = "Document" + "/" + houseMonitor.getName() + ":" + houseMonitor.getTextTrim();
            hashMap.put(strMap, strMap);
            //System.out.println("Document" + "/" + houseMonitor.getName() + "   " + houseMonitor.getTextTrim());
        }
        return hashMap;
    }

    public HashMap fun7(Document document, String xpath, String str1, String str2, String str3, String str4, HashMap<String, Object> hashMap) {
        List<Element> documentEE01 = document.selectNodes(xpath);
        if (documentEE01.isEmpty()) {
            String strMap = "标签" + xpath + "不存在";
            hashMap.put(strMap, strMap);
        }
        for (int i = 0; i < documentEE01.size(); i++) {
            Element houseMonitor = documentEE01.get(i);
            Element element = (Element) houseMonitor.selectSingleNode(str1);
            if (element == null) {
                String strMap = "标签" + xpath + "/" + str1 + "不存在";
                hashMap.put(strMap, strMap);
            } else {
                Iterator<Element> elementIterator = element.elementIterator();
                while (elementIterator.hasNext()) {
                    Element temporary = elementIterator.next();
                    if (temporary.getName() != str2) {
                        String strMap = element.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                        hashMap.put(strMap, strMap);
                        //System.out.println(element.getName() + "/" + temporary.getName() + "   " + temporary.getTextTrim());
                    }
                }
            }
            Element elementEE01B = (Element) houseMonitor.selectSingleNode(str3);
            if (elementEE01B == null) {
                String strMap = "标签" + xpath + "/" + str3 + "不存在";
                hashMap.put(strMap, strMap);
            } else {
                Iterator<Element> elementIteratorEE01B = elementEE01B.elementIterator();
                while (elementIteratorEE01B.hasNext()) {
                    Element temporary = elementIteratorEE01B.next();
                    if (temporary.getName() != str4) {
                        String strMap = elementEE01B.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                        hashMap.put(strMap, strMap);
                        //System.out.println(elementEE01B.getName() + "/" + temporary.getName() + "   " + temporary.getTextTrim());
                    }
                }
            }
            if (elementEE01B.elements(str4) != null) {
                List<Element> elementList = elementEE01B.elements(str4);
                if (elementList.isEmpty()) {
                    String strMap = "标签" + xpath + "/" + str3 + "/" + str4 + "不存在";
                    hashMap.put(strMap, strMap);
                }
                for (int j = 0; j < elementList.size()-1; j++) {
                    Iterator<Element> iterator = elementList.get(j).elementIterator();
                    StringBuffer sb = new StringBuffer();
                    sb.append( elementEE01B.getName() + "/" + elementList.get(i).getName() + "/"+"\t\n");
                    while (iterator.hasNext()) {
                        Element elementHnext = iterator.next();
                        sb.append(elementHnext.getName() + ":" + elementHnext.getTextTrim()+"\t\n") ;
                    }
                    hashMap.put(sb.toString(), sb.toString());
                }
            }
        }
        return hashMap;
    }

    //三层嵌套
    public HashMap fun8(HashMap<String, Object> hashMap, Document document, String... str) {
        for (int i = 0; i < str.length; i++) {
            List<Element> houseMonitorListEFB = document.selectNodes(str[0]);//找到位于idcMonitor下的houseMonitor节点
            if (houseMonitorListEFB.isEmpty()) {
                String strMap = "标签" + str[0] + "不存在";
                hashMap.put(strMap, strMap);
            }
            for (int j = 0; j < houseMonitorListEFB.size(); j++) {
                Element houseMonitor = houseMonitorListEFB.get(j);
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    Element eF02 = (Element) houseMonitor.selectSingleNode(str[i]);//获得houseMonitor节点下的id值
                    if (eF02 == null) {
                        String strMap = "标签" + str[0] + "/" + str[i] + "不存在";
                        hashMap.put(strMap, strMap);
                    } else {
                        Iterator<Element> eA01AIterator = eF02.elementIterator();
                        while (eA01AIterator.hasNext()) {
                            Element temporary = eA01AIterator.next();
                            String strMap = eF02.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
