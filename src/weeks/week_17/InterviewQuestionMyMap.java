package weeks.week_17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewQuestionMyMap {
    public static void main(String[] args) {

        String resume = "tarik yaklasik 5 yildir Amazonda calisiyorum java ile su projeyi yaptim" +
                "sonra yine java kullanarak su projede yer aldim " +
                "selenium Java ve TestNG dersleri vererek Inar Academy ogerencilerinin testing ise girmesinde yardimci olmaya selenium calistim";

        Set<String> jobDescriptionKeys = new HashSet<>();
        jobDescriptionKeys.add("selenium");
        jobDescriptionKeys.add("testing");
        jobDescriptionKeys.add("java");

        interviewQuestion(resume, jobDescriptionKeys);

    }

    private static void interviewQuestion(String resume, Set<String> jd) {
        Map<String, Integer> map = new HashMap<>();
        String[] resumeArr = resume.toLowerCase().split("\\s");
        for (String word : resumeArr) {
            if (jd.contains(word)) {
                if (map.containsKey(word)) {
                    int number = map.get(word);
                    map.put(word, number + 1);
                } else {
                    map.put(word, 1);
                }

            }
        }
        print(map);
    }

    private static void print(Map map) {
        Set<String> set = map.keySet();
        for(String key : set){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
