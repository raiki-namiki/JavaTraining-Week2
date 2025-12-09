import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 図書管理システム ===");
            System.out.println("1: 書籍を登録する");
            System.out.println("2: 書籍一覧を表示する");
            System.out.println("3: 書籍を削除する");
            System.out.println("0: 終了");
            System.out.print("メニュー番号を入力してください > ");

            int choice = scanner.nextInt();
          
            scanner.nextLine(); 

            if (choice == 1) {

                System.out.println("【書籍の登録】");
                
                System.out.print("タイトルを入力してください > ");
                String title = scanner.nextLine(); // 文字列を入力

                System.out.print("著者名を入力してください > ");
                String author = scanner.nextLine(); // 文字列を入力

                System.out.print("出版年を入力してください(数字) > ");
                int year = scanner.nextInt();       // 数字を入力

                // 入力されたデータから登録
                library.addBook(title, author, year);
                
            } else if (choice == 2) {
                // 書籍一覧
                library.showBooks();
                
            } else if (choice == 3) {

                // 書籍を削除する
                System.out.println("【書籍の削除】");
                System.out.print("削除したい本の番号を入力してください > ");
                int index = scanner.nextInt();
                library.removeBook(index);
                
            } else if (choice == 0) {
                System.out.println("プログラムを終了します。");
                break;
                
            } else {
                System.out.println("適切な数値を入力してください。");
            }
        }
    }
}