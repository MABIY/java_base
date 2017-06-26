package 第八章;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

public class YouSiGetRewardUtil {


    private static final String URL = "http://demo.eswapi.com";
    private static final String APPKEY = "DEMO_Pass_Edrt%Rt";
    private static final String USERID = "107";
    private static final String PRODUCTID = "10001001";


    public static String generateSign(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder builder = new StringBuilder();
        map.put("APPKEY", APPKEY);
        List<String> signParams = new ArrayList<String>();
        for (String key : map.keySet()) {
            if (!key.equals("recallurl")) { //去除 不必要加入验证的参数
                signParams.add(map.get(key));
            }
        }
        String[] valueArr = signParams.toArray(new String[1]);
        Arrays.sort(valueArr);
        for (String value : valueArr) {
            builder.append(value);
        }
        map.remove("APPKEY");
        return Md5(builder.toString(), "UTF-8");
    }

    /**
     * md5加密
     *
     * @param plainText
     * @param charset
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String Md5(String plainText, String charset) throws UnsupportedEncodingException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes(charset));
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }
        return "null";
    }

    public static String send(String url, Map<String, String> paramMap) {
        HttpURLConnection url_con = null;
        String responseContext = null;
        long time = System.currentTimeMillis();
        long thread = Thread.currentThread().getId();
        StringBuffer params = new StringBuffer();
        try {
            for (String key : paramMap.keySet()) {
                params.append(key);
                params.append("=");
                params.append(URLEncoder.encode(paramMap.get(key), "UTF-8"));
                params.append("&");
            }
            if (params.length() > 0) {
                params.append("sign=" + generateSign(paramMap));
            }
            URL reqURL = new URL(url + "?" + params);
            System.out.println("[Thread-" + thread + "]--" + time + "--send request :" + reqURL);
            url_con = (HttpURLConnection) reqURL.openConnection();
            url_con.setDoOutput(true);
            url_con.setChunkedStreamingMode(0);
            url_con.setDoOutput(true);
            url_con.setDoInput(true);
            url_con.setRequestMethod("POST");
            url_con.setConnectTimeout(10000);
            url_con.setReadTimeout(1000);
            InputStream in = url_con.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            String line = null;
            StringBuffer tempStr = new StringBuffer();
            String crlf = System.getProperty("Line.separator");
            int i = 0;
            while ((line = reader.readLine()) != null) {
                if (i > 0) {
                    tempStr.append(crlf);
                }
                tempStr.append(line);
            }
            responseContext = tempStr.toString();
            reader.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        System.out.print(responseContext);
        return responseContext;
    }

    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("cid", "107");
        testMap.put("productid", "10004101");
        testMap.put("orderid", "201603291033321924424");
        testMap.put("timestamps", new SimpleDateFormat("YYYYMMddHHmmssSSS").format(new Date()));
        testMap.put("mob", "13482470266");
        testMap.put("accountnum", "18616778386");
        send(URL + "/API/AccountRec.ashx", testMap);
    }


}

