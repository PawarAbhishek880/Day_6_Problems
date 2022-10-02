import java.util.ArrayList;

public class CouponNo {

    static int coupon (ArrayList<Integer> v)
    {

        int n = v.size();
        int num = (int)(Math.random() * n);
        v.set(num, v.get(n - 1));
        v.remove(n - 1);
        return num;
    }
    static void Random(int n)
    {
        ArrayList<Integer> v = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
            v.add(i + 1);


        while (v.size() > 0)
        {
            System.out.print(coupon(v) + " ");
        }
    }
    public static void main(String []args)
    {

        int n = 8;
        Random(n);
    }
}
