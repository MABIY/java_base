import java.util.HashMap;
import java.util.ArrayList;
public class DepartmentsMap {
	public  static HashMap<String, String> map = new HashMap<String, String>() {
		{
			put("name", "test");
			put("age", "20");
		}
	};
 /*   public static  HashMap<String, String> departmentsmap = new HashMap<String, String>() {
        *//**
		 * 
		 *//*
		private static final long serialVersionUID = 1L;

		{
        	departmentsmap.put("D1001","儿科");
        	departmentsmap.put("D1002","儿保科");
        	departmentsmap.put("D1003","消化科");
        	departmentsmap.put("D1004","皮肤科");
        	departmentsmap.put("D1005","新生儿科");
        	departmentsmap.put("D1006","呼吸科");
        	departmentsmap.put("D1007","PICU");
        	departmentsmap.put("D1008","小儿外科");
        	departmentsmap.put("D1009","营养科");
        	departmentsmap.put("D1010","免疫科");
        	departmentsmap.put("D1011","CICU");
        	departmentsmap.put("D1012","NICU");
        	departmentsmap.put("D1013","ICU");
        	departmentsmap.put("D1014","医务科");
        	departmentsmap.put("D1015","中医儿科");
        	departmentsmap.put("D1016","感染科");
        	departmentsmap.put("D1017","皮科");
        	departmentsmap.put("D1018","早产科");
        	departmentsmap.put("D1019","儿外科");
        	departmentsmap.put("D1020","心外科");
        	departmentsmap.put("D1021","肾病科");
        	departmentsmap.put("D1022","门诊轮值");
        	departmentsmap.put("D1023","输液室");
        	departmentsmap.put("D1024","急救科");
        	departmentsmap.put("D1025","心内科");
        	departmentsmap.put("D1026","心脏外科");
        	departmentsmap.put("D1027","血液科");
        	departmentsmap.put("D1028","泌尿外科");
        	departmentsmap.put("D1029","心胸外科");
        	departmentsmap.put("D1030","中医科");
        	departmentsmap.put("D1031","其他科室");
        }
    };*/

	public static String  getNameByDeptId(String key) {
		return map.get(key);
	}

	public static void main(String[] args) {
		System.out.println(DepartmentsMap.getNameByDeptId("D1031"));
	}
}
