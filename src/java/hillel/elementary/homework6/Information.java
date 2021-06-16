package hillel.elementary.homework6;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {

    List<String> nicknameList;
    Set<String> emailSet;
    Map<String,String> emailNicknameMap;

    public List<String> getNicknameList() {
        return nicknameList;
    }

    public void setNicknameList(List<String> nicknameList) {
        this.nicknameList = nicknameList;
    }

    public Set<String> getEmailSet() {
        return emailSet;
    }

    public void setEmailSet(Set<String> emailSet) {
        this.emailSet = emailSet;
    }

    public Map<String, String> getEmailNicknameMap() {
        return emailNicknameMap;
    }

    public void setEmailNicknameMap(Map<String, String> emailNicknameMap) {
        this.emailNicknameMap = emailNicknameMap;
    }
}
