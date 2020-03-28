package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ErgodicXML {
    public HashMap analysisXML(File xmlFile, HashMap<String, Object> hashMap) throws DocumentException {
        SAXReader saxread = new SAXReader();
        if (xmlFile.exists()) {
            XmlMethod xmlfun = new XmlMethod();
            Document document = saxread.read(xmlFile);// 读取XML文件;
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EAA/EA01", "EA01A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EAA/EA01", "EA01E");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EAA/EA01", "EA01C");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EAA/EA01/EA01C", "EA01CH");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EAA/EA01", "EA01D");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EAA/EA01", "EA01B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EBA/EB01", "EB01A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EBA/EB01", "EB01B");
            List<Element> documentEBBEB02 = document.selectNodes("//Document/EBB/EB02");
            if (documentEBBEB02.isEmpty()) {
                //String str = "标签//Document/EBB/EB02不存在";
                String str = Result.EB02;
                hashMap.put(str, str);
            }
            for (int i = 0; i < documentEBBEB02.size(); i++) {
                Element houseMonitor = documentEBBEB02.get(i);
                Element eB02A = (Element) houseMonitor.selectSingleNode("EB02A");
                if (eB02A == null) {
                    //String str = "标签//Document/EBB/EB02/EB02A不存在";
                    String str = Result.EB02A;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> eB02AIterator = eB02A.elementIterator();
                    while (eB02AIterator.hasNext()) {
                        Element temporary = eB02AIterator.next();
                        if (temporary.getName() != "EB02AH") {
                            String strMap = eB02A.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                List<Element> eB02AH = eB02A.elements("EB02AH");
                if (eB02AH.isEmpty()) {
                    //String str = "标签//Document/EBB/EB02/EB02A/EB02AH不存在";
                    String str = Result.EB02AH;
                    hashMap.put(str, str);
                }
                for (int j = 0; j < eB02AH.size(); j++) {
                    Iterator<Element> eB02AHiterator = eB02AH.get(j).elementIterator();
                    StringBuffer sb= new StringBuffer();
                    sb.append(eB02A.getName() + "/" + eB02AH.get(i).getName() + "/" +"\t\n");
                    while (eB02AHiterator.hasNext()) {
                        Element eB02AHnext = eB02AHiterator.next();
                        sb.append(eB02AHnext.getName()  + ":" + eB02AHnext.getTextTrim()+"\t\n");
                    }
                    hashMap.put(sb.toString(), sb.toString());
                }
                Element eB02B = (Element) houseMonitor.selectSingleNode("EB02B");
                if (eB02B == null) {
                    //String str = "标签//Document/EBB/EB02/EB02B不存在";
                    String str = Result.EB02B;
                   hashMap.put(str, str);
                } else {
                    Iterator<Element> eB02BIterator = eB02B.elementIterator();
                    while (eB02BIterator.hasNext()) {
                        Element temporary = eB02BIterator.next();
                        if (temporary.getName() != "EB02BH") {
                            String strMap = eB02A.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                List<Element> eB02BH = eB02B.elements("EB02BH");
                if (eB02BH == null) {
                    //String str = "标签//Document/EBB/EB02/eB02B/EB02BH不存在";
                    String str = Result.EB02BH;
                    hashMap.put(str, str);
                }
                for (int j = 0; j < eB02BH.size(); j++) {
                    Iterator<Element> eB02BHiterator = eB02BH.get(j).elementIterator();
                    StringBuffer sb= new StringBuffer();
                    sb.append(eB02B.getName() + "/" + eB02BH.get(i).getName() + "/" );
                    while (eB02BHiterator.hasNext()) {
                        Element eB02BHnext = eB02BHiterator.next();
                        sb.append(eB02BHnext.getName() + ":" + eB02BHnext.getTextTrim()) ;
                    }
                    hashMap.put(sb.toString(), sb.toString());
                }
            }
            List<Element> documentEBCEB03 = document.selectNodes("//Document/EBC/EB03");
            if (documentEBCEB03.isEmpty()) {
                //String str = "标签//Document/EBC/EB03不存在";
                String str = Result.EB03;
                hashMap.put(str, str);
            }
            for (int i = 0; i < documentEBCEB03.size(); i++) {
                Element houseMonitor = documentEBCEB03.get(i);
                Element eB03B = (Element) houseMonitor.selectSingleNode("EB03B");
                if (eB03B == null) {
                    // String str = "标签//Document/EBC/EB03/EB03B不存在";
                    String str = Result.EB03B;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> eB03BIterator = eB03B.elementIterator();
                    while (eB03BIterator.hasNext()) {
                        Element temporary = eB03BIterator.next();
                        if (temporary.getName() != "EB03BH") {
                            String strMap = eB03B.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                List<Element> eB03BH = eB03B.elements("EB03BH");
                if (eB03BH.isEmpty()) {
                    // String str = "标签//Document/EBC/EB03/EB03B/EB03BH不存在";
                    String str = Result.EB03BH;
                    hashMap.put(str, str);
                }
                for (int j = 0; j < eB03BH.size(); j++) {
                    Iterator<Element> eB03BHiterator = eB03BH.get(j).elementIterator();
                    StringBuffer sb = new StringBuffer();
                    sb.append(eB03B.getName() + "/" + eB03BH.get(i).getName() + "/"+"\t\n");
                    while (eB03BHiterator.hasNext()) {
                        Element eB03BHnext = eB03BHiterator.next();
                        sb.append( eB03BHnext.getName() + ":" + eB03BHnext.getTextTrim()+"\t\n");
                    }
                    hashMap.put(sb.toString(), sb.toString());
                }
                Element eB03A = (Element) houseMonitor.selectSingleNode("EB03A");
                if (eB03A == null) {
                    // String str = "标签//Document/EBC/EB03/EB03A不存在";
                    String str = Result.EB03A;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> eB03AIterator = eB03A.elementIterator();
                    while (eB03AIterator.hasNext()) {
                        Element temporary = eB03AIterator.next();
                        if (temporary.getName() != "EB03AH") {
                            String strMap = eB03A.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                List<Element> eB03AH = eB03A.elements("EB03AH");
                if (eB03AH.isEmpty()) {
                    //String str = "标签//Document/EBC/EB03/EB03A/EB03AH不存在";
                    String str = Result.EB03AH;
                    hashMap.put(str, str);
                }
                for (int j = 0; j < eB03AH.size(); j++) {
                    Iterator<Element> iterator = eB03AH.get(j).elementIterator();
                    StringBuffer sb= new StringBuffer();
                    sb.append(eB03B.getName() + "/" + eB03BH.get(i).getName() + "/"+"\t\n");
                    while (iterator.hasNext()) {
                        Element eB03BHnext = iterator.next();
                        sb.append( eB03BHnext.getName() + ":" + eB03BHnext.getTextTrim()+"\t\n");
                    }
                    hashMap.put(sb.toString(), sb.toString());
                }
            }
            hashMap = xmlfun.fun2(document, "//Document/EBD", "EB04", hashMap);
            hashMap = xmlfun.fun3(document, "//Document/EBE/EB05", "EB05B", "EB05BH", "EB05A", "EB05AH", hashMap);
            List<Element> documentECA = document.selectNodes("//Document/ECA");
            if (documentECA.isEmpty()) {
                //String str = "标签//Document/ECA不存在";
                String str = Result.ECA;
                hashMap.put(str, str);
            }
            for (int i = 0; i < documentECA.size(); i++) {
                Element houseMonitor = documentECA.get(i);
                Element element = (Element) houseMonitor.selectSingleNode("EC05");
                if (element == null) {
                    //String str = "标签//Document/ECA/EC05不存在";
                    String str = Result.EC05;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> elementIterator = element.elementIterator();
                    while (elementIterator.hasNext()) {
                        Element temporary = elementIterator.next();
                        if (temporary.getName() != "EC050H") {
                            String strMap = element.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                if (element.elements("EC050H") != null) {
                    List<Element> elementList = element.elements("EC050H");
                    if (elementList.isEmpty()) {
                        // String str = "标签//Document/ECA/EC05/EC050H不存在";
                        String str = Result.EC050H;
                        hashMap.put(str, str);
                    }
                    for (int j = 0; j < elementList.size(); j++) {
                        Iterator<Element> iterator = elementList.get(j).elementIterator();
                        StringBuffer sb = new StringBuffer();
                        sb.append(element.getName() + "/" + elementList.get(i).getName() + "/" +"\t\n");
                        while (iterator.hasNext()) {
                            Element elementHnext = iterator.next();
                            sb.append(elementHnext.getName() + ":" + elementHnext.getTextTrim()+"\t\n");
                        }
                        hashMap.put(sb.toString(), sb.toString());
                    }
                }
                Element elementEC02 = (Element) houseMonitor.selectSingleNode("EC02");
                if (elementEC02 == null) {
                    //String str = "标签//Document/ECA/EC02不存在";
                    String str = Result.EC02;
                   hashMap.put(str, str);
                } else {
                    Iterator<Element> elementIteratorEC02 = elementEC02.elementIterator();
                    while (elementIteratorEC02.hasNext()) {
                        Element temporary = elementIteratorEC02.next();
                        if (temporary.getName() != "EC020H") {
                            String strMap = elementEC02.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                           hashMap.put(strMap, strMap);
                        }
                    }
                }
                if (elementEC02.elements("EC020H") != null) {
                    List<Element> elementList = elementEC02.elements("EC020H");
                    if (elementList.isEmpty()) {
                        //String str = "标签//Document/ECA/EC02/EC020H不存在";
                        String str = Result.EC020H;
                        hashMap.put(str, str);
                    }
                    for (int j = 0; j < elementList.size(); j++) {
                        Iterator<Element> iterator = elementList.get(j).elementIterator();
                        StringBuffer sb = new StringBuffer();
                        sb.append(elementEC02.getName() + "/" + elementList.get(i).getName() + "/"+"\t\n");
                        while (iterator.hasNext()) {
                            Element elementHnext = iterator.next();
                            sb.append(elementHnext.getName() + ":" + elementHnext.getTextTrim()+"\t\n") ;
                        }
                        hashMap.put(sb.toString(), sb.toString());
                    }
                }
                Element elementEC04 = (Element) houseMonitor.selectSingleNode("EC04");
                if (elementEC04 == null) {
                    //String str = "标签//Document/ECA/EC04不存在";
                    String str = Result.EC04;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> elementIteratorEC04 = elementEC04.elementIterator();
                    while (elementIteratorEC04.hasNext()) {
                        Element temporary = elementIteratorEC04.next();
                        if (temporary.getName() != "") {
                            String strMap = elementEC04.getName() + "/" + temporary.getName() + "   " + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                Element elementEC03 = (Element) houseMonitor.selectSingleNode("EC03");
                if (elementEC04 == null) {
                    String str = Result.EC03;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> elementIteratorEC03 = elementEC03.elementIterator();
                    while (elementIteratorEC03.hasNext()) {
                        Element temporary = elementIteratorEC03.next();
                        if (temporary.getName() != "EC030H") {
                            String strMap = elementEC03.getName() + "/" + temporary.getName() + "   " + temporary.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                if (elementEC03.elements("EC030H") != null) {
                    List<Element> elementList = elementEC03.elements("EC030H");
                    for (int j = 0; j < elementList.size(); j++) {
                        Iterator<Element> iterator = elementList.get(j).elementIterator();
                        while (iterator.hasNext()) {
                            Element elementHnext = iterator.next();
                            String strMap = elementEC03.getName() + "/" + elementList.get(i).getName() + "/" + elementHnext.getName() + "[" + j + "]" + "   " + elementHnext.getTextTrim();
                            hashMap.put(strMap, strMap);
                        }
                    }
                }
                hashMap = xmlfun.fun1(houseMonitor, "EC01", hashMap);
            }
            hashMap = xmlfun.fun5(document, "//Document/EDA", "ED01", hashMap);
            hashMap = xmlfun.fun6(document, "//Document/EDB", hashMap);
            hashMap = xmlfun.fun6(document, "//Document/EDC", hashMap);
            hashMap = xmlfun.fun6(document, "//Document/EDD", hashMap);
            hashMap = xmlfun.fun7(document, "//Document/EEA/EE01", "EE01A", "", "EE01B", "EE01BH", hashMap);
            hashMap = xmlfun.fun6(document, "//Document/EFA", hashMap);
            List<Element> houseMonitorListEFB = document.selectNodes("//Document/EFB");//找到位于idcMonitor下的houseMonitor节点
            if (houseMonitorListEFB.isEmpty()) {
                String str = Result.EFB;
                hashMap.put(str, str);
            }
            for (int i = 0; i < houseMonitorListEFB.size(); i++) {
                Element houseMonitor = houseMonitorListEFB.get(i);
                Element eF02 = (Element) houseMonitor.selectSingleNode("EF02");//获得houseMonitor节点下的id值
                if (eF02 == null) {
                    String str = Result.EF02;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> eA01AIterator = eF02.elementIterator();
                    while (eA01AIterator.hasNext()) {
                        Element temporary = eA01AIterator.next();
                        String strMap = eF02.getName() + "/" + temporary.getName() + ":" + temporary.getTextTrim();
                        hashMap.put(strMap, strMap);
                    }
                }
                Element eF03 = (Element) houseMonitor.selectSingleNode("EF03");//获得houseMonitor节点下的id值
                if (eF03 == null) {
                    //String str = "标签//Document/EF03不存在";
                    String str = Result.EF03;
                    hashMap.put(str, str);
                } else {
                    Iterator<Element> e03Iterator = eF03.elementIterator();
                    while (e03Iterator.hasNext()) {
                        Element temporary = e03Iterator.next();
                        String strMap = eF03.getName() + "/" + temporary.getName() + "   " + temporary.getTextTrim();
                       hashMap.put(strMap, strMap);
//                    System.out.println(eF03.getName() + "/" + temporary.getName() + "   " + temporary.getTextTrim());
                    }
                }
            }
            hashMap = xmlfun.fun2(document, "//Document/EFC", "EF04", hashMap);
            hashMap = xmlfun.fun7(document, "//Document/EFD/EF05", "EF05A", "", "EF05B", "EF05BH", hashMap);
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EFE", "EF06", "EF07", "EF08", "EF09");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EFF", "EF13", "EF12", "EF11");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EFG", "EF14");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG01", "EG01A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG01", "EG01B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG02", "EG02A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG02", "EG02B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG03", "EG03B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG03", "EG03A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG04", "EG04B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG04", "EG04A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG05", "EG05B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG05", "EG05A");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG06", "EG06B");
            hashMap = xmlfun.fun8(hashMap, document, "//Document/EGA/EG06", "EG06A");
            hashMap = xmlfun.fun6(document, "//Document/EHA", hashMap);
            List<Element> houseMonitorListEIA = document.selectNodes("//Document");//找到位于idcMonitor下的houseMonitor节点
            for (int i = 0; i < houseMonitorListEIA.size(); i++) {
                Element element = houseMonitorListEIA.get(i);
                Element eIA = (Element) element.selectSingleNode("EIA");
                if (eIA == null) {
                    String str = Result.EIA;
                    hashMap.put(str, str);
                }
                List<Element> eIAList = eIA.elements("EI01");
                if (eIAList.isEmpty()) {
                    String str = Result.EI01;
                    hashMap.put(str, str);
                }
                for (int j = 0; j < eIAList.size(); j++) {
                    Iterator<Element> eIAiterator = eIAList.get(j).elementIterator();
                    StringBuffer sb = new StringBuffer();
                    sb.append(eIA.getName() + "/" + eIAList.get(i).getName() + "/"+"\r\n");
                    while (eIAiterator.hasNext()) {
                        Element eIAnext = eIAiterator.next();
                        sb.append(eIAnext.getName()  + ":" + eIAnext.getTextTrim()+"\r\n");
                    }
                    hashMap.put(sb.toString(), sb.toString());
                }
            }
        }
        return hashMap;
    }
}

