package com.Adam.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequestMapping("/member")
@Controller
@RequiredArgsConstructor
public class MemberController {

	// 일반회원가입 화면
	@GetMapping(value = "/membernew")
	public String memberForm() {
		return "member/memberForm";
	}

	// 대표회원가입 화면
	@GetMapping(value = "/adminnew")
	public String adinForm() {
		return "member/adminForm";
	}

	// 로그인 화면
	@GetMapping(value = "/login")
	public String loginMember() {
		return "member/memberLoginForm";
	}

	// 로그인 후 메인 화면

	@GetMapping(value = "/userMain")
	public String userMain() {
		return "member/userMain";
	}

	// 로그인을 실패했을때
	@GetMapping(value = "/login/error")
	public String loginError(Model model) {
		model.addAttribute("loginErrorMsg", "아이디 또는 비밀번호를 확인해주세요.");
		return "member/memberLoginForm";
	}
}
