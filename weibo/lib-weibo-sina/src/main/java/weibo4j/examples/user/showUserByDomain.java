package weibo4j.examples.user;

import weibo4j.Users;
import weibo4j.Weibo;
import weibo4j.examples.Log;
import weibo4j.model.User;
import weibo4j.model.WeiboException;

public class showUserByDomain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String access_token = "36688beae48bcb9d4b6aebdaf044c244";
		Weibo weibo = new Weibo();
		weibo.setToken(access_token);
		String domain  = "yingrui.f";
		Users um = new Users();
		try {
			User user = um.showUserByDomain(domain);
			Log.logInfo(user.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
