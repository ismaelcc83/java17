package dev.eltiempovuela.java17.jeps;

// JEP 398 - Deprecate the Applet API for Removal
// ==============================================
//
// The Applet API is deprecated and marked for removal in Java 17.
// If you uncomment the OldClockApplet class below, the IDE/compiler will show
// that java.applet.Applet is deprecated and marked for removal.

public class Jep398 {

  public static void execute() {
    System.out.println("JEP 398 - Deprecate the Applet API for Removal");
    System.out.println("=============================================");
    System.out.println();

    System.out.println("The Applet API is deprecated and marked for removal in Java 17.");
    System.out.println("Modern browsers no longer support Java Applets.");
    System.out.println("Uncomment the OldClockApplet class to see the deprecation warning.");
  }

  /*
  private static class OldClockApplet extends java.applet.Applet implements Runnable {

      private Thread thread;
      private java.awt.Font font;
      private String currentTime = "00:00:00";

      @Override
      public void init() {
          font = new java.awt.Font("Verdana", java.awt.Font.BOLD, 24);
      }

      @Override
      public void start() {
          if (thread == null) {
              thread = new Thread(this, "Clock");
              thread.start();
          }
      }

      @Override
      public void run() {
          Thread currentThread = Thread.currentThread();

          while (thread == currentThread) {
              java.util.Calendar calendar = java.util.Calendar.getInstance();
              java.util.Date time = calendar.getTime();

              java.text.DateFormat dateFormat = java.text.DateFormat.getTimeInstance();
              currentTime = dateFormat.format(time);

              repaint();

              try {
                  Thread.sleep(1000);
              } catch (InterruptedException exception) {
                  Thread.currentThread().interrupt();
              }
          }
      }

      @Override
      public void paint(java.awt.Graphics graphics) {
          graphics.draw3DRect(1, 1, getSize().width - 3, getSize().height - 3, false);
          graphics.setFont(font);
          graphics.drawString(currentTime, 14, 40);
      }

      @Override
      public void stop() {
          thread = null;
      }
  }
  */
}
