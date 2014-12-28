package weibo4j.examples.user;

import weibo4j.Users;
import weibo4j.Weibo;
import weibo4j.examples.Log;
import weibo4j.model.User;
import weibo4j.model.WeiboException;

public class ShowUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String access_token = "ec7b205516a2e92c27af9c807070afa0";
		Weibo weibo = new Weibo();
		weibo.setToken(access_token);
		String uid = "2420304867";
		Users um = new Users();
		try {
			User user = um.showUserById(uid);
			Log.logInfo(user.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
