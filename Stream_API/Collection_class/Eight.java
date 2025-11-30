package collection_class;

public class Eight {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};

        ArrayOperation sum = a -> {
            int s = 0;
            for (int v : a) s += v;
            return s;
        };

        ArrayOperation max = a -> {
            int m = a[0];
            for (int v : a) if (v > m) m = v;
            return m;
        };

        ArrayOperation min = a -> {
            int m = a[0];
            for (int v : a) if (v < m) m = v;
            return m;
        };

        ArrayOperation count = a -> a.length;
        ArrayOperation avg = a -> sum.operate(a) / a.length;
        ArrayOperation last = a -> a[a.length - 1];

        System.out.println(sum.operate(arr));
        System.out.println(max.operate(arr));
        System.out.println(min.operate(arr));
        System.out.println(count.operate(arr));
        System.out.println(avg.operate(arr));
        System.out.println(last.operate(arr));
    }
}


interface ArrayOperation {
	
	int operate(int [] arr);
}
