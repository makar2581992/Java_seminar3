import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Linked
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        
        for (int i = 0; i < 10000; i++)
        {
            list.add(i, i);

        }

    }

    public static void get10000(List list)
    {
        
        for (int i = 0; i < 10000; i++)
        {
            list.get(i);
        }
    }

    public static void set10000(List list)
    {
        
        for (int i = 0; i < 10000; i++)
        {
            list.set(i, "s");

        }
    }

    public static void remove10000(List list)
    {
        
        for (int i = list.size()-1; i >= 0; i--)
        {
            list.remove(i);

        }
        System.out.println(list);
    }

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }
    public static long  getTimeMsOfInsert(List list)
    {
        
        Date timeBefore = new Date();
        insert10000(list);
        
        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
    }
    
    {
        for (int i=0;i<10000;i++)
        {
            List.add(0, new Object());
        }
    }
}