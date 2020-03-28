package xml;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatXML {
        public File formatXML(String fileName) throws IOException {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;
            StringBuffer sb = new StringBuffer();
            while ((str = in.readLine()) != null) {
                // System.out.println(str);
                sb.append(str);
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            File dir = new File("xml");
            if (!dir.exists()){
                dir.mkdirs();
            }

            String filePath = "xml/"+simpleDateFormat.format(date) + ".xml";
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(sb.toString().getBytes());
            fos.close();
            File file = new File(filePath);
            return file;
        }


}
