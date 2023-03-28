package Question6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class SearchImp {
    @Autowired
    private SortAlgo sortAlgo;

    public SearchImp(SortAlgo sortAlgo)
    {
        super();
        this.sortAlgo = sortAlgo;
    }

    public int searchNumber(int[] numbers, int num)
    {
        sortAlgo.sort(new int[]{3, 7, 1, 9});
        System.out.println(sortAlgo.getAlgoName());
        return 1;
    }

}

interface SortAlgo{
    public String getAlgoName();
    public int[] sort(int[] num);


}

@Component
 class MergeSortAlgo implements SortAlgo{

    public String getAlgoName()
    {
        return "Using Merge Algorithm";
    }
    public int[] sort(int[] numbers)
    {
        return numbers;
    }
}


@Component
@Primary
  class QuickSortAlgo implements SortAlgo {

    public String getAlgoName()
    {
        return "Using Quick Algorithm";
    }
    public int[] sort(int[] numbers)
    {
        return numbers;
    }
}


