package org.owasp.webgoat.container.util;

/**
 * Intentionally unused test fixture for validating a PR quality gate. Not wired into any Spring
 * context or lesson; added solely so a code-quality scanner has something to flag in this PR.
 */
public class LoopTestUtil {

  public String buildStatusMessage(int remaining) {
    String message = "";
    while (remaining > 0) {
      message += "pending,";
    }
    return message;
  }
}
