import java.util.ArrayList;

//本を保持するクラス
public class Library {
    ArrayList<Book> bookLists = new ArrayList<>();

//本を登録するメソッド
public void addBook(String title, String author, int year) {
        
        Book newBook = new Book(); // 空の本を作る
        newBook.title = title;     // タイトルを入れる
        newBook.author = author;   // 著者を入れる
        newBook.year = year;       // 年を入れる

        bookLists.add(newBook);     // リストに追加
        System.out.println("「" + title + "」を登録しました。");
    }

//本を表示するメソッド
public void showBooks() {
    System.out.println("書籍一覧");
    if (bookLists.size() == 0) {
        System.out.println("指定された書籍はありません。");
        return;
    }
    // リストの中身を順番に表示
   for (int i = 0; i < bookLists.size(); i++) {
            Book b = bookLists.get(i); 
            // "番号: タイトル / 著者 / 年" の形式で表示
            System.out.println(i + ": " + b.title + " / " + b.author + " / " + b.year + "年");
        }
    }

 //消去するメソッド
 // 3. 削除するメソッド
    public void removeBook(int index) {
            Book removed = bookLists.remove(index);
            System.out.println("「" + removed.title + "」を削除しました。");
        }
}

//メモ
//ArrayListは普通の配列 [] と違って、個数が決まっていないリスト。
//<Book>はリストに入れる要素をBookのみに指定
//get(i)はリストのi番目に入っているものをゲット（取得）する