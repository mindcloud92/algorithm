package xyz.dddd.algorithm.question;

import java.util.HashMap;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/42888">"오픈 채팅방"</a></h1>
 * <p>· 문제: 채팅방에 들어오고 나가거나, 닉네임을 변경한 기록이 담긴 문자열 배열 record를
 * 최종적으로 방을 개설한 사람이 보게 되는 메시지를 문자열 배열 형태로 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>record 길이: 1 이상, 100,000 이하</li>
 *   <li>record에 담긴 문자열</li>
 *   <ul>
 *     <li>[유저 아이디] 사용자가 [닉네임]으로 채팅방에 입장한경우 = "Enter [유저 아이디] [닉네임]"</li>
 *     <li>[유저 아이디] 사용자가 채팅방에서 퇴장한 경우 = "Leave [유저 아이디]"</li>
 *     <li>[유저 아이디] 사용자가 닉네임을 [닉네임]으로 변경한 경우 = "Change [유저 아이디] [닉네임]"</li>
 *     <li>첫 단어는 Enter, Leave, Change 중 하나</li>
 *     <li>각 단어는 공백으로 구분</li>
 *     <li>구성: 알파벳 대문자, 소문자, 숫자</li>
 *     <li>유저 아이디와 닉네임의 길이: 1 이상 10 이하</li>
 *   </ul>
 *   <li>닉네임을 변경할 때는 기존에 채팅방에 출력되어 있던 메시지의 닉네임도 전부 변경</li>
 *   <li>메시지 형식</li>
 *   <ul>
 *     <li>채팅방에 누군가 들어온 경우 = "[닉네임]님이 들어왔습니다."</li>
 *     <li>채팅방에 누군가 나간 경우 = "[닉네임]님이 나갔습니다."</li>
 *   </ul>
 * </ol>
 */
enum Command {

  Enter("Enter", "들어왔습니다"),
  Leave("Leave", "나갔습니다"),
  Change("Change");

  private final String value;

  private final String action;

  Command(final String value) {
    this(value, null);
  }

  Command(final String value, final String action) {
    this.value = value;
    this.action = action;
  }

  public String getAction() {
    return this.action;
  }

  public String getValue() {
    return this.value;
  }

}


public class OpenChatRoom {

  public String[] solve(final String[] record) {
    HashMap<String, String> idMap = getIdMap(record);

    String[] messages = new String[record.length];
    int index = 0;
    for (String r : record) {
      String[] commands = r.split(" ");

      String action = commands[0];
      String id = commands[1];
      if (action.equals(Command.Change.getValue()) || !idMap.containsKey(id)) {
        continue;
      }

      messages[index] = String.format(
          "%s님이 %s.", idMap.get(id), Command.valueOf(action).getAction());
      index++;
    }

    return slice(messages, index);
  }

  private String[] slice(final String[] target, final int size) {
    String[] result = new String[size];

    int index = 0;
    for (String s : target) {
      if (s == null) {
        continue;
      }

      result[index] = s;
      index++;
    }

    return result;
  }

  private HashMap<String, String> getIdMap(final String[] target) {
    HashMap<String, String> idMap = new HashMap<>();
    for (String s : target) {
      if (s.startsWith(Command.Leave.getValue())) {
        continue;
      }

      String[] commands = s.split(" ");

      String id = commands[1];
      String name = commands[2];

      idMap.put(id, name);
    }

    return idMap;
  }

}
