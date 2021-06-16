package hillel.elementary.homework6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        InitializationData initializationData = new InitializationData();
        Information information = initializationData.fillTheData();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(78);
        arrayList.add(3);
        arrayList.add(8);

        Information newInfo = additionStrings(arrayList, information);

        System.out.println("Email set size: " + newInfo.emailSet.size());
        System.out.println("Email-Nickname map size: " + newInfo.emailNicknameMap.size());
        System.out.println("Nickname list size " + newInfo.nicknameList.size());

    }

    public static Information additionStrings(List<? extends Number> intList, Information info) {

        List<String> newNicknameList = info.getNicknameList();
        Set<String> newEmailSet = info.getEmailSet();
        Map<String, String> newEmailNicknameMap = info.getEmailNicknameMap();

        for (int i = 0; i < intList.size(); i++) {
            String nickname = String.valueOf(intList.get(i));

            newNicknameList.add(nickname);
            newEmailSet.add(nickname + "@mail.ua");
            newEmailNicknameMap.put(nickname + "@mail.ua", nickname);
        }

        Set<String> nicknameSet = new HashSet<>(newNicknameList);
        newNicknameList.clear();
        nicknameSet.addAll(newNicknameList);
        newNicknameList.addAll(nicknameSet);

        info.setNicknameList(newNicknameList);
        info.setEmailSet(newEmailSet);
        info.setEmailNicknameMap(newEmailNicknameMap);
        return info;
    }
}
