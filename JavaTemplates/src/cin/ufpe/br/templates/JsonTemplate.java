package cin.ufpe.br.templates;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonTemplate {

	public static void main(String[] args) {

		String s = "["
				+ "{"
				+ "\"id\": \"platform%2Fexternal%2Fclang~lldb-master-dev~I63ca7cf7493424653ea67f7637696b5846647d61\","
				+ "\"project\": \"platform/external/clang\","
				+ "\"branch\": \"lldb-master-dev\","
				+ "\"hashtags\": [],"
				+ "\"change_id\": \"I63ca7cf7493424653ea67f7637696b5846647d61\","
				+ "\"subject\": \"[Sema] Teach CheckPlaceholderExpr about unaddressable functions. am: 35470639d3\","
				+ "\"status\": \"MERGED\","
				+ "\"created\": \"2016-06-08 01:14:05.745000000\","
				+ "\"updated\": \"2016-06-08 01:14:12.690000000\","
				+ "\"submitted\": \"2016-06-08 01:14:12.690000000\","
				+ "\"submittable\": false,"
				+ "\"insertions\": 0,"
				+ "\"deletions\": 0,"
				+ "\"_number\": 236912,"
				+ "\"owner\": "
					+ "{\"_account_id\": 11111}"
				+ "},"
				+ "{"
				+ "\"id\": \"platform%2Fexternal%2Fclang~lldb-master-dev~I6ea3d557a1dcd0ff9b7bbf66a572fb7b9a866235\","
				+ "\"project\": \"platform/external/clang\","
				+ "\"branch\": \"lldb-master-dev\","
				+ "\"hashtags\": [],"
				+ "\"change_id\": \"I6ea3d557a1dcd0ff9b7bbf66a572fb7b9a866235\","
				+ "\"subject\": \"[ItaniumMangle] Mangle dependent __underlying_type correctly am: 4ecfbf35ef\","
				+ "\"status\": \"MERGED\","
				+ "\"created\": \"2016-06-08 01:14:05.745000000\","
				+ "\"updated\": \"2016-06-08 01:14:10.103000000\","
				+ "\"submitted\": \"2016-06-08 01:14:10.103000000\","
				+ "\"submittable\": false,"
				+ "\"insertions\": 0,"
				+ "\"deletions\": 0,"
				+ "\"_number\": 236911,"
				+ "\"owner\": "
					+ "{\"_account_id\": 2222}"
				+ "}"
				+ "]";

		JsonArray ja = (JsonArray) new JsonParser().parse(s);

		for (int i = 0, size = ja.size(); i < size; i++) {
			JsonObject o = ja.get(i).getAsJsonObject();
			System.out.println(o.get("id").getAsString());
			System.out.println(o.get("project").getAsString());
			System.out.println(o.get("_number").getAsString());
			System.out.println(o.get("status").getAsString());
			System.out.println(o.get("owner"));
		}
	}
}
