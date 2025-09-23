// 6th pattern

// public class Pattern6 {
//     public static void main(String[] args) {
//         int k = 1; 
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print(k + " ");
//                 k += 2;
//             }
//             System.out.println();
//         }
//     }
// }

// 7th pattern

// public class Pattern7 {
//     public static void main(String[] args) {
//         int k = 2;
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print(k + " ");
//                 k += 2;
//             }
//             System.out.println();
//         }
//     }
// }


// 8th pattern

// public class Pattern8 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// 9th pattern

// public class Pattern9 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) { // fixed loop condition
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// 10th pattern

// public class Pattern10 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print(i * j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//10th pattern

public class Pattern10B {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " " + i + " "); // fixed concatenation
            }
            System.out.println();
        }
    }
}



