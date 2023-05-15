## Servlet Config
A servlet configuration object used by a servlet container to pass information to a servlet during initialization.
For every Servlet class in our application, the web container will create one ServletConfig object and the web container will pass this object as an argument to the public void init(ServletConfig config) method of our Servlet class object. ServletConfig object is obtained by *getServletConfig()* method.

## Servlet Context
ServletContext is the object created by Servlet Container to share initial parameters or configuration information to the whole application. ServletContext object is obtained by *getServletContext()* method.

We can define the initialization parameters by using initParams and the @WebInitParam annotations.

Please note that we've used HttpServletRequest's getParameter() method to retrieve the data from the HTML form, and the getInitParameter() method to access the servlet initialization parameters.

Further Readings: - https://www.baeldung.com/context-servlet-initialization-param

