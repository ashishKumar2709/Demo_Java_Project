package com.ak09;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebFilter("/*")
public class SessionFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public SessionFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		 // Set cache-control headers to prevent caching
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//http1.1
		res.setHeader("Pragma", "no-cache");//http1.0
		res.setDateHeader("Expires", 0);//proxy server
		
		HttpSession session = req.getSession(false);
		
		String requestedUri= req.getRequestURI();
		boolean isLoginPage = requestedUri.endsWith("/login.jsp");
		boolean isLoginServlet = requestedUri.endsWith("/Login");
		boolean isHomePage = requestedUri.equals(req.getContextPath() + "/");
		
		if (isLoginPage || isLoginServlet || isHomePage) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		else {
			if(session == null || session.getAttribute("emailId") == null) {
				res.sendRedirect(req.getContextPath() +"/login.jsp");
			}else {
				chain.doFilter(request, response);
			}
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
