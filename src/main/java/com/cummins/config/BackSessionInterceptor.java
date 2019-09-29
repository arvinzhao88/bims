/*
package com.cummins.config;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cummins.bims.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class BackSessionInterceptor extends HandlerInterceptorAdapter {

	@Value("${webPath}")
	private String webPath;


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		PersonDTO person = (PersonDTO) request.getSession().getAttribute("bg_person_info");
		if (person != null) {
            logger.info("*********************  授权通过 **************");
			logger.info("userInfo : uid = " + person.getId());
			request.getSession().setAttribute(SESSION_PERSON, person);
			logger.info("*********************  授权通过 **************");

			return true;
		}else {
			String basePath = webPath.substring(0, webPath.length() - 1);
			response.sendRedirect(basePath+"/back/login");
		}
		return super.preHandle(request, response, handler);
	}


}
*/
