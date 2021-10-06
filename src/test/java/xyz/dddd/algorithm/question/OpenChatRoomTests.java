package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OpenChatRoomTests {

  private static OpenChatRoom openChatRoom;

  @BeforeAll
  public static void setUp() {
    openChatRoom = new OpenChatRoom();
  }

  @Test
  public void given_Commands_when_FormatActionMessage_then_ActionMessages() {
    String[] commands = {
        "Enter uid1234 Muzi",
        "Enter uid4567 Prodo",
        "Leave uid1234",
        "Enter uid1234 Prodo",
        "Change uid4567 Ryan"
    };

    String[] actual = openChatRoom.solve(commands);

    String[] expected = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
    assertArrayEquals(expected, actual);
  }

}
