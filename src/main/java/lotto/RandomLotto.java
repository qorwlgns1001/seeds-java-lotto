package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RandomLotto {
    public List<List<Integer>> buyLotto = new ArrayList<>();
    public void printRandomLotto(int lottoCount) {
        System.out.println(lottoCount + "개를 구매했습니다.");
        for (int i = 0; i < lottoCount; i++) {
            buyLotto.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
//            buyLotto.get(i).sort(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    if (o1 < o2){
//                        return -1;
//                    }
//                    else if (o1 == o2) {
//                        return 0;
//                    }
//                    else {
//                        return 1;
//                    }
//                }
//            });
        }

        for (List<Integer> list : buyLotto) {
            System.out.println(list);
        }
    }
}
