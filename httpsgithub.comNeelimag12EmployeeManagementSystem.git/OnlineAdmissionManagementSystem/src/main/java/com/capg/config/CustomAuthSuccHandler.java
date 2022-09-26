//package com.capg.config;
//
//import java.io.IOException;
//import java.util.Set;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//
//public class CustomAuthSuccHandler implements AuthenticationSuccessHandler{
//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws IOException, ServletException {
//
//		Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
//
//		if (roles.contains("ROLE_ADMIN")) {
//			response.sendRedirect("/admin/");
//
//		} else {
//			response.sendRedirect("/user/");
//		}
//
//
//}