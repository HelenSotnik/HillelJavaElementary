package hillel.elementary.homework6;

import java.util.*;

public class InitializationData {

    private Information info;

    public InitializationData() {
        info = new Information();
    }

    public Information fillTheData() {
        info.nicknameList = new ArrayList<>();
        info.emailSet = new HashSet<>();
        info.emailNicknameMap = new HashMap<>();

        String emailToFill = "z@gmail.com";
        String nicknameToFill = "z";

        for (int i = 0; i < 10; i++) {
            info.nicknameList.add(nicknameToFill);
            info.emailSet.add(emailToFill);
            info.emailNicknameMap.put(emailToFill, nicknameToFill);
        }

        info.emailNicknameMap.putAll(fillEmailNicknameMap());
        info.nicknameList.addAll(info.emailNicknameMap.values());
        info.emailSet.addAll(info.getEmailNicknameMap().keySet());

        if (checkSizeEquality(info) == false) {
            correctSize(info.nicknameList);
        }
        return info;
    }

    public Map<String, String> fillEmailNicknameMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a1.gmail.com", "a1");
        map.put("a2.gmail.com", "a2");
        map.put("a3.gmail.com", "a3");
        map.put("a4.gmail.com", "а4");
        map.put("a5.gmail.com", "a5");
        map.put("a6.gmail.com", "a6");
        map.put("a7.gmail.com", "a7");
        map.put("a8.gmail.com", "a8");
        map.put("a9.gmail.com", "a9");
        map.put("a10.gmail.com", "a10");
        map.put("a11.gmail.com", "a11");
        map.put("a12.gmail.com", "a12");
        map.put("a13.gmail.com", "a13");
        map.put("a14.gmail.com", "a14");
        map.put("a15.gmail.com", "a15");
        map.put("a16.gmail.com", "a16");
        map.put("a17.gmail.com", "a17");
        map.put("a18.gmail.com", "a18");
        map.put("a19.gmail.com", "a19");
        map.put("a20.gmail.com", "a20");
        map.put("a21.gmail.com", "a21");
        map.put("a22.gmail.com", "a22");
        map.put("a23.gmail.com", "a23");
        map.put("a24.gmail.com", "a24");
        map.put("a25.gmail.com", "a25");
        map.put("a26.gmail.com", "a26");
        map.put("a27.gmail.com", "a27");
        map.put("a28.gmail.com", "a28");
        map.put("a29.gmail.com", "a29");
        map.put("a30.gmail.com", "a30");
        return map;
    }

    private List<String> correctSize(List<String> list) {
        Set<String> uniqueNicknameSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueNicknameSet);
        return list;
    }

    private boolean checkSizeEquality(Information info) {
        if (info.nicknameList.size() == info.emailSet.size()
                && info.emailSet.size() == info.emailNicknameMap.size()) {
            return true;
        }
        return false;
    }
}
