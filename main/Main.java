package main;

// chap03 条件分岐と繰り返し
// code03-01 天気による行動の変化をJavaで表現したもの
//public class Main {
//    public static void main(String[] args) {
//        boolean weather = true;
//        if (weather == true) {
//            System.out.println("洗濯をします");
//            System.out.println("散歩にいきます");
//        } else {
//            System.out.println("DVDを観ます");
//        }
//    }
//}
 // code03-02 while文を利用した、トイレの空きを待つ繰り返し処理
//public class Main {
//    public static void main(String[] args) {
//        boolean doorClose = true;
//        while (doorClose == true) {
//            System.out.println("ノックする");
//            System.out.println("1分間待つ");
//            break; // 書きそびれると無限ループになるので注意
//        }
//    }
//}

// code 03-03 波カッコ{}を省略した記述
//public class Main {
//    public static void main(String[] args) {
//        boolean weather = true;
//        if (weather == false) { // 内容が2行なので{}省略不可
//            System.out.println("洗濯をします");
//            System.out.println("散歩にいきます");
//        } else // 内容が1行しかない場合は{}省略可能
//            System.out.println("DVDを観ます");
//    }
//}

// code03-04 冗長でスッキリしないコード
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("あなたの運勢を占います");
//        int fortune = new java.util.Random().nextInt(4) + 1;
//
//        if (fortune == 1) {
//            System.out.println("大吉");
//        } else if (fortune == 2) {
//            System.out.println("中吉");
//        } else if (fortune == 3) {
//            System.out.println("小吉");
//        } else {
//            System.out.println("凶");
//        }
//    }
//}

// coes03-05 break文を忘れると順次にしたがって次のcase文が処理される
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("あなたの運勢を占います");
//        int fortune = 1; // 常に1
//        switch (fortune) {
//            case 1:
//                System.out.println("大吉"); // 実行される
//                // break; // 入れ忘れる
//            case 2:
//                System.out.println("中吉"); // 順次で実行される
//                break; // 実行されたのち抜ける
//            case 3:
//                System.out.println("小吉");
//                break;
//            default:
//                System.out.println("凶");
//        }
//        // 実行結果: 大吉 中吉
//    }
//}

// code03-06 あえてbreak文を書かないテクニック
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("あなたの運勢を占います");
//        int fortune = new java.util.Random().nextInt(5) + 1;
//
//        switch (fortune) {
//            case 1:
//            case 2:
//                System.out.println("いいね！");
//                break;
//            case 3:
//                System.out.println("普通です");
//                break;
//            case 4:
//            case 5:
//                System.out.println("うーん...");
//                // 敢えてbreak;を書かない
//        }
//    }
//}

// code03-07 基本的なfor文のサンプル
// こんにちは を10回繰り返し表示させる
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//        System.out.println("こんにちは");
//    }
//}

// code03-08
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//              System.out.println("現在" + (i +1) + "周目です");
//        }
//    }
//}

// code03-09 for文のループを2重にして九九の表を出力する
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i * j);
                System.out.println(" "); // 半角スペースを入れる
            }
            System.out.println("\n"); // 改行を挿入する
        }

    }
}
