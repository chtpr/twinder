package io.swagger.client.constants;


/**
 * Class for the environment constants. Thought a class would be appropriate to
 * use in this case because the constants between the two parts should never
 * be different.
 */
public final class EnvironmentConstants {
  public static final String LOCAL_PATH = "http://localhost:8080/twinderservlet/";
  public static final String LOCAL_PATH_HW2 = "http://localhost:8080/twinderservlet2/";
  public static final String LOCAL_GET_PATH = "http://localhost:8080/getservlet/";
  public static final String IP_TOMCAT1 = "52.38.143.93";
  public static final String IP_TOMCAT2 = "34.219.150.62";
  public static final String AWS_HW1 = String.format("http://%s:8080/twinderservlet/", IP_TOMCAT1);
  public static final String TOMCAT_1 = String.format("http://%s:8080/twinderservlet2/", IP_TOMCAT1);
  public static final String TOMCAT_2 = String.format("http://%s:8080/twinderservlet2/", IP_TOMCAT2);
  public static final String LOAD_BALANCER = "http://tomcat-network-acff0945bf37a74d.elb.us-west-2.amazonaws.com/twinderservlet2/";
  public static final String GET_SERVER = String.format("http://%s:8080/getservlet/", IP_TOMCAT2);
  public static final int NUM_THREADS = 100;
  public static final int NUM_REQUESTS = 5000;
  public static final int TOTAL_REQUESTS = NUM_REQUESTS * NUM_THREADS;
  public static final int ATTEMPTS = 5;
}
