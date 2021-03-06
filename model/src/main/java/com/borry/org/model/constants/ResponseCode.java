package com.borry.org.model.constants;

/**
 * 异常原因枚举类
 * 
 * @author 陈杰
 * 
 */
public enum ResponseCode {
	CODE_200,CODE_201,CODE_202, CODE_301, CODE_302, CODE_303, CODE_304, CODE_305, CODE_306, CODE_307, CODE_308, CODE_309, CODE_310,CODE_311,CODE_312,CODE_313,CODE_314,CODE_315,CODE_316,CODE_317,CODE_318,CODE_319,CODE_320,CODE_321,CODE_322,CODE_323,CODE_324,CODE_325,CODE_326,CODE_327,CODE_328,CODE_329,CODE_330,CODE_331,CODE_332,CODE_333,CODE_334,CODE_335,CODE_336,CODE_337,CODE_338,CODE_339,CODE_340,CODE_341,CODE_342,CODE_343,CODE_344,CODE_345,CODE_450,CODE_451,CODE_452,CODE_453,CODE_454,CODE_455,CODE_456,CODE_500,CODE_501;

	public String toString() {
		switch (this) {
		case CODE_200:
			return "成功";
		case CODE_201:
			return "视频已经赞过";
		case CODE_202:
			return "视频已经收藏过";
		case CODE_301:
			return "该手机号码已被注册";
		case CODE_302:
			return "该手机号码未注册";	
		case CODE_303:
			return "验证码失效";
		case CODE_304:
			return "登录认证码失效";
		case CODE_305:
			return "该用户不存在";
		case CODE_306:
			return "该好友不存在";	
		case CODE_307:
			return "上传个人头像失败";	
		case CODE_308:
			return "上传个人背景图片失败";	
		case CODE_309:
			return "该操作必须是好友";
		case CODE_310:
			return "黑名单用户不能为空";	
		case CODE_311:
			return "重复订阅";	
		case CODE_312:
			return "参数错误";	
		case CODE_313:
			return "消息已被删除";
		case CODE_314:
			return "认证码失效";	
		case CODE_315:
			return "对方关闭了评论功能";
		case CODE_316:
			return "对方不允许添加好友";
		case CODE_317:
			return "重复添加黑名单";	
		case CODE_318:
			return "群组创建失败，您和其他用户非好友";
		case CODE_319:
			return "群组创建失败，您尚未添加好友";
		case CODE_320:
			return "群组创建失败，您在其他好友的黑名单中";
		case CODE_321:
			return "登录密码错误";	
		case CODE_322:
			return "今天修改密码次数已达3次";	
		case CODE_323:
			return "今天找回密码次数已达3次,请明天再试";	
		case CODE_324:
			return "群不存在或您不是该群成员";
		case CODE_325:
			return "视频审核中";	
		case CODE_326:
			return "视频审核未通过";	
		case CODE_327:
			return "您提交的内容包含敏感词汇";	
		case CODE_328:
			return "今天发送短信次数已达上限";	
		case CODE_329:
			return "请求已过期";	
		case CODE_330:
			return "手机号错误";		
		case CODE_331:
			return "文件上传失败";	
		case CODE_332:
			return "视频已经删除";	
		case CODE_333:
			return "重了，制作人最怕抄袭";
		case CODE_334:
			return "短信发送失败";
		case CODE_335:
			return "注册获取验证码已超3次，请明天再试";
		case CODE_336:
			return "找回密码获取验证码已超3次，请明天再试";
		case CODE_337:
			return "你还未赞过本视频";	
		case CODE_338:
			return "你还未收藏过本视频";	
		case CODE_339:
			return "你已经被禁言";	
		case CODE_340:
			return "你已经被禁号";	
		case CODE_341:
			return "不能订阅自己";
		case CODE_342:
			return "已订阅该活动";
		case CODE_343:
			return "不能转发自己的视频";
		case CODE_344:
			return "您已转发过该视频";
		case CODE_345:
			return "转发的视频不存在";
		case CODE_450:
			return "参数错误";	
		case CODE_451:
			return "用户不存在";	
		case CODE_452:
			return "tokenid验证失败";
		case CODE_453:
			return "登录已过期";
		case CODE_454:
			return "您的帐号已在其它地方登陆";	
		case CODE_455:
			return "属性验证失败";
		case CODE_456:
			return "新浪TOKEN为空";
		case CODE_500:
			return "服务器内部错误";	
		case CODE_501:
			return "用户积分奖励已到上限5000";	
		default:
			return "成功";
		}
	}

	public int toCode() {
		switch (this) {
		case CODE_200:
			return 200;
		case CODE_201:
			return 201;
		case CODE_202:
			return 202;
		case CODE_301:
			return 301;
		case CODE_302:
			return 302;
		case CODE_303:
			return 303;
		case CODE_304:
			return 304;
		case CODE_305:
			return 305;	
		case CODE_306:
			return 306;	
		case CODE_307:
			return 307;	
		case CODE_308:
			return 308;	
		case CODE_309:
			return 309;	
		case CODE_310:
			return 310;	
		case CODE_311:
			return 311;
		case CODE_312:
			return 312;	
		case CODE_313:
			return 313;
		case CODE_314:
			return 314;	
		case CODE_315:
			return 315;
		case CODE_316:
			return 316;	
		case CODE_317:
			return 317;	
		case CODE_318:
			return 318;
		case CODE_319:
			return 319;
		case CODE_320:
			return 320;	
		case CODE_321:
			return 321;		
		case CODE_322:
			return 322;		
		case CODE_323:
			return 323;
		case CODE_324:
			return 324;
		case CODE_325:
			return 325;
		case CODE_326:
			return 326;
		case CODE_327:
			return 327;
		case CODE_328:
			return 328;
		case CODE_329:
			return 329;
		case CODE_330:
			return 330;
		case CODE_331:
			return 331;
		case CODE_332:
			return 332;
		case CODE_333:
			return 333;
		case CODE_334:
			return 334;
		case CODE_335:
			return 335;
		case CODE_336:
			return 336;
		case CODE_337:
			return 337;
		case CODE_338:
			return 338;
		case CODE_339:
			return 339;
		case CODE_340:
			return 340;
		case CODE_341:
			return 341;
		case CODE_342:
			return 342;
		case CODE_343:
			return 343;
		case CODE_344:
			return 344;
		case CODE_345:
			return 345;
		case CODE_450:
			return 450;	
		case CODE_451:
			return 451;	
		case CODE_452:
			return 452;	
		case CODE_453:
			return 453;	
		case CODE_454:
			return 454;	
		case CODE_455:
			return 455;	
		case CODE_456:
			return 456;	
		case CODE_500:
			return 500;	
		case CODE_501:
			return 501;	
		default:
			return 200;
		}
	}

}
