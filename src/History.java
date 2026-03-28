import java.util.ArrayList;
public class History
{
    ArrayList<String> historyList = new ArrayList<>();
    public void add(String record){
        historyList.add(record);
    }
    public void show()
    {
        if(historyList.isEmpty())
        {
            System.out.println("No History");
        }
        else
        {
            System.out.println(historyList);
        }
    }
    public void clear(){
        historyList.clear();
        System.out.println("History Cleared");
    }
}



