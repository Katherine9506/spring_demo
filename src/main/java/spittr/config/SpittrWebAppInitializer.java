package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 使用Java将DispatcherServlet配置在Servlet容器中，不使用web.xml文件
 */

/**
 * 扩展AbstractAnnotation-ConfigDispatcherServletInitializer的任意类都会自动地配置Dispatcher-Servlet
 * 和Spring应用上下文，Spring的应用上下文会位于应用程序的Servlet上下文之中.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /* 指定配置类 */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /* 将DispatcherServlet映射到“/” */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
