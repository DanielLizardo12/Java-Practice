package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * JiraConnection description.
 *
 * @author Daniel
 * @version 26/03/2024
 */
public class JiraConnection {

  final static String BASE_URL = "http://localhost:8080/rest/auth/1/session";
  final static String LOGIN_USERNAME = "daniel";
  final static String LOGIN_PASSWORD = "password";
  final static String ISSUES_URL = "http://localhost:8080/rest/api/2/search?jql=assignee=%s";

  public static void main(String[] args) {

    String loginResponse = loginToJira();

    System.out.println("Login response: " + loginResponse);
  }

  public static String loginToJira() {
    StringBuilder loginResponse = new StringBuilder();

    URL url = null;
    HttpURLConnection conn = null;

    String input = "{\"username\":\"" + LOGIN_USERNAME + "\",\"password\":\"" + LOGIN_PASSWORD + "\"}";
    BufferedReader bufferedReader = null;

    try {
      url = new URL(BASE_URL);
      conn = (HttpURLConnection) url.openConnection();

      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setDoOutput(true);

      OutputStream outputStream = conn.getOutputStream();
      outputStream.write(input.getBytes());
      outputStream.flush();

      if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String output;
        while ((output = bufferedReader.readLine()) != null) {
          loginResponse.append(output);
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (conn != null) {
        conn.disconnect();
      }
    }
    // Find the index of the "value" field
    int startIndex = loginResponse.indexOf("\"value\":\"") + "\"value\":\"".length();
    int endIndex = loginResponse.indexOf("\"", startIndex);

    // Extract the JSESSIONID substring
    String jSessionID = loginResponse.substring(startIndex, endIndex);

    System.out.println("JSESSIONID: " + jSessionID);
    System.out.println("Issues assigned to user: ");
    String issuesResponse = getIssuesAssignedToUser(LOGIN_USERNAME, jSessionID);
    System.out.println(issuesResponse);
    return loginResponse.toString();
  }

  public static String getIssuesAssignedToUser(String username, String jSessionId) {
    StringBuilder issuesResponse = new StringBuilder();
    HttpURLConnection conn = null;
    BufferedReader bufferedReader = null;

    try {
      String urlStr = String.format(ISSUES_URL, username);
      URL url = new URL(urlStr);
      conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("Accept", "application/json");

      // Add JSESSIONID token to the request header
      conn.setRequestProperty("Cookie", "JSESSIONID=" + jSessionId);

      if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String output;
        while ((output = bufferedReader.readLine()) != null) {
          issuesResponse.append(output);
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (conn != null) {
        conn.disconnect();
      }
    }

    return issuesResponse.toString();
  }

}
