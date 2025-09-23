// 11th pattern

// public class Pattern11 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("(" + i + "," + j + ") ");
//             }
//             System.out.println();
//         }
//     }
// }


// 12th pattern

// public class Pattern12 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int x = i;
//             for (int j = 1; j <= n; j++) {
//                 System.out.print(x + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//13th pattern

// public class Pattern13 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int x = i;
//             int y = n - i + 1;
//             for (int j = 1; j <= n; j++) {
//                 if (j % 2 == 1) {
//                     System.out.print(x + " ");
//                 } else {
//                     System.out.print(y + " ");
//                 }
//                 x = x + n;
//                 y = y + n;
//             }
//             System.out.println();
//         }
//     }
// }


// 14th pattern

// public class Pattern14 {
//     public static void main(String[] args) {
//         int n = 5;
//         int x = 1; // must initialize before loop
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print(x + " ");
//             }
//             x = x + n;
//             System.out.println();
//         }
//     }
// }


// 15th pattern

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int x = i;
            int y = n - i + 1;
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print(x + " ");
                } else {
                    System.out.print(y + " ");
                }
                x = x + n;
                y = y + n;
            }
            System.out.println();
        }
    }
}

