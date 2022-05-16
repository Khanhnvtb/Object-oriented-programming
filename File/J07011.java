package File;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07011 {
    static class Word {
        String word;
        int cnt;

        public Word(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }

        @Override
        public String toString() {
            return word + " " + cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        while (t-- > 0) {
            String s[] = in.nextLine().toLowerCase().split("\\W+");
            for (int i = 0; i < s.length; i++) {
                if (!lhm.containsKey(s[i])) lhm.put(s[i], 1);
                else lhm.put(s[i], lhm.get(s[i]) + 1);
            }
        }
        List<Word> l = new ArrayList<>();
        for (String s : lhm.keySet())
            if (!s.equals("")) l.add(new Word(s, lhm.get(s)));
        Collections.sort(l, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.cnt < o2.cnt) return 1;
                else if (o1.cnt == o2.cnt && o1.word.compareTo(o2.word) > 0) return 1;
                return -1;
            }
        });
        for (Word word : l) System.out.println(word);
    }
}