package TP_05;

public class MessageCoder {
      private static final String[] ENCODED_CHARS = {"\n", "\t", "\\", "//", ":)"};
      private static final String[] DECODED_CHARS = {"(new_line)", "(tab)", "(slash)", "(comment_line)", "(smile)"};

      public static String encode(String message) {
            for (int i = 0; i < ENCODED_CHARS.length; i++) {
                  message = message.replace(ENCODED_CHARS[i], DECODED_CHARS[i]);
            }
            return message;
      }

      public static String decode(String encodedMessage) {
            for (int i = 0; i < DECODED_CHARS.length; i++) {
                  encodedMessage = encodedMessage.replace(DECODED_CHARS[i], ENCODED_CHARS[i]);
            }
            return encodedMessage;
      }
}
