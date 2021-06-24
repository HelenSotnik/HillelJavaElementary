package hillel.elementary.homework6;

import java.util.*;

public class InitializationData {
    private Information info;

    public InitializationData() {
        info = new Information();
    }

    public Information fillTheData() {
        Map<String, String> emailNicknameMap = new HashMap<>();
        emailNicknameMap.putAll(fillEmailNicknameMap());

        List<String> nicknames = new ArrayList<>();
        nicknames.addAll(emailNicknameMap.values());

        Set<String> emails = new HashSet<>();
        emails.addAll(emailNicknameMap.keySet());

        String emailToFill = "z@gmail.com";
        String nicknameToFill = "z";

        for (int i = 0; i < 10; i++) {
            nicknames.add(nicknameToFill);
            emails.add(emailToFill);
            emailNicknameMap.put(emailToFill, nicknameToFill);
        }

        info.setNicknameList(nicknames);
        info.setEmailSet(emails);
        info.setEmailNicknameMap(emailNicknameMap);

        if (checkSizeEquality(info) == false) {
            correctSize(info.getNicknameList());
        }
        return info;
    }

    public Map<String, String> fillEmailNicknameMap() {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 30; i++) {
            map.put("a" + i + ".gmail.com", "a" + i);
        }
        return map;
    }

    private List<String> correctSize(List<String> list) {
        Set<String> uniqueNicknameSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueNicknameSet);
        return list;
    }

    private boolean checkSizeEquality(Information info) {
        if (info.getNicknameList().size() == info.getEmailSet().size()
                && info.getEmailSet().size() == info.getEmailNicknameMap().size()) {
            return true;
        }
        return false;
    }
}
