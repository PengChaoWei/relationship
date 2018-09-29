package chao.com.cn.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import chao.com.cn.relationship.common.JsonResult;
import chao.com.cn.relationship.dao.UserMapper;
import chao.com.cn.relationship.model.User;


@Controller
public class LoginController {
	
	@Autowired
	private UserMapper usermapper;
	
	
	@RequestMapping(path = {"/login"})
    public String HelloSpring (){
        System.out.println("hello spring boot");
        return "login";
    }
    
    @RequestMapping(path = {"/login"},method=RequestMethod.POST)
    @ResponseBody
	public JsonResult login(@ModelAttribute User user) {
		JsonResult result = JsonResult.createSuccess();
		System.out.println("登陆账号:"+user.getAccount()+"==密码:"+user.getPassword());
		User bean = usermapper.selectByPrimaryKey(user);
		System.out.println("登陆账号:"+bean.getAccount()+"==密码:"+bean.getPassword());
		result.setCode(1);
		result.setMsg("登陆成功！");
		return result;
	}
    
    @RequestMapping(path = {"/index"})
    public String index (){
        System.out.println("index");
        return "index/index";
    }
}
