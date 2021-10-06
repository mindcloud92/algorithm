package xyz.dddd.algorithm.question;

import java.util.HashMap;

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
